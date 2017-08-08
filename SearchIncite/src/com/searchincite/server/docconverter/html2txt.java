package com.searchincite.server.docconverter;

import java.io.IOException;
import java.util.Scanner;

import com.searchincite.server.data.DocumentWrapper;

public class html2txt extends star2star {

	public html2txt(DocumentWrapper doc) {
		super(doc);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean prepareForConversion() throws Exception {
	    
		return true;
	}
	
	@Override
	protected boolean convertDocument() throws Exception {
		final String endl = "<<ADAM'S_SPECIAL_ENDLINE>>";
		String sed = "/usr/bin/sed \"s/$/\\" + endl + "/g\"";
    	String lynx = "/opt/local/bin/lynx -dump -nolist -width=10000000";
    	String[] command = (new String[] {"/bin/sh", "-c", lynx + " " + _doc.name + " | " + sed}); 
        StringBuffer sb = new StringBuffer();
            Process p = null;
            try {
                p = Runtime.getRuntime().exec(command);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        Scanner s = new Scanner(p.getInputStream());
        while(s.hasNextLine()) {
            sb.append(s.nextLine());
        }
        String result = sb.toString();
        
        result = new String(sb);
        
        String[] results = result.split(endl);
        
        result.replaceAll(endl, "\n");
        result = "";
        for (String str : results) {
        	result = result + str + "\n";  	
		}
        
        _doc.plainText = result.getBytes();
        return true;
	}

	@Override
	protected boolean prepareForDBCommit() throws Exception {
		// TODO Auto-generated method stub
		return true;
	}

}
