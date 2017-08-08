package com.searchincite.server.docconverter;

import com.searchincite.server.data.DocumentWrapper;

public class txt2txt extends star2star {

	public txt2txt(DocumentWrapper doc) {
		super(doc);
	}

	@Override
	protected boolean convertDocument() throws Exception {
		_doc.plainText = _doc.rawBytes;
		return true;
	}

	@Override
	protected boolean prepareForConversion() throws Exception {
		return true;
	}

	@Override
	protected boolean prepareForDBCommit() throws Exception {
		return true;
	}

}
