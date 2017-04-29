/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.service.tradename;

import com.proximo.inci.DOList;

public class TradeNameSearchResult {
    
    private DOList tnList;
    
    private int totalCount;

    public TradeNameSearchResult(DOList tnList, int totalCount) {
        this.tnList = tnList;
        this.totalCount = totalCount;
    }

    public DOList getTnList() {
        return tnList;
    }

    public void setTnList(DOList tnList) {
        this.tnList = tnList;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }
    
}
