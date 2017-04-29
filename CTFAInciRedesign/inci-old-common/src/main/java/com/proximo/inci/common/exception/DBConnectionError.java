package com.proximo.inci.common.exception;


import java.sql.SQLException;

public class DBConnectionError
    extends SQLException
{
    protected static String defaultMsg = new String("No database connection is available.");
    private String custMessage;

    public DBConnectionError ()
    {
        super (defaultMsg);
        custMessage = defaultMsg;
    }

    public DBConnectionError (String msg)
    {
        super (msg);
        custMessage = defaultMsg;
    }
    
    public String getCustMessage() {
        return custMessage;
    }
}
