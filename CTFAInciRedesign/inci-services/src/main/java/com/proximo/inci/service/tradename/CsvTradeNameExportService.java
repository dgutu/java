/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.service.tradename;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.SocketException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import oracle.jdbc.OracleTypes;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.DOList;
import com.proximo.inci.DOLookupValue;
import com.proximo.inci.DOTradeName;
import com.proximo.inci.DbConnectionManager;
import com.proximo.inci.common.TDate;
import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.exception.InciException;
import com.proximo.inci.service.common.LookupService;
import com.proximo.inci.service.security.SecurityService;
import com.proximo.inci.service.security.user.User;
import com.proximo.inci.service.security.user.UserCompany;

public class CsvTradeNameExportService {

    private static Logger logger = LoggerFactory.getLogger(CsvTradeNameExportService.class);
    
    private static final SimpleDateFormat SINGLE_TN_EXPORT_SIMPLE_DATE_FORMAT = new SimpleDateFormat("MMddyyhhmmss");

    public final static String JNDI_EXPORT_FTP_HOST = "java:comp/env/export/ftp/host";
    public final static String JNDI_EXPORT_FTP_USERNAME = "java:comp/env/export/ftp/username";
    public final static String JNDI_EXPORT_FTP_PASSWORD = "java:comp/env/export/ftp/password";
    public final static String JNDI_EXPORT_FTP_DIRECTORY = "java:comp/env/export/ftp/dir";

    private static final String exportFtpHost;
    private static final String exportFtpUsername;
    private static final String exportFtpPassword;
    private static final String exportFtpDirectory;

    static {
        logger.info("Initializing Csv Trade Name Export service");
        try {
            Context ctx = new InitialContext();

            exportFtpHost = (String) ctx.lookup(JNDI_EXPORT_FTP_HOST);
            exportFtpUsername = (String) ctx.lookup(JNDI_EXPORT_FTP_USERNAME);
            exportFtpPassword = (String) ctx.lookup(JNDI_EXPORT_FTP_PASSWORD);
            exportFtpDirectory = (String) ctx.lookup(JNDI_EXPORT_FTP_DIRECTORY);
        } catch (NamingException e) {
            logger.error("Unable to retrieve Csv Trade Name Export service's JNDI initialization parameters", e);
            //throw new InciException();
            throw new RuntimeException(e);
        }

        logger.info("Finished initializing Csv Trade Name Export service");
    }

    /** Not intended to be instantiated. Exposed only static members. */
    private CsvTradeNameExportService() {
    }

    public static String generateMultipleTNExportResultFileName() {
        return "InciApps_" + System.currentTimeMillis() + ".txt";
    }
    
    public static String generateSingleTNExportResultFileName(DOTradeName formTn) {
        return formTn.tnNumber + "_"  + SINGLE_TN_EXPORT_SIMPLE_DATE_FORMAT.format(new Date()) + ".txt";
    }    

    public static byte[] exportTradeNames(String userId, TDate assignmentStartDt, TDate assignmentEndDt) {
        logger.debug("Entering exportTradeNames(userId={}, assignmentStartDt={}, assignmentEndDt={})", new Object[] {
                userId, assignmentStartDt.toString(), assignmentEndDt.toString() });

        byte[] result = new byte[] {};

        Connection conn = null;
        CallableStatement cs = null;
        ResultSet rs = null;

        try {
            Date nowDate = new Date();
            
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PrintStream pw = new PrintStream(baos);

            conn = DbConnectionManager.getConnection();

            cs = conn.prepareCall("{? = call TRADE_NAME_MGMT.export_Trade_Names(?,?,?)}");

            cs.setDate(2, assignmentStartDt.getSqlDate());
            cs.setDate(3, assignmentEndDt.getSqlDate());

            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.registerOutParameter(4, OracleTypes.NUMBER);

            cs.execute();

            int count = cs.getInt(4);

            fillMultipleTNExportHeader(pw, nowDate, count);
            pw.print("\n\r");
            fillColumnNames(pw);

            rs = (ResultSet) cs.getObject(1);
            while (rs.next()) {
                long recID = rs.getLong(1);
                DOTradeName tnForm = TradeNameService.getTradeName(recID, userId);
                String catName = rs.getString(2);
                fillTradeNameData(tnForm, catName, pw);
            }

            fillMultipleTNExportFooter(pw, nowDate, count);

            result = baos.toByteArray();

            pw.close();
        } catch (SQLException e) {
            logger.error("Error exporting trade names: ", e);
            //throw new InciException();
            throw new RuntimeException(e);
        } finally {
            DbConnectionManager.freeResources(conn, cs, rs);
        }

        logger.debug("Leaving exportTradeNames(...): result.length={}", result.length);
        return result;
    }
    
    public static byte[] exportSingleTradeName(DOTradeName formTn) {
        byte[] result = new byte[] {};
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream pw = new PrintStream(baos);
        
        fillColumnNames(pw);
        fillTradeNameData(formTn, formTn.catName, pw);
        
        result = baos.toByteArray();

        pw.close();        
        
        return result;
    }

    public static void uploadExportResultFile(byte[] fileContent, String fileName) {
        try {
            FTPClient ftpClient = new FTPClient();

            ftpClient.connect(exportFtpHost);
            ftpClient.login(exportFtpUsername, exportFtpPassword);

            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);

            ftpClient.changeWorkingDirectory(exportFtpDirectory);

            ftpClient.storeFile(fileName, new ByteArrayInputStream(fileContent));

            ftpClient.logout();
            ftpClient.disconnect();
        } catch (SocketException e) {
            logger.error("Error uploading export result file: ", e);
            //throw new InciException();
            throw new RuntimeException(e);
        } catch (IOException e) {
            logger.error("Error uploading export result file", e);
            //throw new InciException();
            throw new RuntimeException(e);
        }
    }

    /** Prints header. */
    private static void fillMultipleTNExportHeader(PrintStream pw, Date date, int exportedTradeNamesCount) {
        pw.print(createMultipleTNExportMetadataLineText(date, exportedTradeNamesCount));
    }

    /** Prints footer. */
    private static void fillMultipleTNExportFooter(PrintStream pw, Date date, int exportedTradeNamesCount) {
        pw.print(createMultipleTNExportMetadataLineText(date, exportedTradeNamesCount));
    }

    /** Used for header/footer. */
    private static String createMultipleTNExportMetadataLineText(Date date, int exportedTradeNamesCount) {
        return "Exported at: " + date.toString() + " Total: " + exportedTradeNamesCount + " trade names";
    }

    /** Prints column names. */
    private static void fillColumnNames(PrintStream pw) {
        pw.print("Ingredient" + "\t");                     // 1.	Ingredient
        pw.print("Ingredient Description" + "\t");         // 2.	Ingredient  Description
        pw.print("Anticipated Review Date" + "\t");        // 3.	Anticipated Review Date
        pw.print("Trade Name" + "\t");                     // 4.	Trade Name
        pw.print("Application Number" + "\t");             // 5.	Application Number
        pw.print("Category" + "\t");                       // 6.	Category
        pw.print("Suggested Nomenclature" + "\t");         // 7.	Suggested Nomenclature
        pw.print("Empirical Formula" + "\t");              // 8.	Empirical Formula
        pw.print("CAS Number" + "\t");                     // 9.	CAS Number
        pw.print("EINECS Number" + "\t");                  // 10.	EINECS/ELINCS Number
        pw.print("Chemical Synonyms" + "\t");              // 11.	Chemical Synonyms
        pw.print("Functions" + "\t");                      // 12.	Functions
        pw.print("Other Functions" + "\t");                // 13.	Other Functions
        pw.print("Manufacturing Method" + "\t");           // 14.	Manufacturing Method
        pw.print("Composition Statement" + "\t");          // 15.	Composition Statement
        pw.print("Solvents" + "\t");                       // 16.	Solvents
        pw.print("Genus" + "\t");                          // 17.	Genus and Species
        pw.print("Material" + "\t");                       // 18.	Identity of Material
        pw.print("Process after Fermentation" + "\t");     // 19.	Process after Fermentation
        pw.print("Reference" + "\t");                      // 20.	Reference
        pw.print("User Response Comments" + "\t");         // 21.	User Responses
        pw.print("Admin Comments" + "\t");                 // 22.	Admin Comments ???             
        pw.print("Species" + "\t");                        // 23.	Species
        pw.print("Plant Part" + "\t");                     // 24.	Plant Part
        pw.print("Prep Type" + "\t");                      // 25.	Preparation Type
        pw.print("Inci Name" + "\t");                      // 26.	INCI Name
        pw.print("Printed for Staff Review Date" + "\t");  // 27.	Review Date
        pw.print("User First Name" + "\t");                // 28.	User First Name
        pw.print("User Last Name" + "\t");                 // 29.	User Last Name
        pw.print("User Email" + "\t");                     // 30.	User Email ???
        pw.print("Company Name" + "\t");                   // 31.	Company Name
        pw.print("Company Address1" + "\t");               // 32.	Company Address1
        pw.print("Company Address2" + "\t");               // 33.	Company Address2
        pw.print("Company Address3" + "\t");               // 34.	Company Address3
        pw.print("Company City" + "\t");                   // 35.	Company City
        pw.print("Company State" + "\t");                  // 36.	Company State
        pw.print("Company Zip" + "\t");                    // 37.	Company Zip
        pw.print("Company Country" + "\t");                // 38.	Company Country
        pw.print("Company Phone" + "\t");                  // 39.	Company Phone
        pw.print("Company Fax" + "\t");                    // 40.	Company Fax
        pw.print("Company Supplier ID" + "\t");            // 41.	Company Supplier ID
        pw.print("Publication Comp Company Name" + "\t");  // 42.	Publication Comp Name
        pw.print("Publication Comp Address 1" + "\t");     // 43.	Publication Comp Address1
        pw.print("Publication Comp Address 2" + "\t");     // 44.	Publication Comp Address2
        pw.print("Publication Comp Address 3" + "\t");     // 45.	Publication Comp Address3
        pw.print("Publication Comp City" + "\t");          // 46.	Publication Comp City
        pw.print("Publication Comp State" + "\t");         // 47.	Publication Comp State
        pw.print("Publication Comp Zip" + "\t");           // 48.	Publication Comp Zip
        pw.print("Publication Comp Country" + "\t");       // 49.	Publication Comp Country
        pw.print("Publication Comp Phone" + "\t");         // 50.	Publication Comp Phone
        pw.print("Publication Comp Fax" + "\t");           // 51.	Publication Comp Fax
        pw.print("Publication Comp Supplier ID" + "\t");   // 52.	Publication Comp Supplier ID
        pw.print("Additional Text" + "\t");                // 53.	Additional Text
        pw.print("Submit Date" + "\t");                    // 54.	Submit Date
        pw.print("Export Date" + "\t");                    // 55.	Export Date
        pw.print("Structure Required" + "\t");             // 56.	Structure Required
        pw.print("Archived" + "\t");                       // 57.	Archived
        pw.print("Published" + "\t");                      // 58.	Published
        pw.print("Submitted" + "\t");                      // 59.	Submitted
        pw.print("Approved" + "\t");                       // 60.	Approved
        pw.print("Export To Committee" + "\t");            // 61.	Export to Committee
        pw.print("Mono ID" + "\t");                        // 62.	MonoID
        pw.print("\n\r");                                   
    }

    private static void fillTradeNameData(DOTradeName tnForm, String catName, PrintStream pw) {
        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(tnForm.ingredient, "\t", ""), "\n", "") + "\t");  // 1.	Ingredient
        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(tnForm.ingredDesc, "\t", ""), "\n", "") + "\t");  // 2.	Ingredient  Description
        pw.print(tnForm.reviewDt.formatIt(TDate.MMDDYYYY) + "\t");                                               // 3.	Anticipated Review Date     
        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(tnForm.tradeName, "\t", ""), "\n", "") + "\t");   // 4.	Trade Name

        tnForm.catName = catName;
        
        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(tnForm.tnNumber, "\t", ""), "\n", "") + "\t");     // 5.	Application Number        
        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(tnForm.catName, "\t", ""), "\n", "") + "\t");      // 6.	Category
        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(tnForm.nomenclature, "\t", ""), "\n", "") + "\t"); // 7.	Suggested Nomenclature
        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(tnForm.formula, "\t", ""), "\n", "") + "\t");      // 8.	Empirical Formula
        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(tnForm.CASNumber, "\t", ""), "\n", "") + "\t");    // 9.	CAS Number
        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(tnForm.EINECSNumber, "\t", ""), "\n", "") + "\t"); // 10.	EINECS/ELINCS Number
        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(tnForm.chemSynonyms, "\t", ""), "\n", "") + "\t"); // 11.	Chemical Synonyms

        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(constructFunctionStr(tnForm), "\t", ""), "\n", "") + "\t"); // 12.	Functions
        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(tnForm.otherFunctions, "\t", ""), "\n", "") + "\t");        // 13.	Other Functions
        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(tnForm.mfgMehod, "\t", ""), "\n", "") + "\t");              // 14.	Manufacturing Method
        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(tnForm.compStmt, "\t", ""), "\n", "") + "\t");              // 15.	Composition Statement 
        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(tnForm.solvents, "\t", ""), "\n", "") + "\t");              // 16.	Solvents
        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(tnForm.genus, "\t", ""), "\n", "") + "\t");                 // 17.	Genus and Species 
        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(tnForm.material, "\t", ""), "\n", "") + "\t");              // 18.	Identity of Material 
        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(tnForm.process, "\t", ""), "\n", "") + "\t");               // 19.	Process after Fermentation

        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(tnForm.reference, "\t", ""), "\n", "") + "\t");             // 20.	Reference
        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(tnForm.other1, "\t", ""), "\n", "") + "\t");                // 21.	User Responses
        
        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(tnForm.adminComments, "\t", ""), "\n", "") + "\t");         // 22.	Admin Comments   
        
        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(tnForm.species, "\t", ""), "\n", "") + "\t");               // 23.	Species
        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(tnForm.plantPart, "\t", ""), "\n", "") + "\t");             // 24.	Plant Part
        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(tnForm.prepare, "\t", ""), "\n", "") + "\t");               // 25.	Preparation Type

        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(tnForm.inciName, "\t", ""), "\n", "") + "\t");              // 26.	INCI Name
        pw.print(tnForm.inciNameDt.formatIt(TDate.MMDDYYYY) + "\t");                                                       // 27.	Review Date

        User user = SecurityService.findUserByRecId(tnForm.userRecId);
        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(user.getFirstName(), "\t", ""), "\n", "") + "\t");          // 28.	User First Name
        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(user.getLastName(), "\t", ""), "\n", "") + "\t");           // 29.	User Last Name 
        
        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(user.getEmail(), "\t", ""), "\n", "") + "\t");              // 30.	User Email 
        
        UserCompany userCompany = user.getUserCompany();
        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(userCompany.getCompanyName(), "\t", ""), "\n", "")          // 31.	Company Name
                + "\t");
        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(userCompany.getAddress1(), "\t", ""), "\n", "") + "\t");    // 32.	Company Address1
        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(userCompany.getAddress2(), "\t", ""), "\n", "") + "\t");    // 33.	Company Address2
        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(userCompany.getAddress3(), "\t", ""), "\n", "") + "\t");    // 34.	Company Address3
        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(userCompany.getCity(), "\t", ""), "\n", "") + "\t");        // 35.	Company City
        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(userCompany.getStateOrProvince(), "\t", ""), "\n", "")      // 36.	Company State 
                + "\t");
        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(userCompany.getZip(), "\t", ""), "\n", "") + "\t");         // 37.	Company Zip
        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(userCompany.getCountry(), "\t", ""), "\n", "") + "\t");     // 38.	Company Country
        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(userCompany.getPhone(), "\t", ""), "\n", "") + "\t");       // 39.	Company Phone
        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(userCompany.getFax(), "\t", ""), "\n", "") + "\t");         // 40.	Company Fax
        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(tnForm.userCompanySupplierId, "\t", ""), "\n", "") + "\t"); // 41.	Company Supplier ID

        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(tnForm.pubCompany.name, "\t", ""), "\n", "") + "\t");       // 42.	Publication Comp Name        
        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(tnForm.pubCompany.addrLine1, "\t", ""), "\n", "") + "\t");  // 43.	Publication Comp Address1
        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(tnForm.pubCompany.addrLine2, "\t", ""), "\n", "") + "\t");  // 44.	Publication Comp Address2
        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(tnForm.pubCompany.addrLine3, "\t", ""), "\n", "") + "\t");  // 45.	Publication Comp Address3
        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(tnForm.pubCompany.city, "\t", ""), "\n", "") + "\t");       // 46.	Publication Comp City
        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(tnForm.pubCompany.state, "\t", ""), "\n", "") + "\t");      // 47.	Publication Comp State
        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(tnForm.pubCompany.zip, "\t", ""), "\n", "") + "\t");        // 48.	Publication Comp Zip
        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(tnForm.pubCompany.country, "\t", ""), "\n", "") + "\t");    // 49.	Publication Comp Country
        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(tnForm.pubCompany.phone, "\t", ""), "\n", "") + "\t");      // 50.	Publication Comp Phone
        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(tnForm.pubCompany.fax, "\t", ""), "\n", "") + "\t");        // 51.	Publication Comp Fax
        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(tnForm.publicationCompanySupplierId, "\t", ""), "\n", "") + "\t"); // 52.	Publication Comp Supplier ID

        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(tnForm.other2, "\t", ""), "\n", "") + "\t");                // 53.	Additional Text

        pw.print(tnForm.submitDt.formatIt(TDate.MMDDYYYY) + "\t");                                                         // 54.	Submit Date

        pw.print(tnForm.exportDt.formatIt(TDate.MMDDYYYY) + "\t");                                                         // 55.	Export Date
        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(tnForm.chemStructOpt, "\t", ""), "\n", "") + "\t");         // 56.	Structure Required
        pw.print(TemplarUtil.strReplace(TemplarUtil.strReplace(tnForm.is_archive, "\t", ""), "\n", "") + "\t");            // 57.	Archived

        pw.print((tnForm.published ? "Y" : "N") + "\t");  // 58.	Published
        pw.print((tnForm.submitted ? "Y" : "N") + "\t");  // 59.	Submitted
        pw.print((tnForm.approved ? "Y" : "N") + "\t");   // 60.	Approved
        pw.print((tnForm.editable ? "Y" : "N") + "\t");   // 61.	Export to Committee
        pw.print(tnForm.monoId + "\t");                   // 62.	MonoID
        pw.print("\n\r");
    }

    private static String constructFunctionStr(DOTradeName tnForm) {
        String functionStr = "";

        DOList tnFuncList = LookupService.getFormTnFunctions();
        for (int i = 0; i < tnForm.functionList.size(); i++) {
            DOLookupValue d = (DOLookupValue) tnForm.functionList.elementAt(i);
            for (int j = 0; j < tnFuncList.size(); j++) {
                DOLookupValue function = (DOLookupValue) tnFuncList.elementAt(j);
                if (function.keyID == d.keyID) {
                    functionStr += function.keyDesc;
                    if (i < tnForm.functionList.size() - 1) {
                        functionStr += ";";
                    }
                    break;
                }
            }
        }

        return functionStr;
    }

}
