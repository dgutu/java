/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci;

//import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.NamingException;

//import com.avectra._2005.NetForumXML;
import com.proximo.inci.jndi.InitialContextFactoryForTest;

import oracle.jdbc.pool.OracleDataSource;

/**
 * Abstract test to check that the specific service call is possible without errors. 
 */
public abstract class AbstractServiceTest {

	protected String DB_HOST = "64.90.169.216:1521";
    protected String DB_SID = "PROX06";
    protected String DB_URL = "jdbc:oracle:thin:@" + DB_HOST + ":" + DB_SID;
    protected String DB_USER = "CTFA_INCI_QA";
    protected String DB_PASSWORD = "CTFA_IX";
    protected String NETFORUM_USERNAME = "Proximoxweb";
    protected String NETFORUM_PASSWORD = "xwebProximo";

    private OracleDataSource dataSource;

    protected AbstractServiceTest(boolean withDataSource) throws SQLException, NamingException {
        createMockJndiContext();
        
        if (withDataSource) {
            initDataSource();
        }
        
        runTest();
    }

    private void createMockJndiContext() {
        // JNDI mock: sets up the InitialContextFactoryForTest as default factory.
        System.setProperty(Context.INITIAL_CONTEXT_FACTORY, InitialContextFactoryForTest.class.getName());
        initMockJndiContext();
    }

    /** Override in subclasses if needed. */
    protected void initMockJndiContext(){
    }

    /**
     * Here the test goes.
     */
    protected abstract void runTest();

    private void initDataSource() throws SQLException, NamingException {
        dataSource = new OracleDataSource();
        
        // read configuration file
        readConfigProperties();
        
        dataSource.setURL(DB_URL);
        dataSource.setUser(DB_USER);
        dataSource.setPassword(DB_PASSWORD);
        
        dataSource.setConnectionCachingEnabled(true);        
        Properties connCacheProps = new Properties ();
        connCacheProps.setProperty("InitialLimit", "10");
        connCacheProps.setProperty("MinLimit", "10");
        connCacheProps.setProperty("MaxLimit", "10000");
        /*
         * 15 minutes: free unused connections every 15 minutes,
         * to release load of the system.
         */
        connCacheProps.setProperty("InactivityTimeout", "900");
        /*
         * 2 minutes: a protection for a forgotten-to-close connections.
         */
        connCacheProps.setProperty("AbandonedConnectionTimeout", "120");
        connCacheProps.setProperty("ConnectionWaitTimeout", "5");
        dataSource.setConnectionCacheProperties(connCacheProps);

        InitialContextFactoryForTest.bind(DbConnectionManager.JNDI_INCI_DATASOURCE, dataSource);
    }
    
    private void readConfigProperties() {
    	Properties prop = new Properties();
    	
    	try {
			prop.load(new FileInputStream("config.properties"));
			DB_HOST = prop.getProperty("DB_HOST");
			DB_SID =  prop.getProperty("DB_SID");
			DB_USER = prop.getProperty("DB_USER");
			DB_PASSWORD = prop.getProperty("DB_PASSWORD");
			NETFORUM_USERNAME = prop.getProperty("NETFORUM_USERNAME");
			NETFORUM_PASSWORD = prop.getProperty("NETFORUM_PASSWORD");		
			
			//
	        System.out.println("DB_URL="+DB_URL);
	        System.out.println("DB_USER="+DB_USER);
	        System.out.println("DB_PASSWORD="+DB_PASSWORD);			
	        System.out.println("NETFORUM_USERNAME="+NETFORUM_USERNAME);
	        System.out.println("NETFORUM_PASSWORD="+NETFORUM_PASSWORD);
		} catch (IOException e) {
			System.out.println("Error read config.properties file !");
		}
    }

}
