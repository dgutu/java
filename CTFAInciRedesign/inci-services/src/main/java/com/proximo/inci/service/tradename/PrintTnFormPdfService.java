/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.service.tradename;

import java.io.ByteArrayOutputStream;
import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.HeaderFooter;
import com.lowagie.text.Phrase;
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.proximo.inci.DOFormTNComment;
import com.proximo.inci.DOList;
import com.proximo.inci.DOLookupValue;
import com.proximo.inci.DOTradeName;
import com.proximo.inci.common.TDate;
import com.proximo.inci.service.common.LookupService;
import com.proximo.inci.service.security.SecurityService;
import com.proximo.inci.service.security.user.User;

public class PrintTnFormPdfService {

    private static Logger logger = LoggerFactory.getLogger(PrintTnFormPdfService.class);

    /** Not intended to be instantiated. Exposed only static members. */
    private PrintTnFormPdfService() {
    }

    public static byte[] producePdf(DOTradeName tn, boolean isAdmin) {
        logger.debug("Entering producePdf(...)");

        ByteArrayOutputStream pdfByteOutputStream = new ByteArrayOutputStream();
        byte[] result = new byte[] {};

        int allBorders = Rectangle.LEFT | Rectangle.RIGHT | Rectangle.TOP | Rectangle.BOTTOM;
        PdfPCell emptyCell = new PdfPCell();
        emptyCell.disableBorderSide(allBorders);

        try {
            // Start writing to the document
            Document pdfDocument = new Document();
            pdfDocument.setMargins(0.5F, 0.5F, 1.0F, 1.0F);
            
            @SuppressWarnings("unused")
            PdfWriter outputWriter = PdfWriter.getInstance(pdfDocument, pdfByteOutputStream);

            // Footer
            PdfPTable footerTable = new PdfPTable(2);
            PdfPCell pageCell = new PdfPCell();
            PdfPCell tradeNameFooterCell = new PdfPCell();
            pageCell.setPhrase(new Phrase("Page:", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));
            tradeNameFooterCell.setPhrase(new Phrase("Page:", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));
            pageCell.disableBorderSide(allBorders);
            tradeNameFooterCell.disableBorderSide(allBorders);
            footerTable.addCell(pageCell);
            footerTable.addCell(tradeNameFooterCell);
            Calendar now = Calendar.getInstance();
            int month = now.get(Calendar.MONTH) + 1;
            int day = now.get(Calendar.DATE);
            int year = now.get(Calendar.YEAR);
            int hour = now.get(Calendar.HOUR_OF_DAY);
            int minute = now.get(Calendar.MINUTE);
            Phrase footerPhrase = new Phrase("Trade Name: " + tn.tradeName + ", Application No: " + tn.tnNumber
                    + ", Print Date: " + month + "/" + day + "/" + year + " " + hour + ":" + minute + ", Page ",
                    FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F));
            HeaderFooter footer = new HeaderFooter(footerPhrase, true);

            pdfDocument.setFooter(footer);

            pdfDocument.open();

            // Title
            PdfPTable titleTable = new PdfPTable(1);
            PdfPCell titleCell = new PdfPCell();
            Phrase titlePhrase = new Phrase("INCI Name Application", FontFactory.getFont(FontFactory.TIMES_ROMAN,
                    14.0F, Font.BOLD));
            titleCell.setPhrase(titlePhrase);
            titleCell.setPaddingTop(24.0F);
            titleCell.disableBorderSide(allBorders);
            titleCell.setHorizontalAlignment(Element.ALIGN_CENTER);
            titleTable.addCell(titleCell);
            pdfDocument.add(titleTable);

            // Administrative Information
            PdfPTable administrativeInformationLabelTable = new PdfPTable(1);
            PdfPCell administrativeInformationLabelCell = new PdfPCell();
            Phrase administrativeInformationPhrase = new Phrase("Administrative Information:", FontFactory.getFont(
                    FontFactory.TIMES_ROMAN, 14.0F, Font.BOLD));
            administrativeInformationLabelCell.setPhrase(administrativeInformationPhrase);
            administrativeInformationLabelCell.disableBorderSide(allBorders);
            administrativeInformationLabelCell.setHorizontalAlignment(Element.ALIGN_LEFT);
            administrativeInformationLabelCell.setPaddingTop(12.0F);
            administrativeInformationLabelCell.setPaddingBottom(12.0F);
            administrativeInformationLabelTable.addCell(administrativeInformationLabelCell);
            pdfDocument.add(administrativeInformationLabelTable);

            PdfPTable administrativeInformationTable = new PdfPTable(4);

            PdfPCell fileNumberLabelCell = new PdfPCell();
            PdfPCell fileNumberCell = new PdfPCell();
            fileNumberLabelCell.setPhrase(new Phrase("File Number:", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F,
                    Font.BOLD)));
            fileNumberCell.setPhrase(new Phrase(tn.tnNumber, FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));
            fileNumberLabelCell.disableBorderSide(allBorders);
            fileNumberLabelCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            fileNumberCell.disableBorderSide(allBorders);
            fileNumberCell.setColspan(3);

            PdfPCell submitDateLabelCell = new PdfPCell();
            PdfPCell submitDateCell = new PdfPCell();
            submitDateLabelCell.setPhrase(new Phrase("Submitted On:", FontFactory.getFont(FontFactory.TIMES_ROMAN,
                    9.2F, Font.BOLD)));
            submitDateCell.setPhrase(new Phrase(tn.submitDt.formatIt(TDate.MMDDYY), FontFactory.getFont(
                    FontFactory.TIMES_ROMAN, 9.2F)));
            submitDateLabelCell.disableBorderSide(allBorders);
            submitDateLabelCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            submitDateCell.disableBorderSide(allBorders);
            submitDateCell.setColspan(3);

            PdfPCell submittedByLabelCell = new PdfPCell(); // for submitted By label 
            PdfPCell companyLabelCel2 = new PdfPCell();     // for company label
            PdfPCell submittedByCell1 = new PdfPCell();
            PdfPCell submittedByCell2 = new PdfPCell();
            PdfPCell submittedByCell31 = new PdfPCell();
            PdfPCell submittedByCell32 = new PdfPCell();
            PdfPCell submittedByCell33 = new PdfPCell();
            PdfPCell submittedByCell4 = new PdfPCell();
            PdfPCell submittedByCell5 = new PdfPCell();
            
            // submitted by
            submittedByLabelCell.setPhrase(new Phrase("Submitted By:", FontFactory.getFont(FontFactory.TIMES_ROMAN,
                    9.2F, Font.BOLD)));
            
            User user = SecurityService.findUserByRecId(tn.userRecId);
            
            submittedByCell1.setPhrase(new Phrase(user.getUserFullName() + " (" + user.getLoginId() + ")",
                    FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));            
            
            // company information            
            companyLabelCel2.setPhrase(new Phrase("Company:", FontFactory.getFont(FontFactory.TIMES_ROMAN,
                    9.2F, Font.BOLD)));            
            
            submittedByCell2.setPhrase(new Phrase(convertNullStr(user.getUserCompany().getCompanyName()), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));            
            
            // address
            submittedByCell31.setPhrase(new Phrase(convertNullStr(user.getAddress1()), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));            
            submittedByCell32.setPhrase(new Phrase(convertNullStr(user.getAddress2()), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));
            submittedByCell33.setPhrase(new Phrase(convertNullStr(user.getAddress3()), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));            
            
            
            submittedByCell4.setPhrase(new Phrase(convertNullStr(user.getCity()) + ", " + convertNullStr(user.getStateOrProvince()) + ", " + convertNullStr(user.getZip()),
                    FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));
            
            submittedByCell5.setPhrase(new Phrase(convertNullStr(user.getCountryLong()), FontFactory.getFont(
                    FontFactory.TIMES_ROMAN, 9.2F)));
            
            submittedByLabelCell.disableBorderSide(allBorders);
            submittedByLabelCell.setHorizontalAlignment(Element.ALIGN_RIGHT);

            companyLabelCel2.disableBorderSide(allBorders);
            companyLabelCel2.setHorizontalAlignment(Element.ALIGN_RIGHT);            
            
            submittedByCell1.disableBorderSide(allBorders);
            submittedByCell2.disableBorderSide(allBorders);
            submittedByCell31.disableBorderSide(allBorders);
            submittedByCell32.disableBorderSide(allBorders);
            submittedByCell33.disableBorderSide(allBorders);
            submittedByCell4.disableBorderSide(allBorders);
            submittedByCell5.disableBorderSide(allBorders);
            submittedByCell1.setColspan(3);
            submittedByCell2.setColspan(3);
            submittedByCell31.setColspan(3);
            submittedByCell32.setColspan(3);
            submittedByCell33.setColspan(3);
            submittedByCell4.setColspan(3);
            submittedByCell5.setColspan(3);

            PdfPCell phoneLabelCell = new PdfPCell();
            PdfPCell phoneCell = new PdfPCell();
            PdfPCell faxLabelCell = new PdfPCell();
            PdfPCell faxCell = new PdfPCell();
            phoneLabelCell
                    .setPhrase(new Phrase("Phone:", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F, Font.BOLD)));
            phoneCell.setPhrase(new Phrase(convertNullStr(user.getPhone()), FontFactory.getFont(
                    FontFactory.TIMES_ROMAN, 9.2F)));
            faxLabelCell.setPhrase(new Phrase("Fax:", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F, Font.BOLD)));
            faxCell.setPhrase(new Phrase(convertNullStr(user.getFax()), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));
            phoneLabelCell.disableBorderSide(allBorders);
            phoneLabelCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            phoneCell.disableBorderSide(allBorders);
            faxLabelCell.disableBorderSide(allBorders);
            faxLabelCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            faxCell.disableBorderSide(allBorders);

            PdfPCell emailLabelCell = new PdfPCell();
            PdfPCell emailCell = new PdfPCell();
            emailLabelCell.setPhrase(new Phrase("E-Mail:", FontFactory
                    .getFont(FontFactory.TIMES_ROMAN, 9.2F, Font.BOLD)));
            emailCell.setPhrase(new Phrase(convertNullStr(user.getEmail()), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));
            emailLabelCell.disableBorderSide(allBorders);
            emailLabelCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            emailCell.disableBorderSide(allBorders);
            emailCell.setColspan(3);
            
            // Contact Company Information
            PdfPCell contactCompanyLabelCell = new PdfPCell();
            PdfPCell contactCompanyAddressLabelCell = new PdfPCell();
            PdfPCell contactCompanyCell0 = new PdfPCell();
            PdfPCell contactCompanyCell1 = new PdfPCell();
            PdfPCell contactCompanyCell21 = new PdfPCell();
            PdfPCell contactCompanyCell22 = new PdfPCell();
            PdfPCell contactCompanyCell3 = new PdfPCell();
            PdfPCell contactCompanyCell4 = new PdfPCell();
            contactCompanyLabelCell.setPhrase(new Phrase("Contact Company:", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F,
                    Font.BOLD)));
            contactCompanyAddressLabelCell.setPhrase(new Phrase("Address:", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F,
                    Font.BOLD)));
            contactCompanyCell0.setPhrase(new Phrase(convertNullStr(user.getUserCompany().getCompanyName()), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));
            contactCompanyCell1.setPhrase(new Phrase(convertNullStr(user.getUserCompany().getAddress1()), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));
            
            contactCompanyCell21.setPhrase(new Phrase(convertNullStr(user.getUserCompany().getAddress2()), 
            		FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));
            
            contactCompanyCell22.setPhrase(new Phrase(convertNullStr(user.getUserCompany().getAddress3()), 
            		FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));            
            
            contactCompanyCell3.setPhrase(new Phrase(convertNullStr(user.getUserCompany().getCity()) + ", " + convertNullStr(user.getUserCompany().getStateOrProvince()) + ", " + convertNullStr(user.getUserCompany().getZip()),
                    FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));
            contactCompanyCell4
                    .setPhrase(new Phrase(convertNullStr(user.getUserCompany().getCountryLong()), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));
            contactCompanyLabelCell.disableBorderSide(allBorders);
            contactCompanyLabelCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            contactCompanyAddressLabelCell.disableBorderSide(allBorders);
            contactCompanyAddressLabelCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            contactCompanyCell0.disableBorderSide(allBorders);
            contactCompanyCell1.disableBorderSide(allBorders);
            contactCompanyCell21.disableBorderSide(allBorders);
            contactCompanyCell22.disableBorderSide(allBorders);
            contactCompanyCell3.disableBorderSide(allBorders);
            contactCompanyCell4.disableBorderSide(allBorders);
            contactCompanyCell0.setColspan(3);
            contactCompanyCell1.setColspan(3);
            contactCompanyCell21.setColspan(3);
            contactCompanyCell22.setColspan(3);
            contactCompanyCell3.setColspan(3);
            contactCompanyCell4.setColspan(3);

            PdfPCell contactCompanyPhoneLabelCell = new PdfPCell();
            PdfPCell contactCompanyPhoneCell = new PdfPCell();
            PdfPCell contactCompanyFaxLabelCell = new PdfPCell();
            PdfPCell contactCompanyFaxCell = new PdfPCell();
            contactCompanyPhoneLabelCell.setPhrase(new Phrase("Phone:", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F,
                    Font.BOLD)));
            contactCompanyPhoneCell.setPhrase(new Phrase(convertNullStr(user.getUserCompany().getPhone()), FontFactory.getFont(FontFactory.TIMES_ROMAN,
                    9.2F)));
            contactCompanyFaxLabelCell.setPhrase(new Phrase("Fax:", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F,
                    Font.BOLD)));
            contactCompanyFaxCell.setPhrase(new Phrase(convertNullStr(user.getUserCompany().getFax()), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));
            contactCompanyPhoneLabelCell.disableBorderSide(allBorders);
            contactCompanyPhoneLabelCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            contactCompanyPhoneCell.disableBorderSide(allBorders);
            contactCompanyFaxLabelCell.disableBorderSide(allBorders);
            contactCompanyFaxLabelCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            contactCompanyFaxCell.disableBorderSide(allBorders);            
            
            // Contact Company Supplier ID
            PdfPCell contactCompanySupplierIDLabelCell = new PdfPCell();
            PdfPCell contactCompanySupplierIDCell = new PdfPCell();
            
            contactCompanySupplierIDLabelCell.setPhrase(new Phrase("Contact Company Supplier ID:", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F,
                    Font.BOLD)));
            
            contactCompanySupplierIDCell.setPhrase(new Phrase(convertNullStr(tn.userCompanySupplierId), FontFactory.getFont(FontFactory.TIMES_ROMAN,
                    9.2F)));
            contactCompanySupplierIDLabelCell.disableBorderSide(allBorders);
            contactCompanySupplierIDLabelCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            contactCompanySupplierIDCell.disableBorderSide(allBorders);
            contactCompanySupplierIDCell.setColspan(3);
            
            // Publication Company
            PdfPCell companyLabelCell = new PdfPCell();
            PdfPCell companyAddressLabelCell = new PdfPCell();
            PdfPCell companyCell1 = new PdfPCell();
            PdfPCell companyCell21 = new PdfPCell();
            PdfPCell companyCell22 = new PdfPCell();
            PdfPCell companyCell23 = new PdfPCell();
            PdfPCell companyCell3 = new PdfPCell();
            PdfPCell companyCell4 = new PdfPCell();
            companyLabelCell.setPhrase(new Phrase("Publication Company:", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F,
                    Font.BOLD)));
            companyAddressLabelCell.setPhrase(new Phrase("Address:", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F,
                    Font.BOLD)));
            companyCell1.setPhrase(new Phrase(convertNullStr(tn.pubCompany.name), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));
            companyCell21.setPhrase(new Phrase(convertNullStr(tn.pubCompany.addrLine1), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));
            companyCell22.setPhrase(new Phrase(convertNullStr(tn.pubCompany.addrLine2), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));
            companyCell23.setPhrase(new Phrase(convertNullStr(tn.pubCompany.addrLine3), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));
            
            
            companyCell3.setPhrase(new Phrase(convertNullStr(tn.pubCompany.city) + ", " + convertNullStr(tn.pubCompany.state) + ", " + convertNullStr(tn.pubCompany.zip),
                    FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));
            companyCell4
                    .setPhrase(new Phrase(convertNullStr(tn.pubCompany.countryLong), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));
            companyLabelCell.disableBorderSide(allBorders);
            companyLabelCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            companyAddressLabelCell.disableBorderSide(allBorders);
            companyAddressLabelCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            companyCell1.disableBorderSide(allBorders);
            companyCell21.disableBorderSide(allBorders);
            companyCell22.disableBorderSide(allBorders);
            companyCell23.disableBorderSide(allBorders);
            companyCell3.disableBorderSide(allBorders);
            companyCell4.disableBorderSide(allBorders);
            companyCell1.setColspan(3);
            companyCell21.setColspan(3);
            companyCell22.setColspan(3);
            companyCell23.setColspan(3);
            companyCell3.setColspan(3);
            companyCell4.setColspan(3);

            PdfPCell companyPhoneLabelCell = new PdfPCell();
            PdfPCell companyPhoneCell = new PdfPCell();
            PdfPCell companyFaxLabelCell = new PdfPCell();
            PdfPCell companyFaxCell = new PdfPCell();
            companyPhoneLabelCell.setPhrase(new Phrase("Phone:", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F,
                    Font.BOLD)));
            companyPhoneCell.setPhrase(new Phrase(convertNullStr(tn.pubCompany.phone), FontFactory.getFont(FontFactory.TIMES_ROMAN,
                    9.2F)));
            companyFaxLabelCell.setPhrase(new Phrase("Fax:", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F,
                    Font.BOLD)));
            companyFaxCell.setPhrase(new Phrase(convertNullStr(tn.pubCompany.fax), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));
            companyPhoneLabelCell.disableBorderSide(allBorders);
            companyPhoneLabelCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            companyPhoneCell.disableBorderSide(allBorders);
            companyFaxLabelCell.disableBorderSide(allBorders);
            companyFaxLabelCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            companyFaxCell.disableBorderSide(allBorders);            
            
            // Publication Company Supplier ID 
            PdfPCell companySupplierIDLabelCell = new PdfPCell();
            PdfPCell companySupplierIDCell = new PdfPCell();
            
            companySupplierIDLabelCell.setPhrase(new Phrase("Publication Company Supplier ID:", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F,
                    Font.BOLD)));
            
            companySupplierIDCell.setPhrase(new Phrase(convertNullStr(tn.publicationCompanySupplierId), FontFactory.getFont(FontFactory.TIMES_ROMAN,
                    9.2F)));
            companySupplierIDLabelCell.disableBorderSide(allBorders);
            companySupplierIDLabelCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            companySupplierIDCell.disableBorderSide(allBorders);
            companySupplierIDCell.setColspan(3);            
            
            // Category
            PdfPCell categoryLabelCell = new PdfPCell();
            PdfPCell categoryCell = new PdfPCell();
            categoryLabelCell.setPhrase(new Phrase("Category:", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F,
                    Font.BOLD)));
            categoryCell.setPhrase(new Phrase(convertNullStr(tn.catName), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));
            categoryLabelCell.disableBorderSide(allBorders);
            categoryLabelCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            categoryCell.disableBorderSide(allBorders);
            categoryLabelCell.setPaddingTop(8.0F);
            categoryLabelCell.setPaddingBottom(8.0F);
            categoryCell.setPaddingTop(8.0F);
            categoryCell.setPaddingBottom(8.0F);            
            categoryCell.setColspan(3);            

            administrativeInformationTable.addCell(fileNumberLabelCell);
            administrativeInformationTable.addCell(fileNumberCell);
            administrativeInformationTable.addCell(submitDateLabelCell);
            administrativeInformationTable.addCell(submitDateCell);
            administrativeInformationTable.addCell(submittedByLabelCell);
            administrativeInformationTable.addCell(submittedByCell1);
            administrativeInformationTable.addCell(companyLabelCel2); // Company
            administrativeInformationTable.addCell(submittedByCell2);
            administrativeInformationTable.addCell(emptyCell);
            administrativeInformationTable.addCell(submittedByCell31);
            administrativeInformationTable.addCell(emptyCell);
            administrativeInformationTable.addCell(submittedByCell32);
            administrativeInformationTable.addCell(emptyCell);
            administrativeInformationTable.addCell(submittedByCell33);
            administrativeInformationTable.addCell(emptyCell);                                    
            administrativeInformationTable.addCell(submittedByCell4);
            administrativeInformationTable.addCell(emptyCell);
            administrativeInformationTable.addCell(submittedByCell5);
            administrativeInformationTable.addCell(phoneLabelCell);
            administrativeInformationTable.addCell(phoneCell);
            administrativeInformationTable.addCell(faxLabelCell);
            administrativeInformationTable.addCell(faxCell);
            administrativeInformationTable.addCell(emailLabelCell);
            administrativeInformationTable.addCell(emailCell);
            
            // Contact Company Information fields
            administrativeInformationTable.addCell(contactCompanyLabelCell);
            administrativeInformationTable.addCell(contactCompanyCell0);
            administrativeInformationTable.addCell(contactCompanyAddressLabelCell);
            administrativeInformationTable.addCell(contactCompanyCell1);
            administrativeInformationTable.addCell(emptyCell);
            administrativeInformationTable.addCell(contactCompanyCell21);
            administrativeInformationTable.addCell(emptyCell);
            administrativeInformationTable.addCell(contactCompanyCell22);
            administrativeInformationTable.addCell(emptyCell);            
            administrativeInformationTable.addCell(contactCompanyCell3);
            administrativeInformationTable.addCell(emptyCell);
            administrativeInformationTable.addCell(contactCompanyCell4);
            administrativeInformationTable.addCell(contactCompanyPhoneLabelCell);
            administrativeInformationTable.addCell(contactCompanyPhoneCell);
            administrativeInformationTable.addCell(contactCompanyFaxLabelCell);
            administrativeInformationTable.addCell(contactCompanyFaxCell);
            
            // Contact Company Supplier ID
            if (isAdmin) {
            	administrativeInformationTable.addCell(contactCompanySupplierIDLabelCell);
            	administrativeInformationTable.addCell(contactCompanySupplierIDCell);          	
            }
            
            // Publication Company fields
            administrativeInformationTable.addCell(companyLabelCell);
            administrativeInformationTable.addCell(companyCell1);
            administrativeInformationTable.addCell(companyAddressLabelCell);
            administrativeInformationTable.addCell(companyCell21);
            administrativeInformationTable.addCell(emptyCell);
            administrativeInformationTable.addCell(companyCell22);
            administrativeInformationTable.addCell(emptyCell);
            administrativeInformationTable.addCell(companyCell23);
            administrativeInformationTable.addCell(emptyCell);            
            administrativeInformationTable.addCell(companyCell3);
            administrativeInformationTable.addCell(emptyCell);
            administrativeInformationTable.addCell(companyCell4);
            administrativeInformationTable.addCell(companyPhoneLabelCell);
            administrativeInformationTable.addCell(companyPhoneCell);
            administrativeInformationTable.addCell(companyFaxLabelCell);
            administrativeInformationTable.addCell(companyFaxCell);
            
            // Publication Company Supplier ID 
            if (isAdmin) {
            	administrativeInformationTable.addCell(companySupplierIDLabelCell);
            	administrativeInformationTable.addCell(companySupplierIDCell);          	
            }            
            
            administrativeInformationTable.addCell(categoryLabelCell);
            administrativeInformationTable.addCell(categoryCell);
            pdfDocument.add(administrativeInformationTable);

            // INCI Information
            PdfPTable inciLabelTable = new PdfPTable(1);
            PdfPCell inciLabelCell = new PdfPCell();
            Phrase inciPhrase = new Phrase("International Nomenclature Committee Information:", FontFactory.getFont(
                    FontFactory.TIMES_ROMAN, 14.0F, Font.BOLD));
            inciLabelCell.setPhrase(inciPhrase);
            inciLabelCell.setPaddingTop(12.0F);
            inciLabelCell.setPaddingBottom(12.0F);
            inciLabelCell.disableBorderSide(allBorders);
            inciLabelCell.setHorizontalAlignment(Element.ALIGN_LEFT);
            inciLabelTable.addCell(inciLabelCell);
            pdfDocument.add(inciLabelTable);

            PdfPTable inciTable = new PdfPTable(3);

            PdfPCell anticipatedReviewDateLabelCell = new PdfPCell();
            PdfPCell anticipatedReviewDateCell = new PdfPCell();
            anticipatedReviewDateLabelCell.setPhrase(new Phrase("Anticipated Committee Review Date:", FontFactory
                    .getFont(FontFactory.TIMES_ROMAN, 9.2F, Font.BOLD)));
            anticipatedReviewDateCell.setPhrase(new Phrase(tn.reviewDt.formatIt(TDate.MMDDYY), FontFactory.getFont(
                    FontFactory.TIMES_ROMAN, 9.2F)));
            anticipatedReviewDateLabelCell.disableBorderSide(allBorders);
            anticipatedReviewDateLabelCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            anticipatedReviewDateCell.disableBorderSide(allBorders);
            anticipatedReviewDateCell.setColspan(2);

            PdfPCell ingredientLabelCell = new PdfPCell();
            PdfPCell ingredientCell1 = new PdfPCell();
            PdfPCell ingredientCell2 = new PdfPCell();
            ingredientLabelCell.setPhrase(new Phrase("Ingredient:", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F,
                    Font.BOLD)));
            String ingredientType = null;
            
            if (tn.ingredient.equalsIgnoreCase("AB")) {
                ingredientType = "Human/Animal";
            } else if (tn.ingredient.equalsIgnoreCase("CB")) {            
                ingredientType = "Fungi/Single Cell Organism";
            } else if (tn.ingredient.equalsIgnoreCase("MB")) {
                ingredientType = "Mineral";
            } else if (tn.ingredient.equalsIgnoreCase("PB")) {
                ingredientType = "Synthetic Organic/Inorganic";
            } else if (tn.ingredient.equalsIgnoreCase("VB")) {
                ingredientType = "Vegetable";
            } 
            
            ingredientCell1.setPhrase(new Phrase(ingredientType, FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));
            ingredientCell2.setPhrase(new Phrase(tn.ingredDesc, FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));
            ingredientLabelCell.disableBorderSide(allBorders);
            ingredientLabelCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            ingredientCell1.disableBorderSide(allBorders);
            ingredientCell2.disableBorderSide(allBorders);
            ingredientCell1.setColspan(2);
            ingredientCell2.setColspan(2);

            PdfPCell tradeNameLabelCell = new PdfPCell();
            PdfPCell tradeNameCell = new PdfPCell();
            tradeNameLabelCell.setPhrase(new Phrase("Trade Name:", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F,
                    Font.BOLD)));
            tradeNameCell.setPhrase(new Phrase(tn.tradeName, FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));
            tradeNameLabelCell.disableBorderSide(allBorders);
            tradeNameLabelCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            tradeNameCell.disableBorderSide(allBorders);
            tradeNameCell.setColspan(2);

            PdfPCell suggestedINCINameLabelCell = new PdfPCell();
            PdfPCell suggestedINCINameCell = new PdfPCell();
            suggestedINCINameLabelCell.setPhrase(new Phrase("Suggested INCI Name:", FontFactory.getFont(
                    FontFactory.TIMES_ROMAN, 9.2F, Font.BOLD)));
            suggestedINCINameCell.setPhrase(new Phrase(tn.nomenclature, FontFactory.getFont(FontFactory.TIMES_ROMAN,
                    9.2F)));
            suggestedINCINameLabelCell.disableBorderSide(allBorders);
            suggestedINCINameLabelCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            suggestedINCINameCell.disableBorderSide(allBorders);
            suggestedINCINameCell.setColspan(2);

            PdfPCell referencesLabelCell = new PdfPCell();
            PdfPCell referencesCell = new PdfPCell();
            referencesLabelCell.setPhrase(new Phrase("References:", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F,
                    Font.BOLD)));
            referencesCell.setPhrase(new Phrase(tn.reference, FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));
            referencesLabelCell.disableBorderSide(allBorders);
            referencesLabelCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            referencesCell.disableBorderSide(allBorders);
            referencesCell.setColspan(2);

            PdfPCell casNumberLabelCell = new PdfPCell();
            PdfPCell casNumberCell = new PdfPCell();
            casNumberLabelCell.setPhrase(new Phrase("CAS Number:", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F,
                    Font.BOLD)));
            casNumberCell.setPhrase(new Phrase(tn.CASNumber, FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));
            casNumberLabelCell.disableBorderSide(allBorders);
            casNumberLabelCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            casNumberCell.disableBorderSide(allBorders);
            casNumberCell.setColspan(2);

            PdfPCell einecsLabelCell = new PdfPCell();
            PdfPCell einecsCell = new PdfPCell();
            einecsLabelCell.setPhrase(new Phrase("EINECS/ELINCS Number:", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F,
                    Font.BOLD)));
            einecsCell.setPhrase(new Phrase(tn.EINECSNumber, FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));
            einecsLabelCell.disableBorderSide(allBorders);
            einecsLabelCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            einecsCell.disableBorderSide(allBorders);
            einecsCell.setColspan(2);

            /*
             * check if that is correctly displayed in PDF PdfPCell
             * elincsLabelCell = new PdfPCell(); PdfPCell elincsCell = new
             * PdfPCell(); elincsLabelCell.setPhrase(new
             * Phrase("ELINCS Number:",
             * FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F, Font.BOLD)));
             * elincsCell.setPhrase(new Phrase(tn.ELICSNumber,
             * FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));
             * elincsLabelCell.disableBorderSide(allBorders);
             * elincsLabelCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
             * elincsCell.disableBorderSide(allBorders);
             * elincsCell.setColspan(2);
             */
            
            //tn.userCompanySupplierId
            //tn.publicationCompanySupplierId
            
            PdfPCell chemicalSynonymsLabelCell = new PdfPCell();
            PdfPCell chemicalSynonymsCell = new PdfPCell();
            chemicalSynonymsLabelCell.setPhrase(new Phrase("Chemical Synonyms:", FontFactory.getFont(
                    FontFactory.TIMES_ROMAN, 9.2F, Font.BOLD)));
            chemicalSynonymsCell.setPhrase(new Phrase(tn.chemSynonyms, FontFactory.getFont(FontFactory.TIMES_ROMAN,
                    9.2F)));
            chemicalSynonymsLabelCell.disableBorderSide(allBorders);
            chemicalSynonymsLabelCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            chemicalSynonymsCell.disableBorderSide(allBorders);
            chemicalSynonymsCell.setColspan(2);

            PdfPCell compositionLabelCell = new PdfPCell();
            PdfPCell compositionCell = new PdfPCell();
            compositionLabelCell.setPhrase(new Phrase("Composition Statement:", FontFactory.getFont(
                    FontFactory.TIMES_ROMAN, 9.2F, Font.BOLD)));
            compositionCell.setPhrase(new Phrase(tn.compStmt, FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));
            compositionLabelCell.disableBorderSide(allBorders);
            compositionLabelCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            compositionCell.disableBorderSide(allBorders);
            compositionCell.setColspan(2);

            PdfPCell manufactureLabelCell = new PdfPCell();
            PdfPCell manufactureCell = new PdfPCell();
            manufactureLabelCell.setPhrase(new Phrase("Manufacturing Method:", FontFactory.getFont(
                    FontFactory.TIMES_ROMAN, 9.2F, Font.BOLD)));
            manufactureCell.setPhrase(new Phrase(tn.mfgMehod, FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));
            manufactureLabelCell.disableBorderSide(allBorders);
            manufactureLabelCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            manufactureCell.disableBorderSide(allBorders);
            manufactureCell.setColspan(2);

            PdfPCell solventsLabelCell = new PdfPCell();
            PdfPCell solventsCell = new PdfPCell();
            solventsLabelCell.setPhrase(new Phrase("Solvents or Diluents:", FontFactory.getFont(
                    FontFactory.TIMES_ROMAN, 9.2F, Font.BOLD)));
            solventsCell.setPhrase(new Phrase(tn.solvents, FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));
            solventsLabelCell.disableBorderSide(allBorders);
            solventsLabelCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            solventsCell.disableBorderSide(allBorders);
            solventsCell.setColspan(2);

            PdfPCell functionLabelCell = new PdfPCell();
            PdfPCell functionCell = new PdfPCell();
            functionLabelCell.setPhrase(new Phrase("Function:", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F,
                    Font.BOLD)));
            StringBuffer functions = new StringBuffer();
            DOList m_tnFuncList;
            m_tnFuncList = LookupService.getFormTnFunctions();

            if (tn.functionList != null) {
                for (int i = 0; i < tn.functionList.size(); i++) {
                    DOLookupValue d = (DOLookupValue) tn.functionList.elementAt(i);
                    for (int j = 0; j < m_tnFuncList.size(); j++) {
                        DOLookupValue dolkv = (DOLookupValue) m_tnFuncList.elementAt(j);
                        if (dolkv.keyID == d.keyID) {
                            functions.append(dolkv.keyDesc);
                            if (i < tn.functionList.size() - 1) {
                                functions.append("; ");
                            }
                            break;
                        }
                    }
                }
            }

            functionCell
                    .setPhrase(new Phrase(functions.toString(), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));
            functionLabelCell.disableBorderSide(allBorders);
            functionLabelCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            functionCell.disableBorderSide(allBorders);
            functionCell.setColspan(2);

            PdfPCell otherFunctionsLabelCell = new PdfPCell();
            PdfPCell otherFunctionsCell = new PdfPCell();
            otherFunctionsLabelCell.setPhrase(new Phrase("Other Functions:", FontFactory.getFont(
                    FontFactory.TIMES_ROMAN, 9.2F, Font.BOLD)));
            otherFunctionsCell.setPhrase(new Phrase(tn.otherFunctions, FontFactory.getFont(FontFactory.TIMES_ROMAN,
                    9.2F)));
            otherFunctionsLabelCell.disableBorderSide(allBorders);
            otherFunctionsLabelCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            otherFunctionsCell.disableBorderSide(allBorders);
            otherFunctionsCell.setColspan(2);

            PdfPCell genusAndSpeciesLabelCell = new PdfPCell();
            PdfPCell genusAndSpeciesCell = new PdfPCell();
            genusAndSpeciesLabelCell.setPhrase(new Phrase("Genus and Species of Plant:", FontFactory.getFont(
                    FontFactory.TIMES_ROMAN, 9.2F, Font.BOLD)));
            genusAndSpeciesCell.setPhrase(new Phrase(tn.genus, FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));
            genusAndSpeciesLabelCell.disableBorderSide(allBorders);
            genusAndSpeciesLabelCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            genusAndSpeciesCell.disableBorderSide(allBorders);
            genusAndSpeciesCell.setColspan(2);

            PdfPCell typeOfPreparationLabelCell = new PdfPCell();
            PdfPCell typeOfPreparationCell = new PdfPCell();
            typeOfPreparationLabelCell.setPhrase(new Phrase("Type of Preparation:", FontFactory.getFont(
                    FontFactory.TIMES_ROMAN, 9.2F, Font.BOLD)));
            typeOfPreparationCell.setPhrase(new Phrase(tn.prepare, FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));
            typeOfPreparationLabelCell.disableBorderSide(allBorders);
            typeOfPreparationLabelCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            typeOfPreparationCell.disableBorderSide(allBorders);
            typeOfPreparationCell.setColspan(2);

            PdfPCell plantPartUsedLabelCell = new PdfPCell();
            PdfPCell plantPartUsedCell = new PdfPCell();
            plantPartUsedLabelCell.setPhrase(new Phrase("Plant Part(s) Used:", FontFactory.getFont(
                    FontFactory.TIMES_ROMAN, 9.2F, Font.BOLD)));
            plantPartUsedCell.setPhrase(new Phrase(tn.plantPart, FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));
            plantPartUsedLabelCell.disableBorderSide(allBorders);
            plantPartUsedLabelCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            plantPartUsedCell.disableBorderSide(allBorders);
            plantPartUsedCell.setColspan(2);

            PdfPCell identityOfMaterialLabelCell = new PdfPCell();
            PdfPCell identityOfMaterialCell = new PdfPCell();
            identityOfMaterialLabelCell.setPhrase(new Phrase("Identity of Material Fermented:", FontFactory.getFont(
                    FontFactory.TIMES_ROMAN, 9.2F, Font.BOLD)));
            identityOfMaterialCell
                    .setPhrase(new Phrase(tn.material, FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));
            identityOfMaterialLabelCell.disableBorderSide(allBorders);
            identityOfMaterialLabelCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            identityOfMaterialCell.disableBorderSide(allBorders);
            identityOfMaterialCell.setColspan(2);

            PdfPCell processAfterFermentationLabelCell = new PdfPCell();
            PdfPCell processAfterFermentationCell = new PdfPCell();
            processAfterFermentationLabelCell.setPhrase(new Phrase("Process after Fermentation:", FontFactory.getFont(
                    FontFactory.TIMES_ROMAN, 9.2F, Font.BOLD)));
            processAfterFermentationCell.setPhrase(new Phrase(tn.process, FontFactory.getFont(FontFactory.TIMES_ROMAN,
                    9.2F)));
            processAfterFermentationLabelCell.disableBorderSide(allBorders);
            processAfterFermentationLabelCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            processAfterFermentationCell.disableBorderSide(allBorders);
            processAfterFermentationCell.setColspan(2);

            PdfPCell empiricalLabelCell = new PdfPCell();
            PdfPCell empiricalCell = new PdfPCell();
            
            // Biotech/Bioengineering            
            if (tn.categoryID == 5) {
            	empiricalLabelCell.setPhrase(new Phrase("Protein Information:", FontFactory.getFont(FontFactory.TIMES_ROMAN,
                    9.2F, Font.BOLD)));
            }
            else {
            	empiricalLabelCell.setPhrase(new Phrase("Empirical Formula:", FontFactory.getFont(FontFactory.TIMES_ROMAN,
                        9.2F, Font.BOLD)));
            }            	
            
            String empirical = new String(tn.formula);
            String[] empiricalArray = empirical.split("<sub>");
            Chunk[] chunkArray = new Chunk[empiricalArray.length];
            Phrase empiricalPhrase = new Phrase();
            for (int i = 0; i < chunkArray.length; i++) {
                if (empiricalArray[i].indexOf("</sub>") == -1) {
                    chunkArray[i] = new Chunk(empiricalArray[i], FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F));
                } else {
                    String[] doubleChunk = empiricalArray[i].split("</sub>");

                    Chunk extraChunk = new Chunk(doubleChunk[0], FontFactory.getFont(FontFactory.TIMES_ROMAN, 7.0F));
                    extraChunk.setTextRise(-3.0F);
                    empiricalPhrase.add(extraChunk);
                    chunkArray[i] = new Chunk(doubleChunk[1], FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F));
                }
                empiricalPhrase.add(chunkArray[i]);
            }
            empiricalCell.setPhrase(empiricalPhrase);
            empiricalLabelCell.disableBorderSide(allBorders);
            empiricalLabelCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            empiricalCell.disableBorderSide(allBorders);
            empiricalCell.setColspan(2);

            PdfPCell chemicalStructureLabelCell = new PdfPCell();
            PdfPCell chemicalStructureCell = new PdfPCell();
            chemicalStructureLabelCell.setPhrase(new Phrase("Chemical Structure:", FontFactory.getFont(
                    FontFactory.TIMES_ROMAN, 9.2F, Font.BOLD)));
            String structOpt = "No";
            if (tn.chemStructOpt.equalsIgnoreCase("Y")) {
                structOpt = "Yes";
            } else if (tn.chemStructOpt.equalsIgnoreCase("A")) {
                structOpt = "Yes";
            }
            chemicalStructureCell.setPhrase(new Phrase(structOpt, FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));
            chemicalStructureLabelCell.disableBorderSide(allBorders);
            chemicalStructureLabelCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            chemicalStructureCell.disableBorderSide(allBorders);
            chemicalStructureCell.setColspan(2);            
            
            // show on the form
            inciTable.addCell(anticipatedReviewDateLabelCell);
            inciTable.addCell(anticipatedReviewDateCell);
            inciTable.addCell(ingredientLabelCell);
            inciTable.addCell(ingredientCell1);
            inciTable.addCell(emptyCell);
            inciTable.addCell(ingredientCell2);
            inciTable.addCell(tradeNameLabelCell);
            inciTable.addCell(tradeNameCell);
            inciTable.addCell(suggestedINCINameLabelCell);
            inciTable.addCell(suggestedINCINameCell);
            inciTable.addCell(referencesLabelCell);
            inciTable.addCell(referencesCell);
            inciTable.addCell(casNumberLabelCell);
            inciTable.addCell(casNumberCell);
            inciTable.addCell(einecsLabelCell);
            inciTable.addCell(einecsCell);

            // check if that is correctly displayed in PDF
            // inciTable.addCell(elincsLabelCell);
            // inciTable.addCell(elincsCell);

           	inciTable.addCell(chemicalSynonymsLabelCell);
           	inciTable.addCell(chemicalSynonymsCell);

            if (tn.categoryID == 2) {
                inciTable.addCell(genusAndSpeciesLabelCell);
                inciTable.addCell(genusAndSpeciesCell);
                inciTable.addCell(typeOfPreparationLabelCell);
                inciTable.addCell(typeOfPreparationCell);
                inciTable.addCell(plantPartUsedLabelCell);
                inciTable.addCell(plantPartUsedCell);
            } else if (tn.categoryID == 1) {
                inciTable.addCell(genusAndSpeciesLabelCell);
                inciTable.addCell(genusAndSpeciesCell);
                inciTable.addCell(identityOfMaterialLabelCell);
                inciTable.addCell(identityOfMaterialCell);
                inciTable.addCell(processAfterFermentationLabelCell);
                inciTable.addCell(processAfterFermentationCell);
            }

           	inciTable.addCell(compositionLabelCell);
           	inciTable.addCell(compositionCell);            
            inciTable.addCell(manufactureLabelCell);
            inciTable.addCell(manufactureCell);
            inciTable.addCell(solventsLabelCell);
            inciTable.addCell(solventsCell);
            inciTable.addCell(functionLabelCell);
            inciTable.addCell(functionCell);
            inciTable.addCell(otherFunctionsLabelCell);
            inciTable.addCell(otherFunctionsCell);
            
            // Empirical Formula & Protein Information
            if (tn.categoryID == 4 || tn.categoryID == 5 || tn.categoryID == 6) {	
            	inciTable.addCell(empiricalLabelCell);
            	inciTable.addCell(empiricalCell);
            }
            
            inciTable.addCell(chemicalStructureLabelCell);
            inciTable.addCell(chemicalStructureCell);
            pdfDocument.add(inciTable);

            // Attachments
            PdfPTable attachmentsLabelTable = new PdfPTable(1);
            PdfPCell attachmentsLabelCell = new PdfPCell();
            Phrase attachmentsPhrase = new Phrase("Attachments (CAS Reports, Literature References, etc.):",
                    FontFactory.getFont(FontFactory.TIMES_ROMAN, 14.0F, Font.BOLD));
            attachmentsLabelCell.setPhrase(attachmentsPhrase);
            attachmentsLabelCell.setPaddingTop(12.0F);
            attachmentsLabelCell.setPaddingBottom(12.0F);
            attachmentsLabelCell.disableBorderSide(allBorders);
            attachmentsLabelCell.setHorizontalAlignment(Element.ALIGN_LEFT);
            attachmentsLabelTable.addCell(attachmentsLabelCell);
            pdfDocument.add(attachmentsLabelTable);

            PdfPTable attachmentsTable = new PdfPTable(2);

            PdfPCell uploadedLabelCell = new PdfPCell();
            PdfPCell storedLabelCell = new PdfPCell();
            uploadedLabelCell.setPhrase(new Phrase("Uploaded File Name", FontFactory.getFont(FontFactory.TIMES_ROMAN,
                    9.2F, Font.BOLD)));
            storedLabelCell.setPhrase(new Phrase("Stored File Name", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F,
                    Font.BOLD)));
            uploadedLabelCell.disableBorderSide(Rectangle.LEFT | Rectangle.TOP);
            uploadedLabelCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            storedLabelCell.disableBorderSide(Rectangle.RIGHT | Rectangle.TOP);

            PdfPCell uploadCell1 = new PdfPCell();
            PdfPCell uploadCell2 = new PdfPCell();
            PdfPCell uploadCell3 = new PdfPCell();
            PdfPCell uploadCell4 = new PdfPCell();
            PdfPCell uploadCell5 = new PdfPCell();
            PdfPCell storedCell1 = new PdfPCell();
            PdfPCell storedCell2 = new PdfPCell();
            PdfPCell storedCell3 = new PdfPCell();
            PdfPCell storedCell4 = new PdfPCell();
            PdfPCell storedCell5 = new PdfPCell();
            uploadCell1.disableBorderSide(Rectangle.LEFT | Rectangle.TOP | Rectangle.BOTTOM);
            uploadCell2.disableBorderSide(Rectangle.LEFT | Rectangle.TOP | Rectangle.BOTTOM);
            uploadCell3.disableBorderSide(Rectangle.LEFT | Rectangle.TOP | Rectangle.BOTTOM);
            uploadCell4.disableBorderSide(Rectangle.LEFT | Rectangle.TOP | Rectangle.BOTTOM);
            uploadCell5.disableBorderSide(Rectangle.LEFT | Rectangle.TOP | Rectangle.BOTTOM);
            uploadCell1.setHorizontalAlignment(Element.ALIGN_RIGHT);
            uploadCell2.setHorizontalAlignment(Element.ALIGN_RIGHT);
            uploadCell3.setHorizontalAlignment(Element.ALIGN_RIGHT);
            uploadCell4.setHorizontalAlignment(Element.ALIGN_RIGHT);
            uploadCell5.setHorizontalAlignment(Element.ALIGN_RIGHT);
            storedCell1.disableBorderSide(Rectangle.RIGHT | Rectangle.TOP | Rectangle.BOTTOM);
            storedCell2.disableBorderSide(Rectangle.RIGHT | Rectangle.TOP | Rectangle.BOTTOM);
            storedCell3.disableBorderSide(Rectangle.RIGHT | Rectangle.TOP | Rectangle.BOTTOM);
            storedCell4.disableBorderSide(Rectangle.RIGHT | Rectangle.TOP | Rectangle.BOTTOM);
            storedCell5.disableBorderSide(Rectangle.RIGHT | Rectangle.TOP | Rectangle.BOTTOM);
            uploadCell1.setPhrase(new Phrase(tn.file1, FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));
            if (tn.file1.equals("")) {
                storedCell1.setPhrase(new Phrase("", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));
            } else {
                int indx = tn.file1.lastIndexOf(".");
                String ext = tn.file1.substring(indx);
                storedCell1.setPhrase(new Phrase(tn.tnNumber + "_" + 1 + ext, FontFactory.getFont(
                        FontFactory.TIMES_ROMAN, 9.2F)));
            }
            uploadCell2.setPhrase(new Phrase(tn.file2, FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));
            if (tn.file2.equals("")) {
                storedCell2.setPhrase(new Phrase("", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));
            } else {
                int indx = tn.file2.lastIndexOf(".");
                String ext = tn.file2.substring(indx);
                storedCell2.setPhrase(new Phrase(tn.tnNumber + "_" + 2 + ext, FontFactory.getFont(
                        FontFactory.TIMES_ROMAN, 9.2F)));
            }
            uploadCell3.setPhrase(new Phrase(tn.file3, FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));
            if (tn.file3.equals("")) {
                storedCell3.setPhrase(new Phrase("", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));
            } else {
                int indx = tn.file3.lastIndexOf(".");
                String ext = tn.file3.substring(indx);
                storedCell3.setPhrase(new Phrase(tn.tnNumber + "_" + 3 + ext, FontFactory.getFont(
                        FontFactory.TIMES_ROMAN, 9.2F)));
            }
            uploadCell4.setPhrase(new Phrase(tn.file4, FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));
            if (tn.file4.equals("")) {
                storedCell4.setPhrase(new Phrase("", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));
            } else {
                int indx = tn.file4.lastIndexOf(".");
                String ext = tn.file4.substring(indx);
                storedCell4.setPhrase(new Phrase(tn.tnNumber + "_" + 4 + ext, FontFactory.getFont(
                        FontFactory.TIMES_ROMAN, 9.2F)));
            }
            uploadCell5.setPhrase(new Phrase(tn.file5, FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));
            if (tn.file5.equals("")) {
                storedCell5.setPhrase(new Phrase("", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));
            } else {
                int indx = tn.file5.lastIndexOf(".");
                String ext = tn.file5.substring(indx);
                storedCell5.setPhrase(new Phrase(tn.tnNumber + "_" + 5 + ext, FontFactory.getFont(
                        FontFactory.TIMES_ROMAN, 9.2F)));
            }

            attachmentsTable.addCell(uploadedLabelCell);
            attachmentsTable.addCell(storedLabelCell);
            attachmentsTable.addCell(uploadCell1);
            attachmentsTable.addCell(storedCell1);
            attachmentsTable.addCell(uploadCell2);
            attachmentsTable.addCell(storedCell2);
            attachmentsTable.addCell(uploadCell3);
            attachmentsTable.addCell(storedCell3);
            attachmentsTable.addCell(uploadCell4);
            attachmentsTable.addCell(storedCell4);
            attachmentsTable.addCell(uploadCell5);
            attachmentsTable.addCell(storedCell5);
            pdfDocument.add(attachmentsTable);

            // Next Page!
            @SuppressWarnings("unused")
			boolean isNewPage = pdfDocument.newPage();
            pdfDocument.add(titleTable);

            // Comments
            PdfPTable commentsLabelTable = new PdfPTable(1);
            PdfPCell commentsLabelCell = new PdfPCell();
            Phrase commentsPhrase = new Phrase("Comments", FontFactory.getFont(FontFactory.TIMES_ROMAN, 14.0F,
                    Font.BOLD | Font.UNDERLINE));
            commentsLabelCell.setPhrase(commentsPhrase);
            commentsLabelCell.setPaddingTop(8.0F);
            commentsLabelCell.setPaddingBottom(8.0F);
            commentsLabelCell.disableBorderSide(allBorders);
            commentsLabelCell.setHorizontalAlignment(Element.ALIGN_LEFT);
            commentsLabelTable.addCell(commentsLabelCell);
            pdfDocument.add(commentsLabelTable);

            if (isAdmin) {
                PdfPTable adminCommentTable = new PdfPTable(6);
                PdfPCell adminCommentCell = new PdfPCell();
                PdfPCell adminCommentTextCell = new PdfPCell();
                adminCommentCell.setPhrase(new Phrase("Admin Comments:", FontFactory.getFont(FontFactory.TIMES_ROMAN,
                        9.2F, Font.BOLD)));
                adminCommentCell.disableBorderSide(allBorders);
                adminCommentTextCell.setPhrase(new Phrase(tn.adminComments, FontFactory.getFont(
                        FontFactory.TIMES_ROMAN, 9.2F)));
                adminCommentTextCell.disableBorderSide(allBorders);
                adminCommentCell.setPaddingTop(8.0F);
                adminCommentCell.setPaddingBottom(8.0F);
                adminCommentTextCell.setPaddingTop(8.0F);
                adminCommentTextCell.setPaddingBottom(8.0F);
                adminCommentTextCell.setColspan(5);
                adminCommentTable.addCell(adminCommentCell);
                adminCommentTable.addCell(adminCommentTextCell);
                pdfDocument.add(adminCommentTable);
            }

            PdfPTable commentsTable = new PdfPTable(5);

            PdfPCell ctfaCommentsLabelCell = new PdfPCell();
            Phrase ctfaCommentsPhrase = new Phrase("Personal Care Product Council's Comments:", FontFactory.getFont(
                    FontFactory.TIMES_ROMAN, 9.2F, Font.BOLD));
            ctfaCommentsLabelCell.setPhrase(ctfaCommentsPhrase);
            ctfaCommentsLabelCell.setPaddingTop(8.0F);
            ctfaCommentsLabelCell.setPaddingBottom(8.0F);
            ctfaCommentsLabelCell.setColspan(5);
            ctfaCommentsLabelCell.disableBorderSide(allBorders);
            ctfaCommentsLabelCell.setHorizontalAlignment(Element.ALIGN_LEFT);

            PdfPCell sentDateLabelCell = new PdfPCell();
            PdfPCell closeDateLabelCell = new PdfPCell();
            PdfPCell commentsMiniLabelCell = new PdfPCell();
            sentDateLabelCell.setPhrase(new Phrase("Sent Date", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F,
                    Font.BOLD | Font.UNDERLINE)));
            closeDateLabelCell.setPhrase(new Phrase("Close Date", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F,
                    Font.BOLD | Font.UNDERLINE)));
            commentsMiniLabelCell.setPhrase(new Phrase("Comments", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F,
                    Font.BOLD | Font.UNDERLINE)));
            sentDateLabelCell.disableBorderSide(allBorders);
            closeDateLabelCell.disableBorderSide(allBorders);
            commentsMiniLabelCell.disableBorderSide(allBorders);
            commentsMiniLabelCell.setColspan(3);
            commentsTable.addCell(ctfaCommentsLabelCell);
            commentsTable.addCell(sentDateLabelCell);
            commentsTable.addCell(closeDateLabelCell);
            commentsTable.addCell(commentsMiniLabelCell);

            for (int i = 0; i < tn.ctfaCommentList.size(); i++) {
                DOFormTNComment comment = (DOFormTNComment) tn.ctfaCommentList.elementAt(i);
                PdfPCell sentDateCell = new PdfPCell();
                PdfPCell closeDateCell = new PdfPCell();
                PdfPCell commentsCell = new PdfPCell();
                sentDateCell.setPhrase(new Phrase(comment.sentDt.formatIt(TDate.MMDDYY), FontFactory.getFont(
                        FontFactory.TIMES_ROMAN, 9.2F)));
                closeDateCell.setPhrase(new Phrase(comment.closeDt.formatIt(TDate.MMDDYY), FontFactory.getFont(
                        FontFactory.TIMES_ROMAN, 9.2F)));
                commentsCell.setPhrase(new Phrase(comment.msgBody, FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F)));
                sentDateCell.disableBorderSide(allBorders);
                closeDateCell.disableBorderSide(allBorders);
                commentsCell.disableBorderSide(allBorders);
                commentsCell.setColspan(3);
                commentsTable.addCell(sentDateCell);
                commentsTable.addCell(closeDateCell);
                commentsTable.addCell(commentsCell);
            }
            pdfDocument.add(commentsTable);

            PdfPTable userResponseLabelTable = new PdfPTable(1);
            PdfPCell userResponseLabelCell = new PdfPCell();
            Phrase responsePhrase = new Phrase("User Responses to Comments:", FontFactory.getFont(
                    FontFactory.TIMES_ROMAN, 9.2F, Font.BOLD));
            userResponseLabelCell.setPhrase(responsePhrase);
            userResponseLabelCell.setPaddingTop(8.0F);
            userResponseLabelCell.setPaddingBottom(8.0F);
            userResponseLabelCell.disableBorderSide(allBorders);
            userResponseLabelCell.setHorizontalAlignment(Element.ALIGN_LEFT);
            userResponseLabelTable.addCell(userResponseLabelCell);
            pdfDocument.add(userResponseLabelTable);

            PdfPTable userResponseTable = new PdfPTable(4);

            PdfPCell userDateLabelCell = new PdfPCell();
            PdfPCell userCommentsLabelCell = new PdfPCell();
            userDateLabelCell.setPhrase(new Phrase("Date", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F, Font.BOLD
                    | Font.UNDERLINE)));
            userCommentsLabelCell.setPhrase(new Phrase("Comments", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F,
                    Font.BOLD | Font.UNDERLINE)));
            userDateLabelCell.disableBorderSide(allBorders);
            userCommentsLabelCell.disableBorderSide(allBorders);
            userCommentsLabelCell.setColspan(3);
            userResponseTable.addCell(userDateLabelCell);
            userResponseTable.addCell(userCommentsLabelCell);
            for (int i = 0; i < tn.userCommentList.size(); i++) {
                DOFormTNComment comment = (DOFormTNComment) tn.userCommentList.elementAt(i);
                PdfPCell userDateCell = new PdfPCell();
                PdfPCell userCommentsCell = new PdfPCell();
                userDateCell.setPhrase(new Phrase(comment.sentDt.formatIt(TDate.MMDDYY), FontFactory.getFont(
                        FontFactory.TIMES_ROMAN, 9.2F)));
                userCommentsCell.setPhrase(new Phrase(comment.msgBody, FontFactory.getFont(FontFactory.TIMES_ROMAN,
                        9.2F)));
                userDateCell.disableBorderSide(allBorders);
                userCommentsCell.disableBorderSide(allBorders);
                userCommentsCell.setColspan(3);
                userResponseTable.addCell(userDateCell);
                userResponseTable.addCell(userCommentsCell);
            }

            pdfDocument.add(userResponseTable);

            PdfPTable publishTable = new PdfPTable(1);
            PdfPCell publishCell = new PdfPCell();
            publishCell
                    .setPhrase(new Phrase(
                    		  "Do you want this trade name published in the International Cosmetic Ingredient Dictionary and supplier company name published in the Council's International Buyers' Guide? "
                                    + (tn.published ? "Y" : "N"), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F,
                                    Font.BOLD)));
            publishCell.setPaddingTop(8.0F);
            publishCell.disableBorderSide(allBorders);
            publishTable.addCell(publishCell);
            pdfDocument.add(publishTable);

            PdfPTable inciNameTable = new PdfPTable(3);
            PdfPCell inciNameCell = new PdfPCell();
            PdfPCell assignmentDateCell = new PdfPCell();
            PdfPCell monoIdCell = new PdfPCell();
            
            inciNameCell.setPhrase(new Phrase("INCI Name: " + tn.inciName, FontFactory.getFont(FontFactory.TIMES_ROMAN,
                    9.2F, Font.BOLD)));
            inciNameCell.disableBorderSide(allBorders);
            
            // Mono ID
            monoIdCell.setPhrase(new Phrase("Mono ID: " + tn.monoId, FontFactory.getFont(FontFactory.TIMES_ROMAN,
                    9.2F, Font.BOLD)));
            monoIdCell.disableBorderSide(allBorders);
            
            assignmentDateCell.setPhrase(new Phrase("Assignment Date: " + tn.inciNameDt.formatIt(TDate.MMDDYY),
                    FontFactory.getFont(FontFactory.TIMES_ROMAN, 9.2F, Font.BOLD)));
            assignmentDateCell.disableBorderSide(allBorders);
            
            inciNameTable.addCell(inciNameCell);
            inciNameTable.addCell(monoIdCell);
            inciNameTable.addCell(assignmentDateCell);
            
            pdfDocument.add(inciNameTable);

            pdfDocument.close();
            result = pdfByteOutputStream.toByteArray();
        } catch (Exception e) {
            logger.error("Error preparing PDF for tnForm: ", e);
            //throw new InciException();
            throw new RuntimeException(e);
        }

        logger.debug("Leaving producePdf(...): pdf document size={} bytes", result.length);
        return result;
    }
    
    private static String convertNullStr(String inputStr) {
        if (null == inputStr) {
            return "";
        } else {
            return inputStr;
        }
    }

}
