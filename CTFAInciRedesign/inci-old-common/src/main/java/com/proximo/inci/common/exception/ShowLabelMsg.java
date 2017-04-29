package com.proximo.inci.common.exception;




public class ShowLabelMsg
    extends Exception
{
	private static final long serialVersionUID = 100L; // improves speed of serialization

    private String msg;
    private String title;

    public ShowLabelMsg () {
        this("", "");
    }

    public ShowLabelMsg (String msg) {
        this(msg, "Error");
    }

    public ShowLabelMsg (String msg, String title)
    {
        super (msg);
        this.msg = msg;
        this.title = title;
    }

    public String toString () { return msg; }

    public String getTitle() { return title; }
}
