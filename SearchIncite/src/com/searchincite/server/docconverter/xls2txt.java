package com.searchincite.server.docconverter;

import org.apache.poi.hssf.extractor.ExcelExtractor;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.xssf.extractor.XSSFExcelExtractor;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.searchincite.server.data.DocumentWrapper;

import java.io.*;

public class xls2txt extends star2star {

	ExcelExtractor doc;
	XSSFExcelExtractor docx;
	ByteArrayOutputStream out;

	/**
	 * 
	 * @param bytes
	 * @throws IOException
	 */
	public xls2txt(DocumentWrapper doc) throws IOException {
		super(doc);
		out = new ByteArrayOutputStream();
	}

	@Override
	protected boolean prepareForConversion() throws IOException {
		boolean rc = true;
		InputStream in = new ByteArrayInputStream(_doc.rawBytes);
		try {
			if (_doc.name.toUpperCase().endsWith(".XLS")) {
				doc = new ExcelExtractor(new POIFSFileSystem(in));
			} else if (_doc.name.toUpperCase().endsWith(".XLSX")) {
				System.out.println("im here");
	    		XSSFWorkbook workbook = new XSSFWorkbook(in);
	    		docx = new XSSFExcelExtractor(workbook);    		
	    	}  
		} catch (Exception e) {
			rc = false;
		}
		return rc;
	}

	@Override
	protected boolean convertDocument() throws Exception {
		try {
			if (_doc.name.toUpperCase().endsWith(".XLS")) {
				writePlainText(doc.getText());
			} else if (_doc.name.toUpperCase().endsWith(".XLSX")) {
	    		writePlainText(docx.getText());
	    	}
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

	@Override
	protected boolean prepareForDBCommit() throws Exception {
		_doc.plainText = out.toByteArray();
		return true;
	}

	public void writePlainText(String text) throws IOException {
		out.write(text.getBytes());
	}
}
