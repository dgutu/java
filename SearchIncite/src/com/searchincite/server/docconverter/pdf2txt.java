package com.searchincite.server.docconverter;

import java.io.ByteArrayInputStream;
import java.io.StringWriter;
import org.pdfbox.pdmodel.PDDocument;
import org.pdfbox.util.PDFTextStripper;

import com.searchincite.server.data.DocumentWrapper;

public class pdf2txt extends star2star {
	public pdf2txt(DocumentWrapper doc) {
		super(doc);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean prepareForConversion() throws Exception {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	protected boolean convertDocument() throws Exception {
		// byte[] buffer = new byte[_inBytes.length];
		ByteArrayInputStream in = new ByteArrayInputStream(_doc.rawBytes);
		PDDocument document = PDDocument.load(in);

		PDFTextStripper stripper = new PDFTextStripper();
		StringWriter output = new StringWriter();
		
		boolean sort = false;
		int startPage = 1;
		int endPage = document.getNumberOfPages();

		stripper.setSortByPosition(sort);
		stripper.setStartPage(startPage);
		stripper.setEndPage(endPage);
		stripper.writeText(document, output);

		_doc.plainText = output.toString().getBytes();
		document.close();
		return true;
	}

	@Override
	protected boolean prepareForDBCommit() throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
