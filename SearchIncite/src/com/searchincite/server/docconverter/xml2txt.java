package com.searchincite.server.docconverter;

import org.apache.poi.hwpf.HWPFDocument;

import com.searchincite.server.data.DocumentWrapper;

import java.io.*;

public class xml2txt extends star2star {

	HWPFDocument doc;

	ByteArrayOutputStream out;

	/**
	 * 
	 * @param bytes
	 * @throws IOException
//	 */
	public xml2txt(DocumentWrapper doc) throws IOException {
		super(doc);
		out = new ByteArrayOutputStream();
	}

	@Override
	protected boolean prepareForConversion() throws IOException {
		boolean rc = true;
		InputStream in = new ByteArrayInputStream(_doc.rawBytes);
		try {
			doc = new HWPFDocument(in);
		} catch (Exception e) {
			rc = false;
		}
		return rc;
	}

	@Override
	protected boolean convertDocument() throws Exception {

		writePlainText(((doc).getRange()).text());

		return false;
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
