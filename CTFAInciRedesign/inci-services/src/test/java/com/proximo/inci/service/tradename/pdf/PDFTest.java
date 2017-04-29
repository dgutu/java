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

import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Image;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;
import com.proximo.inci.DOTNCompany;
import com.proximo.inci.DOTradeName;
import com.proximo.inci.common.TDate;
import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.service.security.SecurityService;
import com.proximo.inci.service.security.user.User;



public class PDFTest {

	private static Font smallFont = FontFactory.getFont("Calibri", 8, Font.BOLD, Color.black);
    private static Font normalFont = FontFactory.getFont("Calibri", 10, Font.NORMAL, Color.black);
    private static Font italicFont = FontFactory.getFont("Calibri", 10, Font.ITALIC, Color.black);
    private static Font boldFont = FontFactory.getFont("Calibri", 12, Font.BOLD, Color.black);
    private static Font boldFont2 = FontFactory.getFont("Calibri", 11, Font.BOLD, Color.black);
	
	public PDFTest() {
		
	}
	
	public static byte[] asssignmentNoticeAttachment(DOTradeName tn, User user, String basepath) throws DocumentException, MalformedURLException, IOException {
		byte[] result = new byte[] {};
	
		ByteArrayOutputStream pdfByteOutputStream = new ByteArrayOutputStream();
		Document pdfDocument = new Document();

		PdfWriter.getInstance(pdfDocument, pdfByteOutputStream);
		
		//User user = null;
		
		/*try {
		if (!TemplarUtil.isStringNullOrEmpty(tn.userRecId))
			user = SecurityService.findUserByRecId(tn.userRecId);
		}
		catch(Exception ex) {
			System.out.println(ex.getLocalizedMessage());
		}*/
		
		
		pdfDocument.open();
		// first page
		addCompanyLogo(pdfDocument, basepath);
		addAssignmentDate(pdfDocument, tn);
		addUserInformation(pdfDocument, tn, user);
		addLetterBodyText(pdfDocument, basepath);
		
		// next page
		pdfDocument.add(Chunk.NEXTPAGE);
		pdfDocument.add(new Chunk("Page 2", smallFont));
		addCompanyLogo(pdfDocument, basepath);
		addAssignmentDate(pdfDocument, tn);
		addAppNoBold(pdfDocument, tn);
		secondPage(pdfDocument, tn, user);
		pdfDocument.close();
		
		result = pdfByteOutputStream.toByteArray();
		
		return result;
	}
	
	private static void addCompanyLogo(Document document, String basepath) throws MalformedURLException, IOException, DocumentException {
		Image image1 = Image.getInstance(basepath + "logo.png");
		image1.scaleAbsolute(200f, 50f);
		image1.setAlignment(Image.ALIGN_MIDDLE);		
        document.add(image1);        
	}
	
	private static void addAssignmentDate(Document document, DOTradeName tn) throws DocumentException {
		String assignmentDate = null;
		
		
		if (tn != null && !tn.inciNameDt.isNull()) {
			assignmentDate = tn.inciNameDt.getLongMonth() + " ";
			assignmentDate += String.valueOf(tn.inciNameDt.getDay()) + ", ";
			assignmentDate += String.valueOf(tn.inciNameDt.getYear());
		}
		else {
			assignmentDate = TDate.rightNow().getDay() + ", " + TDate.rightNow().getYear();
		}
		
		Paragraph p = new Paragraph(assignmentDate, normalFont);
		document.add(p);
		document.add(Chunk.NEWLINE);
	}
	
	private static void addUserInformation(Document document, DOTradeName tn, User user) throws DocumentException {
		String userInformation = null;
		
		if (user != null) {
			userInformation = user.getUserFullName();
			if (!TemplarUtil.isStringNullOrEmpty(user.getAddress1()))
				userInformation += "\n" + user.getAddress1();
			
			if (!TemplarUtil.isStringNullOrEmpty(user.getAddress2()))
				userInformation += "\n" + user.getAddress2();
			
			if (!TemplarUtil.isStringNullOrEmpty(user.getAddress3()))
				userInformation += "\n" + user.getAddress3();
			
			String text = "";
			
			if (!TemplarUtil.isStringNullOrEmpty(user.getCity()))
				text = user.getCity();
			
			if (!TemplarUtil.isStringNullOrEmpty(user.getStateOrProvince())) {
				if (!TemplarUtil.isStringNullOrEmpty(text)) text += ", ";
				text += user.getStateOrProvince();
			}
			
			if (!TemplarUtil.isStringNullOrEmpty(user.getZip())) {
				if (!TemplarUtil.isStringNullOrEmpty(text)) text += ", ";
				text += user.getZip();
			}
			
			if (!TemplarUtil.isStringNullOrEmpty(text))
				userInformation += "\n" + text;
			
			
			if (!TemplarUtil.isStringNullOrEmpty(user.getCountryLong()))
				userInformation += "\n" + convertCountry(user.getCountryLong());
		}
		
		Paragraph p = new Paragraph((userInformation == null ? "" : userInformation), normalFont);
		document.add(p);
		document.add(Chunk.NEWLINE);
		
		// --------------
		addAppNo(document, tn);
		
		Paragraph p1 = new Paragraph((user != null && !TemplarUtil.isStringNullOrEmpty(user.getUserFullName()) ? "Dear " + user.getUserFullName() + ":" : ""), normalFont);
		document.add(p1);
		document.add(Chunk.NEWLINE);
	}
	
	private static void addUserInformationPage2(Document document, DOTradeName tn, User user) throws DocumentException {
		String userInformation = null;
		
		if (user != null) {
			userInformation = user.getUserFullName();
			if (!TemplarUtil.isStringNullOrEmpty(user.getAddress1()))
				userInformation += "\n" + user.getAddress1();
			
			if (!TemplarUtil.isStringNullOrEmpty(user.getAddress2()))
				userInformation += "\n" + user.getAddress2();
			
			if (!TemplarUtil.isStringNullOrEmpty(user.getAddress3()))
				userInformation += "\n" + user.getAddress3();
			
			String text = "";
			
			if (!TemplarUtil.isStringNullOrEmpty(user.getCity()))
				text = user.getCity();
			
			if (!TemplarUtil.isStringNullOrEmpty(user.getStateOrProvince())) {
				if (!TemplarUtil.isStringNullOrEmpty(text)) text += ", ";
				text += user.getStateOrProvince();
			}
			
			if (!TemplarUtil.isStringNullOrEmpty(user.getZip())) {
				if (!TemplarUtil.isStringNullOrEmpty(text)) text += ", ";
				text += user.getZip();
			}
			
			if (!TemplarUtil.isStringNullOrEmpty(text))
				userInformation += "\n" + text;
			
			
			if (!TemplarUtil.isStringNullOrEmpty(user.getCountryLong()))
				userInformation += "\n" + convertCountry(user.getCountryLong());
		}
		
		Paragraph p = new Paragraph((userInformation == null ? "" : userInformation), normalFont);
		document.add(p);
		document.add(Chunk.NEWLINE);
	}
	
	private static void addPublicationInformation(Document document, DOTradeName tn, User user) throws DocumentException {
		String pubInformation = null;
		
		DOTNCompany comp = null;
		
		if (tn.pubCompany != null)
			comp = tn.pubCompany;
		
		if (comp != null) {
			pubInformation = comp.name;
			if (!TemplarUtil.isStringNullOrEmpty(comp.addrLine1))
				pubInformation += "\n" + comp.addrLine1;
			
			if (!TemplarUtil.isStringNullOrEmpty(comp.addrLine2))
				pubInformation += "\n" + comp.addrLine2;
			
			if (!TemplarUtil.isStringNullOrEmpty(comp.addrLine3))
				pubInformation += "\n" + comp.addrLine3;
			
			String text = "";
			
			if (!TemplarUtil.isStringNullOrEmpty(comp.city))
				text = comp.city;
			
			if (!TemplarUtil.isStringNullOrEmpty(comp.state)) {
				if (!TemplarUtil.isStringNullOrEmpty(text)) text += ", ";
				text += comp.state;
			}
			
			if (!TemplarUtil.isStringNullOrEmpty(comp.zip)) {
				if (!TemplarUtil.isStringNullOrEmpty(text)) text += ", ";
				text += comp.zip;
			}
			
			if (!TemplarUtil.isStringNullOrEmpty(text))
				pubInformation += "\n" + text;
			
			
			if (!TemplarUtil.isStringNullOrEmpty(comp.countryLong))
				pubInformation += "\n" + comp.countryLong;
		}
		
		Paragraph p = new Paragraph((pubInformation == null ? "" : pubInformation), normalFont);
		document.add(p);
		document.add(Chunk.NEWLINE);
	}
	
	
	
	private static void addAppNo(Document document, DOTradeName tn) throws DocumentException {
		String appNo = null;		
		
		if (tn != null && !TemplarUtil.isStringNullOrEmpty(tn.tnNumber)) {
			appNo = "RE: Application No. " + tn.tnNumber;
		} 
		
		Paragraph p = new Paragraph(appNo, normalFont);
		document.add(p);
		document.add(Chunk.NEWLINE);
	}
	
	private static void addAppNoBold(Document document, DOTradeName tn) throws DocumentException {
		String appNo = null;		
		
		if (tn != null && !TemplarUtil.isStringNullOrEmpty(tn.tnNumber)) {
			appNo = "Application No. " + tn.tnNumber;
		} 
		
		Paragraph p = new Paragraph(appNo, boldFont);
		document.add(p);
		document.add(Chunk.NEWLINE);
	}
	
	private static void secondPage(Document document, DOTradeName tn, User user) throws DocumentException {
		String text = "Submitted By:";		
		Paragraph p = new Paragraph(text, boldFont2);
		document.add(p);
		
		addUserInformationPage2(document, tn, user);
		
		document.add(new Paragraph("Manufactured By:", boldFont2));
		
		addPublicationInformation(document, tn, user);
		
		document.add(new Paragraph("Trade Name:", boldFont2));
		
		if (tn.published) {
			document.add(new Paragraph((!TemplarUtil.isStringNullOrEmpty(tn.tradeName) ? tn.tradeName : ""), normalFont));
		}
		else {
			document.add(new Paragraph("(Not for publication)", normalFont));
			document.add(new Paragraph((!TemplarUtil.isStringNullOrEmpty(tn.tradeName) ? tn.tradeName : ""), normalFont));
		}
		document.add(Chunk.NEWLINE);
		
		document.add(new Paragraph("Assigned INCI Name:", boldFont2));
		document.add(new Paragraph((!TemplarUtil.isStringNullOrEmpty(tn.inciName) ? tn.inciName : ""), normalFont));
	}
	
	private static void addLetterBodyText(Document document, String basepath) throws DocumentException, MalformedURLException, IOException {
		String text = "In reference to the INCI application noted above, the International Cosmetic Ingredient Nomenclature Committee (INC) has completed its review of your request. The INCI name assigned to the trade name identified in this application is detailed on the attachment.";
		Paragraph p = new Paragraph(text, normalFont);
		document.add(p);
		document.add(Chunk.NEWLINE);
		
		//-------
		text = "Please note, the attachment lists information from your application as it appears in our data base and will be published in the ";
		Paragraph p1 = new Paragraph(text, normalFont);
		//document.add(p1);
		p1.add(new Chunk("International Cosmetic Ingredient Dictionary and Handbook, ", italicFont));
		p1.add(new Chunk("the web-based Dictionary ", normalFont));
		p1.add(new Chunk("wINCI", italicFont));
		p1.add(new Chunk(", and the Council’s ", normalFont));
		p1.add(new Chunk("On-Line INFOBASE. ", italicFont));
		p1.add(new Chunk("If your application indicates the trade name is \"not for publication,\" it is noted on the attachment and the data will not be published.", normalFont));
		document.add(p1);
		//
		document.add(Chunk.NEWLINE);
		
		//---------
		text = "It is important to carefully check the attachment for accuracy and respond to our office promptly with any changes. The INCI name assignment and related company information will be retained in our data base unless we are notified that the product is no longer manufactured. You will be contacted on an approximate annual basis to update the current status of your company listings. This communication will include only trade names and addresses; therefore it is imperative that you maintain accurate records of all INCI name assignments.";
		Paragraph p2 = new Paragraph(text, normalFont);
		document.add(p2);
		document.add(Chunk.NEWLINE);
		
		text = "To petition for a change in an INCI name assignment, a request to the INC can be sent via email to my attention. The petition should include the current INCI name, trade name, application number, requested revision, and technical rationale to support the petition, e.g., supporting composition information, and/or manufacturing details, and analytical data where appropriate.";		
		Paragraph p3 = new Paragraph(text, normalFont);
		document.add(p3);
		document.add(Chunk.NEWLINE);
		
		text = "In addition, please be advised that INCI names are continually reviewed by the INC for accuracy, and may be subject to change when deemed necessary.";		
		Paragraph p4 = new Paragraph(text, normalFont);
		document.add(p4);
		document.add(Chunk.NEWLINE);

		text = "Should you have any questions, please don’t hesitate to contact me for further information.";		
		Paragraph p5 = new Paragraph(text, normalFont);
		document.add(p5);
		document.add(Chunk.NEWLINE);
		
		text = "Sincerely,";		
		Paragraph p6 = new Paragraph(text, normalFont);
		document.add(p6);
		//document.add(Chunk.NEWLINE);
		
		addSignature(document, basepath);
		
		//document.add(Chunk.NEWLINE);
		text = "Joanne M. Nikitakis\nDirector, Cosmetic Chemistry\n" + "nikitakisj@personalcarecouncil.org\nEnclosure";
		
		Paragraph p7 = new Paragraph(text, normalFont);
		document.add(p7);
		document.add(Chunk.NEWLINE);
		
	}
	
	private static void addSignature(Document document, String basepath) throws MalformedURLException, IOException, DocumentException {
		Image image1 = Image.getInstance(basepath + "JMNSignature.PNG");
		//Image image1 = Image.getInstance(basepath + CaptionResolver.getCaption("JMNSignature"));
		image1.scaleAbsolute(120f, 30f);
		image1.setAlignment(Image.ALIGN_LEFT);		
        document.add(image1);        
	}
	
	private static String convertCountry(String country) {
		return (!TemplarUtil.isStringNullOrEmpty(country) && country.toUpperCase().equals("UNITED STATES OF AMERICA") ? "United States" : (!TemplarUtil.isStringNullOrEmpty(country) ? country : ""));
	}
}
