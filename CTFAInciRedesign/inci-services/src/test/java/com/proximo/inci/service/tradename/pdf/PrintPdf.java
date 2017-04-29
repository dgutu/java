/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.service.tradename.pdf;

import java.awt.Color;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.lowagie.text.Anchor;
import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Image;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfAction;
import com.lowagie.text.pdf.PdfWriter;
import com.proximo.inci.DOTradeName;

public class PrintPdf {
	
	private static Font smallFont = FontFactory.getFont("Calibri", 6, Font.BOLD, Color.black);
	private static Font smallFontLink = FontFactory.getFont("Calibri", 6, Font.BOLD, Color.red);
    private static Font normalFont = FontFactory.getFont("Calibri", 10, Font.NORMAL, Color.black);
    private static Font normalFontLink = FontFactory.getFont("Calibri", 10, Font.NORMAL, Color.red);
    private static Font boldFont = FontFactory.getFont("Calibri", 12, Font.BOLD, Color.black);
	
	public PrintPdf() {
	}
	
	public static byte[] generatePDF(DOTradeName tn, String text, String basepath) throws DocumentException, MalformedURLException, IOException {
		byte[] result = new byte[] {};
	
		ByteArrayOutputStream pdfByteOutputStream = new ByteArrayOutputStream();
		Document pdfDocument = new Document();

		PdfWriter.getInstance(pdfDocument, pdfByteOutputStream);
		
		pdfDocument.open();
		// first page
		addHeaderLogo(pdfDocument, basepath);
		title(pdfDocument, tn);
		currentDateTime(pdfDocument);
		addBodyText(pdfDocument, text);
		addFooterLogo(pdfDocument, basepath);
		addCopyright(pdfDocument);
		pdfDocument.close();
		result = pdfByteOutputStream.toByteArray();
		
		return result;
	}
	
	private static void addHeaderLogo(Document document, String basepath) throws MalformedURLException, IOException, DocumentException {
		Image image1 = Image.getInstance(basepath + "collage.jpg");
		image1.scaleAbsolute(document.getPageSize().width(), 50f);
		image1.setAlignment(Image.ALIGN_MIDDLE);		
        document.add(image1);        
	}
	
	private static void addFooterLogo(Document document, String basepath) throws MalformedURLException, IOException, DocumentException {
		Image image1 = Image.getInstance(basepath + "body_r3_c3.jpg");
		image1.scaleAbsolute(document.getPageSize().width(), 50f);
		image1.setAlignment(Image.ALIGN_MIDDLE);		
        document.add(image1);        
	}
	
	private static void title(Document document, DOTradeName tn) throws DocumentException {
		String title = "Payment for ";
		
		if (tn != null) {
			title += tn.tradeName + "(" ;
			title += tn.tnNumber + ")" ;
		} 
		
		Paragraph p = new Paragraph(title, boldFont);
		p.setAlignment(Element.ALIGN_CENTER);
		document.add(p);
		document.add(Chunk.NEWLINE);
	}
	
	private static void currentDateTime(Document document) throws DocumentException {
		DateFormat dateFormat = new SimpleDateFormat("d MMMM yyyy hh:mm aaa");
		Date dt = new Date();
		
		Paragraph p = new Paragraph(dateFormat.format(dt), normalFont);
		document.add(p);
		document.add(Chunk.NEWLINE);
	}
	
	private static void addBodyText(Document document, String text) throws DocumentException {
		String inciEmail = "inci@personalcarecouncil.org";
		String first = text.substring(1, text.indexOf(inciEmail));
		Paragraph p = new Paragraph(first, normalFont);
		p.add(new Chunk(" " + inciEmail, normalFontLink));
		String second = text.substring(text.indexOf(inciEmail)+inciEmail.length());
		p.add(new Chunk(second, normalFont));
		document.add(p);
		document.add(Chunk.NEWLINE);
	}
	
	private static void addCopyright(Document document) throws DocumentException, MalformedURLException {
		document.add(new Paragraph("Copyright \u00A9 2014 The Personal Care Products Council",smallFont));
		document.add(new Paragraph("1620 L Street, NW, Suite 1200, Washington, D.C. 20036 USA",smallFont));
		document.add(new Paragraph("telephone: (202) 331-1770 fax: (202) 331-1969",smallFont));
		
		Chunk policy = new Chunk("Privacy Policy / Terms of Use", smallFontLink);
	    policy.setAction(new PdfAction(new URL("http://localhost:8085/inci-app/VAADIN/themes/inci-app-theme/privacypolicy.html")));
		document.add(policy);
		document.add(new Paragraph(new Anchor("www.personalcarecouncil.org", smallFontLink)));
	}
}
