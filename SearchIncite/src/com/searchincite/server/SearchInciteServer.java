package com.searchincite.server;

// import org.apache.commons.configuration.ConfigurationException;
// import org.apache.commons.configuration.XMLConfiguration;

import com.searchincite.server.docconverter.dbpoller;
import com.searchincite.server.docconverter.httppoller;


/**
 * 
 * @author north
 *
 */
public class SearchInciteServer {
	/**
	 * Main function to setup any server processes
	 * @param argv
	 * @throws Exception 
	 */
	public static void main(String argv[]) throws Exception{
		System.out.println("Search Incite Converter: Entering\n");
        //irccatdaemon.instance();
		dbpoller.instance();
		httppoller.instance();
		System.out.println("Search Incite Converter: Exiting\n");

	}
}
