/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.service.tradename;

import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.DOTradeName;

public class TnAttachmentsService {
    private static Logger logger = LoggerFactory.getLogger(TnAttachmentsService.class);

    public final static String JNDI_TN_ATTACHMENTS_UPLOAD_DIR = "java:comp/env/trade_name/attachments/upload_dir";

    private static final String uploadDirPath;

    static {
        logger.info("Initializing Trade Name Attachments service");
        try {
            Context ctx = new InitialContext();
            uploadDirPath = (String) ctx.lookup(JNDI_TN_ATTACHMENTS_UPLOAD_DIR);
        } catch (NamingException e) {
            logger.error("Unable to retrieve Trade Name Attachments service's JNDI initialization parameters", e);
            //throw new InciException();
            throw new RuntimeException(e);
        }
        logger.info("Finished initializing Trade Name Attachments service");
    }

    /** Not intended to be instantiated. Exposed only static members. */
    private TnAttachmentsService() {
    }

    public static void storeTnFormAttachment(DOTradeName formTn, int attachmentIndex, byte[] attachmentContent) {
        FileOutputStream fos = null;
        try {
            /*
             * Must delete to prevent from storage of the garbage-files with
             * various extensions but the same filename.
             */
            deleteTnFormAttachment(formTn, attachmentIndex);

            File tnFormAttachmentFile = retrieveTnFormAttachmentFile(formTn, attachmentIndex);
            tnFormAttachmentFile.createNewFile();
            fos = new FileOutputStream(tnFormAttachmentFile);
            fos.write(attachmentContent);
        } catch (IOException ioe) {
            logger.error("Unable to store TN form attachment", ioe);
            //throw new InciException();
            throw new RuntimeException(ioe);
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    logger.warn(e.getMessage());
                }
            }
        }
    }

    public static void deleteTnFormAttachment(DOTradeName formTn, int attachmentIndex) {
        File uploadDir = new File(uploadDirPath);
        final String tnAttachFileNameWithoutExt = constructTnAttachFileNameWithoutExt(formTn, attachmentIndex);

        File[] formTnAttachmentList = uploadDir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File f) {
                String name = f.getName();
                if (name.startsWith(tnAttachFileNameWithoutExt + ".")) {
                    return true;
                } else {
                    return false;
                }
            }
        });

        if (formTnAttachmentList.length > 0) {
            formTnAttachmentList[0].delete();
        }
    }

    public static File retrieveTnFormAttachmentFile(DOTradeName formTn, int attachmentIndex) {
        String attachmentOriginalFileName = formTn.getOriginalAttachmentFileName(attachmentIndex);
        if (attachmentOriginalFileName.equals("")) {
            return null;
        }

        int indx = attachmentOriginalFileName.lastIndexOf(".");
        String fileExtension = attachmentOriginalFileName.substring(indx);
        return new File(constructTnAttachmentFilePath(formTn, attachmentIndex, fileExtension));
    }

    private static String constructTnAttachmentFilePath(DOTradeName formTn, int attachmentIndex, String fileExtension) {
        return uploadDirPath + constructTnAttachFileNameWithoutExt(formTn, attachmentIndex) + fileExtension;
    }

    private static String constructTnAttachFileNameWithoutExt(DOTradeName formTn, int attachmentIndex) {
        return formTn.tnNumber + "_" + attachmentIndex;
    }

}
