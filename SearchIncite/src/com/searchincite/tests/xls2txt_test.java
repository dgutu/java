/**
 * 
 */
package com.searchincite.tests;

import java.io.File;
import java.io.FileOutputStream;

import java.io.RandomAccessFile;

import com.searchincite.server.data.DocumentWrapper;
import com.searchincite.server.docconverter.xls2txt;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * @author north
 * 
 */
public class xls2txt_test extends TestCase {
	File f = null;

	public xls2txt_test(File f, String name) {
		super();
		setName(name);
		this.f = f;
	}

	public void testXLS() {
		try {

			byte[] bytes = new byte[(int) (f.length())];
			RandomAccessFile raf = new RandomAccessFile(f, "r");

			raf.readFully(bytes);
			DocumentWrapper doc = new DocumentWrapper(1, 1, f.getName(), bytes, f.getCanonicalPath(), 1, 1);

			xls2txt c = new xls2txt(doc);
			c.isTesting(this);

			c.run();
			while (c.isAlive()) {
				wait(500);
			}

			File expected = new File(System.getProperty("user.dir") + "/src/com/searchincite/tests/star2star/" + f.getName() + ".txt");
			RandomAccessFile ex = new RandomAccessFile(expected, "r");

			// FileOutputStream fos = new FileOutputStream(expected);
			// fos.write(c.getPlainText().getBytes());

			byte[] exbytes = new byte[(int) (expected.length())];
			ex.readFully(exbytes);

			TestCase.assertTrue("File ___" + f.getName() + "___ is not of recognized format", c.getSuccess());
			TestCase.assertEquals("Does not match expected value", c.getPlainText(), (new String(exbytes)));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Test suite() {
		String ext = "xls";
		TestSuite suite = new TestSuite(ext.toUpperCase() + " file conversion tests.");
		for (File f : AllTests.getFilesForExtension(ext)) {
			suite.addTest(new xls2txt_test(f, "test" + ext.toUpperCase()));
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
