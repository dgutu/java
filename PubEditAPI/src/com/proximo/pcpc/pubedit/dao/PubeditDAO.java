package com.proximo.pcpc.pubedit.dao;

import javax.naming.Context;
import javax.naming.InitialContext;

import org.apache.log4j.Logger;

import com.proximo.pcpc.pubedit.model.Result;

import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.OracleConnection;
import oracle.jdbc.internal.OracleTypes;
import oracle.jdbc.pool.OracleDataSource;

public class PubeditDAO implements Pubedit {
	static final Logger logger = Logger.getLogger(PubeditDAO.class);
	
	private OracleConnection conn = null;
	private OracleCallableStatement cs = null;
	static final String CONTEXT = "java:comp/env";	
	static final String RESOURCE = "jdbc/oracle_ctfa";
	
	@Override
	public Result isTokenValid(String userToken) {
		
		logger.debug("{call pubedit_api.validate_user_token("+userToken+",?)}");
		
		Result result = new Result();
		
		try {
			// get database connection
			getConnection();
			
			cs = (OracleCallableStatement) conn.prepareCall("{call pubedit_api.validate_user_token(?,?)}");
			cs.setString(1, userToken);
			cs.registerOutParameter(2, OracleTypes.SMALLINT);
			
			cs.execute();			
			result.setIsUserValid((cs.getInt(2) == 1) ? true : false);
		}
		catch(Exception ex) {
			logger.error(ex.getMessage());
			System.out.println(ex.getLocalizedMessage());
			ex.printStackTrace();
		}
		finally {
			freeResources();
		}
		
		return result;
	}

	@Override	
	public Result processApiData(String userToken, String dataType, String action, String data) {
		
		logger.debug("{call pubedit_api.process_api_data("+userToken+","+dataType+","+action+","+data+",?)}");
		
		Result result = new Result();
		
		try {
			// get database connection
			getConnection();
			
			cs = (OracleCallableStatement) conn.prepareCall("{call pubedit_api.process_api_data(?,?,?,?,?,?,?)}");
			
			cs.setString(1, userToken);
			cs.setString(2, dataType);
			cs.setString(3, action);
            cs.setStringForClob(4,data);
			cs.registerOutParameter(5, OracleTypes.NUMBER);
			cs.registerOutParameter(6, OracleTypes.NUMBER);
			cs.registerOutParameter(7, OracleTypes.VARCHAR);
			
			cs.execute();			
			
			// 
			result.setApiID(cs.getLong(5));
			result.setId(cs.getInt(6));
			result.setMessage(cs.getString(7));
			result.setIsUserValid(true);
		}
		catch(Exception ex) {
			logger.error(ex.getMessage());
			System.out.println(ex.getLocalizedMessage());
			ex.printStackTrace();
		}
		finally {
			freeResources();
		}
		
		return result; 
	}
	
	@Override
	public Long populatePeApiCalls(String userToken, String dataType, String action, String data, Long apiCallMasterUid) {
		
		logger.debug("{call pubedit_api.populate_pe_api_calls("+userToken+","+dataType+","+action+","+data+","+apiCallMasterUid+",?)}");
		
		Long result = 0l;
		
		try {
			// get database connection
			getConnection();
			
			cs = (OracleCallableStatement) conn.prepareCall("{call pubedit_api.populate_pe_api_calls(?,?,?,?,?,?)}");
			
			cs.setString(1, userToken);
			cs.setString(2, dataType);
			cs.setString(3, action);
            cs.setStringForClob(4,data);
            cs.setLong(5, apiCallMasterUid);
			cs.registerOutParameter(6, OracleTypes.NUMBER);
			
			cs.execute();			
			
			// 
			result = cs.getLong(6);
		}
		catch(Exception ex) {
			logger.error(ex.getMessage());
			System.out.println(ex.getLocalizedMessage());
			ex.printStackTrace();
		}
		finally {
			freeResources();
		}
		
		return result; 
		
	}
	
	@Override
	public Result processTrnFile(Long apiCallMasterUid) {
		
		logger.debug("{call pubedit_api.process_trn_file_api("+apiCallMasterUid+",?,?)}");
		
		Result result = new Result();
		
		try {
			// get database connection
			getConnection();
			
			cs = (OracleCallableStatement) conn.prepareCall("{call pubedit_api.process_trn_file_api(?,?,?)}");
			
			cs.setLong(1, apiCallMasterUid);
			cs.registerOutParameter(2, OracleTypes.NUMBER);
			cs.registerOutParameter(3, OracleTypes.VARCHAR);
			
			cs.execute();			
			
			// 
			result.setApiID(apiCallMasterUid);
			result.setId(cs.getInt(2));
			result.setMessage(cs.getString(3));
			result.setIsUserValid(true);
		}
		catch(Exception ex) {
			logger.error(ex.getMessage());
			System.out.println(ex.getLocalizedMessage());
			ex.printStackTrace();
		}
		finally {
			freeResources();
		}
		
		return result; 		
	}
	
	@Override	
	public Long getApiCallMasterUID() {
		
		logger.debug("{call pubedit_api.get_api_call_master_uid()}");
		
		Long result = 0l;
		
		try {
			// get database connection
			getConnection();
			
			cs = (OracleCallableStatement) conn.prepareCall("{? = call pubedit_api.get_api_call_master_uid()}");
			
			cs.registerOutParameter(1, OracleTypes.NUMBER);
			
			cs.execute();			
			
			// 
			result = cs.getLong(1);
		}
		catch(Exception ex) {
			logger.error(ex.getMessage());
			System.out.println(ex.getLocalizedMessage());
			ex.printStackTrace();
		}
		finally {
			freeResources();
		}
		
		return result; 
	}	
	
	
	// get oracle connection
	public void getConnection() {
		try {
			Context initialContext = new InitialContext();
			Context environmentContext = (Context) initialContext.lookup(CONTEXT);
			OracleDataSource dataSource = (OracleDataSource) environmentContext.lookup(RESOURCE);
			conn = (OracleConnection) dataSource.getConnection();			
		}
		catch(Exception ex) {
			logger.error(ex.getMessage());
			System.out.println(ex.getLocalizedMessage());
		}
	}
	
	public void freeResources() {
		try {
			if (conn != null)
				conn.close();
			
			if (cs != null) 
				cs.close();			
		}
		catch(Exception ex) {
			logger.error(ex.getMessage());
			System.out.println(ex.getLocalizedMessage());
		}
	}

}
