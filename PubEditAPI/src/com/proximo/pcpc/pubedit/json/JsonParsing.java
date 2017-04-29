package com.proximo.pcpc.pubedit.json;

import java.lang.reflect.Type;
import java.util.List;

import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.proximo.pcpc.pubedit.dao.Pubedit;
import com.proximo.pcpc.pubedit.dao.PubeditDAO;
import com.proximo.pcpc.pubedit.model.Result;

public class JsonParsing {
	
	static final Logger logger = Logger.getLogger(JsonParsing.class);	

	public static String parse(Object obj) {
		Gson json = new Gson();
		StringBuilder sb = new StringBuilder();
		Pubedit pubeditApi = new PubeditDAO();		
		Result result = new Result();
		
		String output = json.toJson(obj);
		
		JsonElement jelement = new JsonParser().parse(output);
		JsonObject  jobject = jelement.getAsJsonObject();
		
		String token = jobject.get("token").getAsString();
		
		result = pubeditApi.isTokenValid(token);	
		if (!result.isUserValid()) {
			return json.toJson(result) ;
		}
		
		JsonArray jarray = jobject.getAsJsonArray("tr");
		
		Long apiCallMasterUID = pubeditApi.getApiCallMasterUID();
		
		for (int i=0; i<jarray.size();i++) {
			InputJson inputJson = (InputJson)json.fromJson(jarray.get(i).getAsJsonObject(),InputJson.class); 
			String dataType = inputJson.getDataType();
			String action = inputJson.getAction();
			String data = inputJson.getData();
			
			logger.debug("token: " + token);
			logger.debug("data_type: " + dataType);
			logger.debug("action: " + action);
			logger.debug("data: " + data);
			
			pubeditApi.populatePeApiCalls(token, dataType, action, data, apiCallMasterUID);
		}
		
		// process tr file
		sb.append(json.toJson(pubeditApi.processTrnFile(apiCallMasterUID)));
		return sb.toString();
	}
	
	
	public static String parse_old(Object obj) {
		Gson json = new Gson();
		String output = json.toJson(obj);
		StringBuilder sb = new StringBuilder();
		Pubedit pubeditApi = new PubeditDAO();
		
		sb.append("[");
		
		Type collectionType = new TypeToken<List<InputJson>>(){}.getType();
		List<?> lcs = (List<?>)json.fromJson(output, collectionType);
	    
		for (int i=0; i<lcs.size();i++) {
			InputJson inputJson = (InputJson)lcs.get(i);
			String token = inputJson.getToken();
			String dataType = inputJson.getDataType();
			String action = inputJson.getAction();
			String data = inputJson.getData();
			
			logger.debug("token: " + token);
			logger.debug("data_type: " + dataType);
			logger.debug("action: " + action);
			logger.debug("data: " + data);
			
			Result result = pubeditApi.isTokenValid(token);
			
			if (!result.isUserValid()) {
				sb.append(json.toJson(result));
			}
			else {
				sb.append(json.toJson(pubeditApi.processApiData(token, dataType, action, data)));
			}
			
			if (i<=lcs.size()-2)
				sb.append(",\n");
		}
		
		sb.append("]");
		
		return sb.toString();
	}
}
