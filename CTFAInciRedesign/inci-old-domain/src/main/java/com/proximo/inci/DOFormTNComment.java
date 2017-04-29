package com.proximo.inci;

import com.proximo.inci.common.DODataRecord;
import com.proximo.inci.common.TDate;
import com.proximo.inci.common.exception.InvalidData;


public class DOFormTNComment 
    extends DODataRecord 
{
    public long tnRecID;
    public String subject;
    public boolean isClosed;
    public String msgBody;
    public TDate sentDt;
    public TDate closeDt;

    public DOFormTNComment() {
        super();
        clear();
    }

    public void clear() {
        recID = 0;
        tnRecID = 0;
        subject = "";
        isClosed = false;
        msgBody = "";
        sentDt = new TDate();
        closeDt = new TDate();
        sentDt.setNull();
        closeDt.setNull();
    }

    public static void validate(DODataRecord d)
      throws InvalidData 
    {
        DOFormTNComment i = (DOFormTNComment)d;
    }

    public Object clone() {
        DOFormTNComment tnComment = (DOFormTNComment)super.clone();
        tnComment.tnRecID = this.tnRecID;
        tnComment.subject = this.subject;
        tnComment.isClosed = this.isClosed;
        tnComment.msgBody = this.msgBody;
        tnComment.sentDt = (TDate)this.sentDt.clone();
        tnComment.closeDt = (TDate)this.closeDt.clone();

        return tnComment;
    }  
}
