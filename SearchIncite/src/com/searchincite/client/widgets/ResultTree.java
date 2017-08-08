/*   1:    */ package com.searchincite.client.widgets;

/*   2:    */
/*   3:    */ import com.google.gwt.user.client.Window;
/*   4:    */ import com.google.gwt.user.client.ui.HTML;
/*   5:    */ import com.google.gwt.user.client.ui.Tree;
/*   6:    */ import com.google.gwt.user.client.ui.TreeItem;
/*   7:    */ import com.google.gwt.user.client.ui.TreeListener;
/*   8:    */ import com.searchincite.client.entity.DocumentResult;
/*  10:    */ import com.searchincite.client.entity.Phrase;
/*  11:    */ import com.searchincite.client.entity.Subject;
/*  12:    */ import com.searchincite.client.util.ColorUtil;

/*  13:    */
/*  14:    */ public class ResultTree/* 15: */ extends Tree/* 16: */ implements TreeListener
/* 17: */ {
	/* 18: */ String m_strOntologyName;
	/* 19: 16 */ DocumentResult m_DocumentResult = null;
	/* 20: */ String m_strMarkedUpDocument;
	/* 21: 18 */ int m_iSelectedSubjectID = 0;
	/* 22: 19 */ int m_iSelectedPhraseID = 0;
	/* 23: 20 */ boolean m_bOntologySelected = true;
	/* 24: 21 */ boolean m_bJustLoaded = true;
	/* 25: 23 */ private HTML m_htmlDocumentContainer = null;
	/* 26: */ private HTML m_htmlQuickJumpLink;

	/* 27: */
	/* 28: */ public ResultTree(DocumentResult docResult, String strRenderedDocument, HTML htmlQuickJumpLink)
	/* 29: */ {
		/* 30: 36 */ initOnClick();
		/* 31: 38 */ if (docResult == null) {
			/* 32: 40 */ return;
			/* 33: */ }
		/* 34: 43 */ setDocumentResult(docResult, strRenderedDocument);
		/* 35: */
		/* 36: 45 */ buildTree();
		/* 37: */
		/* 38: */
		/* 39: */
		/* 40: */
		/* 41: */
		/* 42: 51 */ this.m_htmlQuickJumpLink = htmlQuickJumpLink;
		/* 43: */ }

	/* 44: */
	/* 45: */ public void setDocumentContainer(HTML htmlDocContainer)
	/* 46: */ {
		/* 47: 56 */ this.m_htmlDocumentContainer = htmlDocContainer;
		/* 48: */ }

	/* 49: */
	/* 50: */ public void setDocumentResult(DocumentResult docResult, String strRenderedDocument)
	/* 51: */ {
		/* 52: 66 */ this.m_DocumentResult = docResult;
		/* 53: 68 */ if (strRenderedDocument != null) {
			/* 54: 69 */ this.m_strMarkedUpDocument = strRenderedDocument;
			/* 55: */ } else {
			/* 56: 72 */ this.m_strMarkedUpDocument = "";
			/* 57: */ }
		/* 58: */ }

	/* 59: */
	/* 60: */ public void refreshDocumentContainer()
	/* 61: */ {
		/* 62: 82 */ if (this.m_htmlDocumentContainer != null) {
			/* 63: 87 */ this.m_htmlDocumentContainer.setHTML(this.m_strMarkedUpDocument);
			/* 64: */ }
		/* 65: */ }

	/* 66: */
	/* 67: */ public void setRenderedMarkedUpDocument(String strRenderedDoc)
	/* 68: */ {
		/* 69: 99 */ this.m_strMarkedUpDocument = strRenderedDoc;
		/* 70: */ }

	/* 71: */
	/* 72: */ private Subject getSubjectFromID(int ID)
	/* 73: */ {
		/* 74:105 */ for (int i = 0; i < this.m_DocumentResult.getSubjectResults().length; i++)
		/* 75: */ {
			/* 76:107 */ Subject subj = this.m_DocumentResult.getSubjectResults()[i].getSubject();
			/* 77:109 */ if (subj.getSubjectID() == ID) {
				/* 78:111 */ return subj;
				/* 79: */ }
			/* 80: */ }
		/* 81:114 */ return null;
		/* 82: */ }

	/* 83: */
	/* 84: */ private Phrase getPhraseFromSubjectAndID(Subject subject, int ID)
	/* 85: */ {
		/* 86:119 */ for (int i = 0; i < subject.getPhrases().length; i++)
		/* 87: */ {
			/* 88:121 */ Phrase phrase = subject.getPhrases()[i];
			/* 89:123 */ if (phrase.getPhraseID() == ID) {
				/* 90:124 */ return phrase;
				/* 91: */ }
			/* 92: */ }
		/* 93:127 */ return null;
		/* 94: */ }

	/* 95: */
	/* 96: */ private void initOnClick()
	/* 97: */ {
		/* 98:132 */ addTreeListener(this);
		/* 99: */ }

	/* 100: */
	/* 101: */ private void buildTree()
	/* 102: */ {
		/* 103:207 */ TreeItem nodeRoot = new TreeItem(this.m_DocumentResult.getOntologyName());
		/* 104:212 */ if (this.m_DocumentResult.getSubjectResults() != null) {
			/* 105:214 */ for (int iSubjects = 0; iSubjects < this.m_DocumentResult
					.getSubjectResults().length; iSubjects++)
			/* 106: */ {
				/* 107:217 */ Subject s = this.m_DocumentResult.getSubjectResults()[iSubjects].getSubject();
				/* 108:219 */ if (s != null)
				/* 109: */ {
					/* 110:221 */ TreeItem nodeSubject = new TreeItem(s.getName());
					/* 111: */
					/* 112:223 */ nodeSubject.setUserObject(String.valueOf(s.getSubjectID()));
					/* 113:224 */ Phrase[] arrPhrases = s.getPhrases();
					/* 114:226 */ if (arrPhrases != null) {
						/* 115:228 */ for (int iPhrases = 0; iPhrases < arrPhrases.length; iPhrases++)
						/* 116: */ {
							/* 117:230 */ Phrase p = arrPhrases[iPhrases];
							/* 118:232 */ if (p != null)
							/* 119: */ {
								/* 120:234 */ TreeItem nodePhrase = new TreeItem(p.getName());
								/* 121: */
								/* 122:236 */ nodePhrase.setUserObject(String.valueOf(p.getPhraseID()));
								/* 123:237 */ nodeSubject.addItem(nodePhrase);
								/* 124: */ }
							/* 125: */ }
						/* 126: */ }
					/* 127:242 */ nodeRoot.addItem(nodeSubject);
					/* 128: */ }
				/* 129: */ }
			/* 130: */ }
		/* 131:248 */ addItem(nodeRoot);
		/* 132: */ }

	/* 133: */
	/* 134: */ private int findFirstPhrase(Phrase phrase, String html)
	/* 135: */ {
		/* 136:253 */ Window.alert("Finding phrase... 0");
		/* 137:254 */ String strPhraseID = String.valueOf(phrase.getPhraseID());
		/* 138:255 */ String strPhraseIndexSearcher = "class=\"phr_id_" + strPhraseID + "\"";
		/* 139:256 */ int iPhraseIDIndex = html.indexOf(strPhraseIndexSearcher) + strPhraseIndexSearcher.length();
		/* 140:257 */ int iEndSpan = html.indexOf(">", iPhraseIDIndex);
		/* 141:258 */ Window.alert("Finding phrase... 1");
		/* 142:259 */ return iEndSpan + 1;
		/* 143: */ }

	/* 144: */
	/* 145: */ private void selectSubject(Subject subject, boolean bSelect)
	/* 146: */ {
		/* 147:264 */ if ((bSelect) && (this.m_iSelectedSubjectID == subject.getSubjectID())
				&& (this.m_iSelectedPhraseID == 0)) {
			/* 148:267 */ return;
			/* 149: */ }
		/* 150:270 */ String strDebug = (!bSelect ? "DE-" : "") + "Selecting Phrases...";
		/* 151: */
		/* 152: */
		/* 153:273 */ Phrase[] phrases = subject.getPhrases();
		/* 154:274 */ for (int i = 0; i < phrases.length; i++) {
			/* 155:278 */ selectPhrase(phrases[i], subject, bSelect);
			/* 156: */ }
		/* 157:282 */ if (bSelect)
		/* 158: */ {
			/* 159:284 */ this.m_htmlQuickJumpLink
					.setHTML("<a href=\"#quick_jump_subj_" + subject.getSubjectID() + "_0\">Find First Phrase</a>");
			/* 160:285 */ this.m_iSelectedSubjectID = subject.getSubjectID();
			/* 161: */ }
		/* 162: */ else
		/* 163: */ {
			/* 164:289 */ this.m_iSelectedSubjectID = 0;
			/* 165: */ }
		/* 166: */ }

	/* 167: */
	/* 168: */ private void selectPhrase(Phrase phrase, Subject subject, boolean bSelect)
	/* 169: */ {
		/* 170:299 */ if (!bSelect)
		/* 171: */ {
			/* 172:300 */ if (this.m_iSelectedPhraseID == phrase.getPhraseID()) {
				/* 173:301 */ this.m_iSelectedPhraseID = 0;
				/* 174: */ }
			/* 175: */ }
		/* 176: */ else
		/* 177: */ {
			/* 178:307 */ if (this.m_iSelectedPhraseID == phrase.getPhraseID()) {
				/* 179:309 */ return;
				/* 180: */ }
			/* 181:311 */ this.m_iSelectedPhraseID = phrase.getPhraseID();
			/* 182: */ }
		/* 183:314 */ String strHtml = this.m_strMarkedUpDocument;
		/* 184: */
		/* 185: */
		/* 186: */
		/* 187: */
		/* 188: */
		/* 189: */
		/* 190: */
		/* 191: */
		/* 192: */
		/* 193:324 */ String strPhraseIDStart = "phr_id_";
		/* 194:325 */ String strColorStart = "color: ";
		/* 195:326 */ String strBackColorStart = "background-color: ";
		/* 196: */
		/* 197: */
		/* 198: */
		/* 199: */
		/* 200: */
		/* 201:332 */ String strPhraseID = String.valueOf(phrase.getPhraseID());
		/* 202: */
		/* 203:334 */ String strFindCurrentColor = strPhraseIDStart + strPhraseID + " {" + strColorStart;
		/* 204:335 */ int iCurrentColorIndex = strHtml.indexOf(strFindCurrentColor) + strFindCurrentColor.length();
		/* 205:336 */ String strCurrentColor = strHtml.substring(iCurrentColorIndex, iCurrentColorIndex + 7);
		/* 206: */
		/* 207:338 */ String strFindCurrentBackColor = strPhraseIDStart + strPhraseID + " {" + strColorStart
				+ strCurrentColor + "; " + strBackColorStart;
		/* 208:339 */ int iCurrentBackColorIndex = strHtml.indexOf(strFindCurrentBackColor)
				+ strFindCurrentBackColor.length();
		/* 209:340 */ String strCurrentBackColor = strHtml.substring(iCurrentBackColorIndex,
				iCurrentBackColorIndex + 7);
		/* 210: */
		/* 211:342 */ String strToReplace = strPhraseIDStart + strPhraseID + " \\{" + strColorStart + strCurrentColor
				+ "; " + strBackColorStart + strCurrentBackColor;
		/* 212: */
		/* 213: */
		/* 214:345 */ String strNewColor = "";
		/* 215:346 */ String strNewBackColor = "";
		/* 216:347 */ if (!bSelect)
		/* 217: */ {
			/* 218:348 */ strNewColor = "#000000";
			/* 219:349 */ strNewBackColor = "#ffffff";
			/* 220: */ }
		/* 221: */ else
		/* 222: */ {
			/* 223:352 */ strNewColor = ColorUtil.getFontColor(subject.getColor());
			/* 224:353 */ strNewBackColor = subject.getColor();
			/* 225: */ }
		/* 226:355 */ String strReplaceWith = strPhraseIDStart + strPhraseID + " {" + strColorStart + strNewColor + "; "
				+ strBackColorStart + strNewBackColor;
		/* 227: */
		/* 228: */
		/* 229: */
		/* 230: */
		/* 231:360 */ strHtml = strHtml.replaceFirst(strToReplace, strReplaceWith);
		/* 232: */
		/* 233: */
		/* 234:363 */ this.m_strMarkedUpDocument = strHtml;
		/* 235: */
		/* 236: */
		/* 237:366 */ this.m_htmlQuickJumpLink
				.setHTML("<a href=\"#quick_jump_phr_" + phrase.getPhraseID() + "_0\">Find First Phrase</a>");
		/* 238: */ }

	/* 239: */
	/* 240: */ private Phrase getSelectedPhrase()
	/* 241: */ {
		/* 242:371 */ if (this.m_iSelectedPhraseID != 0) {
			/* 243:373 */ if (this.m_iSelectedSubjectID != 0)
			/* 244: */ {
				/* 245:374 */ Subject subj = getSubjectFromResult(this.m_iSelectedSubjectID);
				/* 246:376 */ for (int iPhrase = 0; iPhrase < subj.getPhrases().length; iPhrase++)
				/* 247: */ {
					/* 248:378 */ Phrase phrase = subj.getPhrases()[iPhrase];
					/* 249:380 */ if (phrase.getPhraseID() == this.m_iSelectedPhraseID) {
						/* 250:381 */ return phrase;
						/* 251: */ }
					/* 252: */ }
				/* 253: */ }
			/* 254: */ else
			/* 255: */ {
				/* 256:386 */ for (int iSubject = 0; iSubject < this.m_DocumentResult
						.getSubjectResults().length; iSubject++)
				/* 257: */ {
					/* 258:387 */ Subject subj = this.m_DocumentResult.getSubjectResults()[iSubject].getSubject();
					/* 259:389 */ for (int iPhrase = 0; iPhrase < subj.getPhrases().length; iPhrase++)
					/* 260: */ {
						/* 261:391 */ Phrase phrase = subj.getPhrases()[iPhrase];
						/* 262:393 */ if (phrase.getPhraseID() == this.m_iSelectedPhraseID) {
							/* 263:394 */ return phrase;
							/* 264: */ }
						/* 265: */ }
					/* 266: */ }
				/* 267: */ }
			/* 268: */ }
		/* 269:402 */ return null;
		/* 270: */ }

	/* 271: */
	/* 272: */ private Subject getSubjectFromResult(int iSubjectID)
	/* 273: */ {
		/* 274:407 */ for (int iSubject = 0; iSubject < this.m_DocumentResult.getSubjectResults().length; iSubject++)
		/* 275: */ {
			/* 276:409 */ Subject subj = this.m_DocumentResult.getSubjectResults()[iSubject].getSubject();
			/* 277:411 */ if (subj.getSubjectID() == iSubjectID) {
				/* 278:412 */ return subj;
				/* 279: */ }
			/* 280: */ }
		/* 281:416 */ return null;
		/* 282: */ }

	/* 283: */
	/* 284: */ private Subject getSelectedSubject()
	/* 285: */ {
		/* 286:421 */ if (this.m_iSelectedSubjectID != 0) {
			/* 287:422 */ return getSubjectFromResult(this.m_iSelectedSubjectID);
			/* 288: */ }
		/* 289:425 */ Phrase selectedPhrase = getSelectedPhrase();
		/* 290:426 */ if (selectedPhrase != null) {
			/* 291:427 */ return getSubjectFromResult(selectedPhrase.getSubjectID());
			/* 292: */ }
		/* 293:430 */ return null;
		/* 294: */ }

	/* 295: */
	/* 296: */ private void setSelections(boolean PSelect)
	/* 297: */ {
		/* 298:435 */ for (int iSubject = 0; iSubject < this.m_DocumentResult.getSubjectResults().length; iSubject++)
		/* 299: */ {
			/* 300:436 */ Subject subj = this.m_DocumentResult.getSubjectResults()[iSubject].getSubject();
			/* 301:437 */ this.m_htmlDocumentContainer.setVisible(false);
			/* 302:438 */ selectSubject(subj, PSelect);
			/* 303:439 */ this.m_htmlDocumentContainer.setVisible(true);
			/* 304: */ }
		/* 305:443 */ this.m_iSelectedPhraseID = 0;
		/* 306: */ }

	/* 307: */
	/* 308: */ private void clearSelections()
	/* 309: */ {
		/* 310:448 */ if (this.m_bOntologySelected)
		/* 311: */ {
			/* 312:450 */ setSelections(false);
			/* 313: */
			/* 314:452 */ this.m_bOntologySelected = false;
			/* 315:453 */ return;
			/* 316: */ }
		/* 317:455 */ if (this.m_iSelectedSubjectID != 0)
		/* 318: */ {
			/* 319:457 */ selectSubject(getSelectedSubject(), false);
			/* 320: */
			/* 321:459 */ return;
			/* 322: */ }
		/* 323:461 */ if (this.m_iSelectedPhraseID != 0)
		/* 324: */ {
			/* 325:463 */ selectPhrase(getSelectedPhrase(), getSelectedSubject(), false);
			/* 326:464 */ return;
			/* 327: */ }
		/* 328: */ }

	/* 329: */
	/* 330: */ private void selectAll()
	/* 331: */ {
		/* 332:486 */ setSelections(true);
		/* 333: */ }

	/* 334: */
	/* 335: */ public void onTreeItemSelected(TreeItem selectedItem)
	/* 336: */ {
		/* 337:493 */ int iParentCount = 0;
		/* 338:494 */ TreeItem parentItem = selectedItem.getParentItem();
		/* 339:497 */ while (parentItem != null)
		/* 340: */ {
			/* 341:498 */ iParentCount++;
			/* 342:499 */ parentItem = parentItem.getParentItem();
			/* 343: */ }
		/* 344:502 */ switch (iParentCount)
		/* 345: */ {
		/* 346: */ case 0:
			/* 347:507 */ this.m_bOntologySelected = true;
			/* 348:508 */ selectAll();
			/* 349:509 */ refreshDocumentContainer();
			/* 350: */
			/* 351:511 */ break;
		/* 352: */ case 1:
			/* 353:515 */ clearSelections();
			/* 354:516 */ int subjectID = Integer.parseInt((String) selectedItem.getUserObject());
			/* 355:517 */ Subject subject = getSubjectFromID(subjectID);
			/* 356:518 */ selectSubject(subject, true);
			/* 357:519 */ refreshDocumentContainer();
			/* 358:520 */ this.m_iSelectedPhraseID = 0;
			/* 359:521 */ break;
		/* 360: */ case 2:
			/* 361:524 */ int subjID = Integer.parseInt((String) selectedItem.getParentItem().getUserObject());
			/* 362:525 */ Subject subj = getSubjectFromID(subjID);
			/* 363:526 */ int phrID = Integer.parseInt((String) selectedItem.getUserObject());
			/* 364:527 */ Phrase phr = getPhraseFromSubjectAndID(subj, phrID);
			/* 365:530 */ if (this.m_iSelectedPhraseID != phrID)
			/* 366: */ {
				/* 367:531 */ clearSelections();
				/* 368:532 */ selectPhrase(phr, subj, true);
				/* 369:533 */ refreshDocumentContainer();
				/* 370:534 */ this.m_iSelectedSubjectID = 0;
				/* 371: */ }
			/* 372: */ break;
		/* 373: */ }
		/* 374: */ }

	/* 375: */
	/* 376: */ public void onTreeItemStateChanged(TreeItem item) {
	}
	/* 377: */ }

/*
 * Location:
 * G:\SI\com.searchincite.SearchIncite\com.searchincite.SearchIncite\WEB-INF\
 * classes\
 * 
 * Qualified Name: com.searchincite.client.widgets.ResultTree
 * 
 * JD-Core Version: 0.7.0.1
 * 
 */