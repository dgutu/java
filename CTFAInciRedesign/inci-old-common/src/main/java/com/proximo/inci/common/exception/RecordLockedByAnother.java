package com.proximo.inci.common.exception;




public class RecordLockedByAnother
    extends Exception
{
	private static final long serialVersionUID = 100L; // improves speed of serialization

	private String userID;
	
    public RecordLockedByAnother () 
    {
    	this ("This record is already locked by another user.  Please choose it in view-only mode.");
    }
    
    public RecordLockedByAnother (String msg) 
    {
        super (msg);
        userID = null;
    }
    
    public void setUserID (String userID) { this.userID = userID; }
    public String getUserID () { return userID; }
    
}
