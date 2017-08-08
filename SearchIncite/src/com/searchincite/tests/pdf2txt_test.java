package com.searchincite.tests;

import java.io.File;
import java.io.RandomAccessFile;

import com.searchincite.server.data.DocumentWrapper;
import com.searchincite.server.docconverter.pdf2txt;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class pdf2txt_test extends TestCase {

	@Override
	public int countTestCases() {
		// TODO Auto-generated method stub
		return 0;
	}

	File f = null;

	public pdf2txt_test(File f, String name) {
		super();
		setName(name);
		this.f = f;
	}

	public void testPDF() {
		try {

			byte[] bytes = new byte[(int) (f.length())];
			RandomAccessFile raf = new RandomAccessFile(f, "r");

			raf.readFully(bytes);

			DocumentWrapper doc = new DocumentWrapper(1, 1, f.getName(), bytes, f.getCanonicalPath(), 1, 1);
			
			pdf2txt c = new pdf2txt(doc);
			c.isTesting(this);

			c.run();
			while (c.isAlive()) {
				wait(50);
			}

			File expected = new File(System.getProperty("user.dir") + "/src/com/searchincite/tests/star2star/" + f.getName() + ".txt");
			RandomAccessFile ex = new RandomAccessFile(expected, "rw");

			byte[] exbytes = new byte[(int) (expected.length())];
			ex.readFully(exbytes);

			Assert.assertTrue("File ___" + f.getName() + "___ is not of recognized format", c.getSuccess());
			Assert.assertEquals("Does not match expected value", c.getPlainText(), (new String(exbytes)));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Test suite() {
		String ext = "pdf";
		TestSuite suite = new TestSuite(ext.toUpperCase() + " file conversion tests.");

		for (File f : AllTests.getFilesForExtension(ext)) {
			suite.addTest(new pdf2txt_test(f, "test" + ext.toUpperCase()));
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
