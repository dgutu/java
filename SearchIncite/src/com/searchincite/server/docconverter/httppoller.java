package com.searchincite.server.docconverter;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

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
public class httppoller extends TimerTask {
	private static final int POLLINTERVAL = 60000 * 60;
	private static final int POLLDELAY = 1000;
	private static httppoller _instance = null;

	private httppoller() {
		Timer t = new Timer(true);
		t.schedule(this, POLLDELAY, POLLINTERVAL);
	}


	public static httppoller instance() {
		System.out.print("httppoller: instance\n");
		if (_instance == null) {
			System.out.print("httppoller: instance-null\n");
			_instance = new httppoller();
		}
		return _instance;
	}

	/**
	 * This function is the runloop for the httppoller class.
	 */
	@Override
	public void run() {
		ResultSet rs = null;
		try {
			rs = DocumentData.getAllURLs(true);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			while (rs.next()) {
				// Create a factory to handle the stream
				byte[] hashOld = rs.getBytes("hash");
				String URL = rs.getString("URL");
				String content = "";

				WebPageFetcher wpf = new WebPageFetcher(URL);

				content = wpf.getPageContent();

				MessageDigest digest = java.security.MessageDigest.getInstance("MD5");
				digest.update(content.getBytes());
				byte[] hashNew = digest.digest();

				if(hashOld == hashNew) {
					continue;
				}

				SimpleDateFormat format = new SimpleDateFormat("yyyy.mm.dd");
				DocumentWrapper doc = new DocumentWrapper(rs.getInt("org_id"), rs.getString("url") + "::" + format.format(new Date()), content.getBytes(), rs.getString("description"), rs.getInt("document_source_id"), rs.getInt("created_by"));
				doc.createDocument();
			}
			DocumentData.closeConnection(rs);
			// Time to play CATCH THAT EXCEPTION!
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
