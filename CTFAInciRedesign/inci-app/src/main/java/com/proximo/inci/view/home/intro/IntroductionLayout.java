/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.home.intro;

import java.io.File;
import java.io.FileInputStream;
import org.apache.commons.io.IOUtils;
import com.proximo.inci.component.util.ComponentUtil;
import com.proximo.inci.window.SubWindowKey;
import com.proximo.inci.window.main.MainWindow;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class IntroductionLayout extends VerticalLayout {
    
    private MainWindow mainWindow;
    private String fileName = "inciIntro.html";

    public IntroductionLayout(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
        
        init();
    }
    
    public IntroductionLayout(MainWindow mainWindow, String fileName) {
        this.mainWindow = mainWindow;
        this.fileName = fileName;
        
        init();
    }
    
    private void init() {    	
        String basepath = mainWindow.getApplication().getContext().getBaseDirectory().getAbsolutePath() + "\\html\\" + fileName;
    	try {
    		File file = new File(basepath);
    		if (file.exists()) {
	    		FileInputStream is = new FileInputStream(basepath);    		
	        	Label lbl = new Label(IOUtils.toString(is,"UTF-8"), Label.CONTENT_XHTML);
	        	is.close();
	        	addComponent(lbl);
    		}
    		/*else {
    			mainWindow.logout();
    		}*/
		} catch (Exception e) {
		}
    }
    
    
    @SuppressWarnings("unused")
	private void init_old() {
    	
    	String tnPaymentAmount = "250";//mainWindow.getView(mainWindow.getCurrentViewKey()).getApplicationProperty("tnPaymentAmount").toString();
    	
        ComponentUtil.addHtml(
                "<div style=\"text-align:center; font-size: 18px; font-weight:bold;\">INCI Name Application-Form TN Introduction</div>"
                        + "<br><br>", this);

        ComponentUtil
                .addHtml(
                        "<div style=\"font-size: 20px; font-weight: bold;\">There is a $" + tnPaymentAmount + ".00 INCI Application processing fee.</div><br>",
                        this);

        ComponentUtil
                .addHtml(
                        "<div style=\"font-size: 18px; font-weight: bold;\">Welcome to the INCI Name Application System!</div><br>",
                        this);

        ComponentUtil
                .addHtml(
                        "<div style=\"font-size:14px\">Use Form TN to request an INCI name for a trade name ingredient.</div><br>",
                        this);

        ComponentUtil
                .addHtml(
                        "<div style=\"font-size:14px\">International Nomenclature Cosmetic Ingredient (INCI) Names were formerly "
                                + "known as CTFA Adopted Names. INCI names are published in the <i>International Cosmetic Ingredient "
                                + "Dictionary and Handbook</i> and are  the names recognized for ingredient labeling purposes in the "
                                + "United States, the European Union, and many other countries.</div><br>",
                        this);

        ComponentUtil.addHtml("<div style=\"font-size:14px\"><a href=\" " + mainWindow.getThemePageUrl()
                + "help.html\" style=\"color: red;\" target=\"userGuide\">"
                + "INCI Name Application Instructions</a></div><br>", this);

        ComponentUtil.addHtml(
                "<div style=\"font-size:14px; font-weight: bold;\">INCI Name Assignment Procedures</div><br>",
                this);

        ComponentUtil
                .addHtml(
                        "<div style=\"font-size:14px\">International Nomenclature Cosmetic Ingredient (INCI) names may be assigned only by Personal "
                                + "Care Products Council's International Nomenclature Committee (INC).</div><br>",
                        this);

        ComponentUtil
                .addHtml(
                        "<div style=\"font-size:14px\">Requests for assignment of an INCI name must be submitted to the Personal Care Products Council "
                                + "on Form TN.  After a preliminary review by the Personal Care Products Council, the Form TN is "
                                + "reviewed by the INC, and an INCI name is assigned.</div><br>", this);

        ComponentUtil
                .addHtml(
                        "<div style=\"font-size:14px\">Information sources are searched for details on the ingredient, and all available information is "
                                + "compiled into a monograph, awaiting the publication of the next edition of the <i>Dictionary</i>. "
                                + "INCI names are assigned to ingredients based on their chemical structure and composition. Because "
                                + "name assignments are based on written information provided by the supplier or manufacturer of the "
                                + "ingredient, it is the supplier's responsibility to ensure that the information submitted is complete "
                                + "and accurate.</div><br>", this);

        ComponentUtil
                .addHtml(
                        "<div style=\"font-size:14px\">To ensure the accuracy of name assignments and cross references in the <i>Dictionary</i>, the "
                                + "Personal Care Products Council annually sends each supplier or manufacturer a report of their materials "
                                + "to be listed in future editions. It is the responsibility of each firm to inform the Personal Care "
                                + "Products Council of any changes in their trade names and contact information.</div><br>",
                        this);

        ComponentUtil.addHtml("<div style=\"font-size:14px\">Companies wishing to change an INCI name must send a "
                + "written request to the International Nomenclature Committee. Such requests must "
                + "include information supporting the request, including the rationale for the "
                + "change, alternate nomenclature, and information on the structure or composition "
                + "of the material, including analytical data, if applicable, to justify the change.</div><br>",
                this);

        ComponentUtil
                .addHtml(
                        "<div style=\"font-size:14px\">The INC also reserves the right to amend or delete names from the <i>Dictionary</i> when such "
                                + "actions are deemed necessary for technical accuracy or other reasons.</div><br>",
                        this);

        ComponentUtil
                .addHtml(
                        "<div style=\"font-size:14px\">The International Nomenclature Committee meets 6 times annually to review submissions. "
                                + "The applicant will be informed of each name assignment, or if insufficient information is "
                                + "submitted, will be requested to provide additional information. Delays may be avoided by carefully "
                                + "following the <a href=\" "
                                + mainWindow.getThemePageUrl()
                                + "help.html\" style=\"color: red;\" target=\"userGuide\">INCI Name Application Instructions</a> and "
                                + "providing the required information. Forms TN not properly completed according to <a href=\" "
                                + mainWindow.getThemePageUrl() + "help.html\" style=\"color: red;\" target=\"userGuide\">"
                                + "instructions</a> will be returned.</div><br>", this);

        HorizontalLayout hz = new HorizontalLayout();
        ComponentUtil.addHtml("<div style=\"font-size:14px\">To view the INCI Application Review Process click&nbsp;</div>", hz);
        Button processlink = new Button();
        processlink.addStyleName("link");
        processlink.addStyleName("medium-link");
        processlink.setCaption("here");
        processlink.addListener(new Button.ClickListener() {
            @Override
            public void buttonClick(com.vaadin.ui.Button.ClickEvent event) {
                mainWindow.showSubWindow(SubWindowKey.HOME_PROCESS);
            }
        });
        hz.addComponent(processlink);
        ComponentUtil.addHtml("<div style=\"font-size:14px\">.</div>", hz);
        addComponent(hz);

        ComponentUtil.addHtml("<br><br><div style=\"font-size:10px\">The INCI Name Application System is hosted "
                + "on <a href=\"http://network.proximo.com/\" style=\"color: red;\" target=_blank>The Proximo "
                + "Network<sup>TM</sup></A>.</div", this);        
    }
}
