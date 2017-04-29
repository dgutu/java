package com.proximo.pcpc.pubedit.dao;

import com.proximo.pcpc.pubedit.model.Result;

public interface Pubedit {

	Result isTokenValid(String userToken);
	Result processApiData(String userToken, String dataType, String action, String data);
	Long getApiCallMasterUID();
	Long populatePeApiCalls(String userToken, String dataType, String action, String data, Long apiCallMasterUid);  
	Result processTrnFile(Long apiCallMasterUid);
}