package com.searchincite.server.docconverter;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
//import java.sql.ResultSet;
import java.sql.SQLException;

import com.searchincite.server.data.DocumentWrapper;
import com.searchincite.server.docconverter.star2star;
import com.searchincite.server.docconverter.identification.FormatDescription;
import com.searchincite.server.docconverter.identification.FormatIdentification;

public class ConverterFactory {
	/**
	 * @param rs a bytestream of a document
	 * @return the appropriate subclass of star2star. eg. passing a .doc bytestream will return an instance of doc2txt.
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws SQLException is thrown when...
	 */
	public static star2star generateConverter(DocumentWrapper doc) throws UnsupportedEncodingException, IOException, SQLException{		
		star2star converter = null;

		//FormatDescription desc = FormatIdentification.identify(doc.rawBytes);

		//if (desc == null) {
		System.out.println("Unknown format: " + doc.name);
		if(doc.name.toUpperCase().endsWith(".DOC")) {
			System.out.println("Identified as: " + doc.name.substring(doc.name.length() - 4));
			converter = new doc2txt(doc);
			
		} else if(doc.name.toUpperCase().endsWith(".DOCX")) {
			System.out.println("Identified as: " + doc.name.substring(doc.name.length() - 5));
			converter = new doc2txt(doc);
		} else if(doc.name.toUpperCase().endsWith(".PDF")) {
			System.out.println("Identified as: " + doc.name.substring(doc.name.length() - 4));
			converter = new pdf2txt(doc);
		} else if(doc.name.toUpperCase().endsWith(".XLS")) {
			System.out.println("Identified as: " + doc.name.substring(doc.name.length() - 4));
			converter = new xls2txt(doc);
		} else if(doc.name.toUpperCase().endsWith(".XLSX")) {
			System.out.println("Identified as: " + doc.name.substring(doc.name.length() - 5));
			converter = new xls2txt(doc);
		} else if(doc.name.toUpperCase().endsWith(".TXT")) {
			System.out.println("Identified as: " + doc.name.substring(doc.name.length() - 4));
			converter = new txt2txt(doc);
		} else {
			System.out.println("Can't identify file, using plaintext");
			converter = new txt2txt(doc);
		}

		/*} else {
			System.out.println("Format=" + desc.getShortName() + ", MIME type=" + desc.getMimeType());
			if(desc.getShortName() == "DOC"){
				converter = new doc2txt(doc);
			} else if (desc.getShortName() == "XLS") {
				converter = new xls2txt(doc);
			} else if (desc.getShortName() == "PDF") {
				converter = new pdf2txt(doc);
			} else if (desc.getShortName() == "TXT"){
				converter = new txt2txt(doc);
			}
			// -- new MS file types
			else if (desc.getShortName() == "DOCX") {
				converter = new doc2txt(doc);
			} else if (desc.getShortName() == "XLSX") {
				converter = new xls2txt(doc);
			}         			
		}*/

		return converter;
	}
}

