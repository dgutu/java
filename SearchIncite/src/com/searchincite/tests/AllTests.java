package com.searchincite.tests;

import java.io.File;
import java.io.FileFilter;
import java.util.Vector;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {
	
	public static TestSuite suite = null;
	
	public static void main(String[] args) {		
		junit.textui.TestRunner.run(suite());
	}
	
	public static Test suite() {
		suite = new TestSuite("All Tests");
		// $JUnit-BEGIN$
		suite.addTest(FormatIdentificationTest.suite());
		suite.addTest(doc2txt_test.suite());
		suite.addTest(html2txt_test.suite());
		suite.addTest(pdf2txt_test.suite());
		suite.addTest(xls2txt_test.suite());
		// $JUnit-END$
		return suite;
		
	}
	

	
	protected static Vector<File> getFilesForExtension(final String ext){
		Vector<File> testFiles = new Vector<File>();

		String testDir = System.getProperty("user.dir") + "/src/com/searchincite/tests/star2star";

		FileFilter testFilesFilter = new FileFilter() {
			public boolean accept(File file) {
				return !file.getName().startsWith(".") && file.getName().endsWith("." + ext);
			}
		};

		
		File dir = new File(testDir);
		for (File f : dir.listFiles(testFilesFilter)) {
			testFiles.add(f);
		}
		return testFiles;
	}

}
