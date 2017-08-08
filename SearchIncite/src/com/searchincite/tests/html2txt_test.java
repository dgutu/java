/**
 * 
 */
package com.searchincite.tests;

import java.util.Vector;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.searchincite.server.data.DocumentWrapper;
import com.searchincite.server.docconverter.html2txt;

/**
 * @author north
 * 
 */
public class html2txt_test extends TestCase {
	String url;
	public html2txt_test(String url, String name) {
		super();
		this.url = url;
		setName(name);
	}

	public void testHTML(){
		try {

			DocumentWrapper doc = new DocumentWrapper(1, 1, url, "".getBytes(), "description", 1, 1);

			html2txt c = new html2txt(doc);
			c.isTesting(this);

			c.run();
			while (c.isAlive()) {
				wait(500);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Test suite() {
		String ext = "html";
		TestSuite suite = new TestSuite(ext.toUpperCase() + " file conversion tests.");

		Vector<String> urls = new Vector<String>();
		urls.add("http://example.com");
		urls.add("http://northisup.com/blog/powermonkey-explorer/");
		for (String url : urls) {
			suite.addTest(new html2txt_test(url, "test" + ext.toUpperCase()));
		}
		return suite;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#setUp()
	 */
	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#tearDown()
	 */
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
