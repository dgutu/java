package com.searchincite.tests;


import java.io.File;
import java.io.FileFilter;
import java.io.RandomAccessFile;
import java.util.Vector;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.searchincite.server.docconverter.identification.FormatDescription;
import com.searchincite.server.docconverter.identification.FormatIdentification;

/**
 * @author north
 * 
 */
public class FormatIdentificationTest extends TestCase {
	File f = null;
	FormatDescription desc;

	
	public FormatIdentificationTest(File f, String name) {
		super();
		setName(name);
		this.f = f;
	}

	public void testFormatIdentification() throws Exception {		
		assertNotNull(desc);

		System.out.println("Format=" + desc.getShortName() + ", MIME type=" + desc.getMimeType());
	}

	public static Test suite() {
		TestSuite suite = new TestSuite("Format identification tests");
		
		Vector<File> testFiles = new Vector<File>();

		String testDir = System.getProperty("user.dir") + "/src/com/searchincite/tests/star2star";

		FileFilter testFilesFilter = new FileFilter() {
			public boolean accept(File file) {
				return !file.getName().startsWith(".")&&!file.getName().endsWith(".txt");
			}
		};

		
		File dir = new File(testDir);
		for (File f : dir.listFiles(testFilesFilter)) {
			testFiles.add(f);
		}
		
		for (File f : testFiles) {
			suite.addTest(new FormatIdentificationTest(f, "testFormatIdentification"));
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
		byte[] bytes = new byte[(int) (f.length())];
		RandomAccessFile raf = new RandomAccessFile(f, "r");

		raf.readFully(bytes);
		desc = FormatIdentification.identify(bytes);
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
