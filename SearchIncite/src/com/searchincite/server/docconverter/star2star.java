package com.searchincite.server.docconverter;

import java.sql.SQLException;
import java.util.concurrent.Semaphore;

//import com.searchincite.server.irccatdaemon;
import com.searchincite.server.data.DocumentData;
import com.searchincite.server.data.DocumentWrapper;

/**
 * 
 * @author north
 * 
 *         Number of concurrent conversions is limited by a semaphore.
 * 
 */
public abstract class star2star extends Thread {
    private static final int MAX_AVAILABLE = 10;

    protected static Semaphore available = new Semaphore(MAX_AVAILABLE, true);

    DocumentWrapper _doc = null;

    protected boolean success = false;

    protected boolean _testing = false;

    protected String documentType = null;

    protected String documentStatus = null;

    protected String dbQuery = null;

    /**
     * Function called for the actual conversion. Requires prepareForConversion(), convertDocument(), and prepareForDBCommit() to be implemented by the subclass.
     */
    @Override
    public void run() {
        boolean rc = true;
        try {
            //irccatdaemon irc = irccatdaemon.instance(); 
            //irc.sendMessage("#si-qa", "*2*: starting\n");
            
            available.acquire();
            // ** 1. set db status to 'converting' **
            setStatus(DocumentData.STATUS_CONVERT_READY);
            // db2input();

            // ** 2. begin the conversion **
            setStatus(DocumentData.STATUS_CONVERT_PRECONVERT);

            if (rc && prepareForConversion()) {
                setStatus(DocumentData.STATUS_CONVERT_CONVERTING);                
            } else {
                rc = false;
                setStatus(DocumentData.STATUS_CONVERT_ERROR);
                throw new Exception(); 
            }
            
            
            if (rc && convertDocument()) {
                setStatus(DocumentData.STATUS_CONVERT_POSTCONVERT);
            } else {
                rc = false;
                setStatus(DocumentData.STATUS_CONVERT_ERROR);
                throw new Exception();
            }
            
            
            // ** 3. end the conversion **
            if (rc && prepareForDBCommit()) {
                setStatus(DocumentData.STATUS_CONVERT_POSTCONVERT);
            } else {
                rc = false;
                setStatus(DocumentData.STATUS_CONVERT_ERROR);
                throw new Exception();
            }

            // ** 4. commit back to db **
            if (rc && output2db()) {
                setStatus(DocumentData.STATUS_CONVERT_DONE);
            } else {
                rc = false;
                setStatus(DocumentData.STATUS_CONVERT_ERROR);
                throw new Exception();
            }
            
            
        } catch (Exception e) {
            // if you get here then you won't release your semaphore
            e.printStackTrace();

            System.out.println("Failure for document:" + _doc.name);
        }
        success = rc;
        available.release();
    }

    public star2star(DocumentWrapper doc) {
        this._doc = doc;
    }

    /**
     * For overriding
     * 
     * @return true for success
     * @throws Exception
     */
    protected abstract boolean prepareForConversion() throws Exception;

    /**
     * For overriding
     * 
     * @return true for success
     * @throws Exception
     */
    protected abstract boolean convertDocument() throws Exception;

    /**
     * For overriding
     * 
     * @return true for success
     * @throws Exception
     */
    protected abstract boolean prepareForDBCommit() throws Exception;

    /**
     * Sets the value in the db to aStatus
     * 
     * @param aStatus
     * @return true for success
     * @throws SQLException
     */
    protected boolean setStatus(int aStatus) throws SQLException {
        boolean rc = true;
        _doc.updateStatus(aStatus);
        return rc;
    }

    /**
     * Dumps the bytes in _outBytes back into the database as converted plain text
     * 
     * @return true for success
     * @throws SQLException
     */
    public boolean output2db() throws SQLException {
        boolean rc = false;
        if (_doc == null) {
            rc = false;

        } else if (_testing) {
            // System.out.println(doc.plainText.toString());
        } else {
            _doc.updateDocumentPlainText();
            rc = true;
        }
        return rc;
    }

    public String getPlainText() {
        return new String(_doc.plainText);
    }

    public boolean isTesting(Object sender) {
        if (sender.getClass().getSuperclass().getName() == "junit.framework.TestCase") {
            _testing = true;
        }
        return _testing;
    }

    public boolean getSuccess() {
        return success;
    }
}
