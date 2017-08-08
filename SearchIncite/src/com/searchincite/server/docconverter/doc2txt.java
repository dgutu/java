package com.searchincite.server.docconverter;

import org.apache.poi.hwpf.HWPFDocument;

import com.searchincite.server.data.DocumentWrapper;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
//import org.apache.poi.hwpf.HWPFDocument;

import java.io.*;

public class doc2txt extends star2star {

	HWPFDocument doc;
	XWPFDocument docx;
	XWPFWordExtractor extractor;

	ByteArrayOutputStream out;

	/**
	 * 
	 * @param bytes
	 * @throws IOException
//	 */
	public doc2txt(DocumentWrapper doc) throws IOException {
		super(doc);
		out = new ByteArrayOutputStream();
	}

	@Override
	protected boolean prepareForConversion() throws IOException {
		boolean rc = true;
		InputStream in = new ByteArrayInputStream(_doc.rawBytes);
		try {
			if (_doc.name.toUpperCase().endsWith(".DOC")) {
				doc = new HWPFDocument(in);
			} else if (_doc.name.toUpperCase().endsWith(".DOCX")) {
	    		docx = new XWPFDocument(in);
	    		extractor = new XWPFWordExtractor(docx);    				
			}				
		} catch (Exception e) {
			rc = false;
		}
		return rc;
	}

	@Override
	protected boolean convertDocument() throws Exception {

		try {
			if (_doc.name.toUpperCase().endsWith(".DOC")) {
				writePlainText(((doc).getRange()).text());
			} else if (_doc.name.toUpperCase().endsWith(".DOCX")) {
				  writePlainText(extractor.getText());
			}
		}
		catch(Exception e) {
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
