/**
 * 
 */
package com.searchincite.tests;

import java.io.File;
import java.io.RandomAccessFile;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.searchincite.server.data.DocumentWrapper;
import com.searchincite.server.docconverter.doc2txt;

/**
 * @author north
 * 
 */
public class doc2txt_test extends TestCase {
	File f = null;

	public doc2txt_test(File f, String name) {
		super();
		setName(name);
		this.f = f;
	}

	public void testDOC() {
		try {

			byte[] bytes = new byte[(int) (f.length())];
			RandomAccessFile raf = new RandomAccessFile(f, "r");

			raf.readFully(bytes);

			DocumentWrapper doc = new DocumentWrapper(1, 1, f.getName(), bytes, f.getCanonicalPath(), 1, 1);

			doc2txt c = new doc2txt(doc);
			c.isTesting(this);

			c.run();
			while (c.isAlive()) {
				wait(500);
			}

			File expected = new File(System.getProperty("user.dir") + "/src/com/searchincite/tests/star2star/" + f.getName() + ".txt");
			RandomAccessFile ex = new RandomAccessFile(expected, "r");

			byte[] exbytes = new byte[(int) (expected.length())];
			ex.readFully(exbytes);

			TestCase.assertTrue("File ___" + f.getName() + "___ is not of recognized format", c.getSuccess());
			TestCase.assertEquals("Does not match expected value", c.getPlainText(), (new String(exbytes)));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Test suite() {
		String ext = "doc";
		TestSuite suite = new TestSuite(ext.toUpperCase() + " file conversion tests.");

		for (File f : AllTests.getFilesForExtension(ext)) {
			suite.addTest(new doc2txt_test(f, "test" + ext.toUpperCase()));
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
