package com.proximo.inci.common.exception;



public class TemplarException
    extends Exception
{
	private static final long serialVersionUID = 100L; // improves speed of serialization

    private String defaultMsg;
    private String msg;

    public TemplarException ()
    {
        this ("");
    }
    
    public TemplarException (String msg)
    {
        super (msg);
        this.msg = msg;
        this.defaultMsg = new String("The application has encountered an internal error. This may cause the application " +
                            "running in an unstable situation. Please exit and try again. " +
                            "If the problem persists, please call for support.");
    }
    
    public TemplarException (Exception e) {
        this (e.getMessage(), "");
    }

    public TemplarException (String msg, String defaultText)
    {
        super (msg);
        this.msg = msg;
        this.defaultMsg = defaultText;
    }

    public String getMessage() {
        return msg;
    }
    public void setMessage(String msg) { this.msg = msg; }

    public String getDefaultMsg() {
        return defaultMsg;
    }
    public void setDefaultMsg(String msg) { this.defaultMsg = msg; }


}
