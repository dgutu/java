package com.searchincite.server.docconverter;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Timer;
import java.util.TimerTask;

//import com.searchincite.server.irccatdaemon;
import com.searchincite.server.irccatdaemon;
import com.searchincite.server.data.DocumentData;
import com.searchincite.server.data.DocumentWrapper;

/**
 * This class should never be instantiated, rather the static method instance()
 * should be used.
 * 
 * This is a singleton pattern.
 * 
 * @author north
 * 
 */
public class dbpoller {
	private static final int POLLINTERVAL = 10000;
	private static final int POLLDELAY= 1000;
	private static dbpoller _instance = null;
	private Timer t;

	private dbpoller() {
		System.out.print("dbpoller: constructor\n");
		t = new Timer();
		t.schedule(new dbpollerTask(), POLLDELAY, POLLINTERVAL);
	}

	public static dbpoller instance() {
		System.out.print("dbpoller: instance\n");
		if (_instance == null) {
			System.out.print("dbpoller: instance-null\n");
			_instance = new dbpoller();
		}
		return _instance;
	}

	/**
	 * This function is the runloop for the dbpoller class.
	 */
	private class dbpollerTask extends TimerTask {
		private int c;

		public void run() {
			System.out.println("----------------------------------------------------------------------");
            System.out.print("dbpoller_task: starting\n");
		    //irccatdaemon irc = irccatdaemon.instance(); 
			//irc.sendMessage("#si-qa", "dbpoller_task: starting\n");
			try {
				System.out.println(c++);
				ResultSet rs = DocumentData.getDocumentWithStatus(DocumentData.STATUS_UPLOADED);
				while (rs.next()) {
					DocumentWrapper doc = new DocumentWrapper(rs);
					////				byte[] bytes = rs.getBytes("file_data");
					//// Create a factory to handle the stream
					star2star converter = ConverterFactory.generateConverter(doc);
					
					try{
					    
					    String s = star2star.class.getCanonicalName() + " : " + doc.name;
					    System.out.println(s);
					    //irc.sendMessage("#si-qa", "dbpoller_task: " + s + "\n");
					    if (converter != null)
					    	converter.run();
					    
				    } catch(Exception e) {
				        e.printStackTrace();
				    }
				}

				DocumentData.closeConnection(rs);

				if(c >= 10)
					java.lang.System.exit(1);
				// Time to play CATCH THAT EXCEPTION!
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.print("dbpoller_task: ending\n");
		}
	}
}
