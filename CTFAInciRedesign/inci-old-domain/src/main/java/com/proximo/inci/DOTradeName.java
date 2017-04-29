package com.proximo.inci;

import com.proximo.inci.common.DODataRecord;
import com.proximo.inci.common.TDate;
import com.proximo.inci.common.exception.InvalidData;



public class DOTradeName 
    extends DODataRecord 
{
    /**
	 * 
	 */
	private static final long serialVersionUID = -166224665002077698L;
	public static final int CAT_FERMENTS    = 1;
    public static final int CAT_BOTANICALS  = 2;
    public static final int CAT_POLYMERS    = 3;
    public static final int CAT_GEN_CHEM    = 4;
    public static final int CAT_BIOTECH     = 5;
    
    public static final int NUM_ATT_FILES  = 5;
    
    public String userRecId;
    public String tradeName;
    public String tnNumber;
    public String nomenclature;
    public int categoryID;
    public String catName;
    public String formula;
    public String CASNumber;
    public String EINECSNumber;
    public String chemSynonyms;
    public String compStmt;
    public String mfgMehod;
    public String solvents;
    public String genus;
    public String species;
    public String material;
    public String process;
    public String plantPart;
    public String prepare;
    public int functionID;
    public String reference;
    public boolean published;
    public boolean submitted;
    public boolean approved;
    public boolean editable;
    public boolean hasOutstdComments;
    public boolean hasUserResponded;
    public boolean hasAttachments;
    public String inciName;
    public TDate exportDt;
    public TDate submitDt;
    public TDate inciNameDt;
    
    public String file1;
    public String file2;
    public String file3;
    public String file4;
    public String file5;
    
    public boolean isFile1Uploaded;
    public boolean isFile2Uploaded;
    public boolean isFile3Uploaded;
    public boolean isFile4Uploaded;
    public boolean isFile5Uploaded;
    
    public String other1;
    public String other2;
    public String other3;
    public String other4;
    public String other5;
    public boolean isINCINameUpdated;
    public boolean isChemStructIncluded;
    public String chemStructOpt;
    
    public DOTNCompany pubCompany;
    public String userCompanySupplierId;
    public String publicationCompanySupplierId;
    
    public String actionMode;
    
	public DOList ctfaCommentList;
	public DOList userCommentList;
	
    public DOList functionList;
    public String otherFunctions;
    public TDate reviewDt;
    public String ingredient;
    public String ingredDesc;
    public String is_archive;
    public boolean sendEmailFlag;
    public boolean isSubmitting;
    
    public boolean onHold;
    public boolean onHoldForACH;
    public DOUserPayment paymentInfo;

	public String adminComments;
	public DOList refundInfo;
	
	public String monoId;

    public DOTradeName() {
        super();
        clear();
    }

    public void clear() {
        recID = 0;
        userRecId = "";
        tradeName = "";
        tnNumber = "";
        nomenclature = "";
        categoryID = 0;
        catName = "";
        formula = "";
        CASNumber = "";
        EINECSNumber = "";
        chemSynonyms = "";
        compStmt = "";
        mfgMehod = "";
        solvents = "";
        genus = "";
        species = "";
        material = "";
        process = "";
        plantPart = "";
        prepare = "";
        functionID = 0;
        reference = "";
        published = true;
        submitted = false;
        approved = false;
        editable = true;
        hasOutstdComments = false;
        hasUserResponded = false;
        hasAttachments = false;
        inciName = "";
        exportDt = new TDate();
        exportDt.setNull();
        submitDt = new TDate();
        submitDt.setNull();
        inciNameDt = new TDate();
        inciNameDt.setNull();
    
        file1 = "";
        file2 = "";
        file3 = "";
        file4 = "";
        file5 = "";
    
        isFile1Uploaded = false;
        isFile2Uploaded = false;
        isFile3Uploaded = false;
        isFile4Uploaded = false;
        isFile5Uploaded = false;
        
        other1 = "";
        other2 = "";
        other3 = "";
        other4 = "";
        other5 = "";
        isINCINameUpdated = false;
        isChemStructIncluded = false;
        
        pubCompany = new DOTNCompany();
        userCompanySupplierId = "";
        publicationCompanySupplierId = "";
        actionMode = "";
        
		ctfaCommentList = new DOList();
		userCommentList = new DOList();
		
        functionList = new DOList();
        otherFunctions = "";
        reviewDt = new TDate();
        reviewDt.setNull();
        ingredient = "";
        ingredDesc = "";
        chemStructOpt = "";
        is_archive = "N";
        sendEmailFlag = false;
        isSubmitting = false;
        onHold = false;
        onHoldForACH = false;
        paymentInfo = new DOUserPayment();
		adminComments = "";
		refundInfo = new DOList();
		
		monoId = "";
    }

    public static void validate(DODataRecord d)
      throws InvalidData 
    {
        @SuppressWarnings("unused")
		DOTradeName i = (DOTradeName)d;
    }

    public Object clone() {
        DOTradeName tn = (DOTradeName)super.clone();
        tn.userRecId = this.userRecId;
        tn.tradeName = this.tradeName;
        tn.tnNumber = this.tnNumber;
        tn.nomenclature = this.nomenclature;
        tn.categoryID = this.categoryID;
        tn.catName = this.catName;
        tn.formula = this.formula;
        tn.EINECSNumber = this.EINECSNumber;
        tn.chemSynonyms = this.chemSynonyms;
        tn.compStmt = this.compStmt;
        tn.mfgMehod = this.mfgMehod;
        tn.solvents = this.solvents;
        tn.genus = this.genus;
        tn.species = this.species;
        tn.material = this.material;
        tn.process = this.process;
        tn.plantPart = this.plantPart;
        tn.prepare = this.prepare;
        tn.functionID = this.functionID;
        tn.reference = this.reference;
        tn.published = this.published;
        tn.submitted = this.submitted;
        tn.approved = this.approved;
        tn.editable = this.editable;
        tn.hasOutstdComments = this.hasOutstdComments;
        tn.hasUserResponded = this.hasUserResponded;
        tn.hasAttachments = this.hasAttachments;
        tn.inciName = this.inciName;
        tn.exportDt = (TDate)this.exportDt.clone();
        tn.submitDt = (TDate)this.submitDt.clone();
        tn.inciNameDt = (TDate)this.inciNameDt.clone();
    
        tn.file1 = this.file1;
        tn.file2 = this.file2;
        tn.file3 = this.file3;
        tn.file4 = this.file4;
        tn.file5 = this.file5;
    
        tn.isFile1Uploaded = this.isFile1Uploaded;
        tn.isFile2Uploaded = this.isFile2Uploaded;
        tn.isFile3Uploaded = this.isFile3Uploaded;
        tn.isFile4Uploaded = this.isFile4Uploaded;
        tn.isFile5Uploaded = this.isFile5Uploaded;
    
        tn.other1 = this.other1;
        tn.other2 = this.other2;
        tn.other3 = this.other3;
        tn.other4 = this.other4;
        tn.other5 = this.other5;
        
        tn.isINCINameUpdated = this.isINCINameUpdated;
        tn.isChemStructIncluded = this.isChemStructIncluded;
        
        tn.pubCompany = (DOTNCompany)this.pubCompany.clone();
        tn.userCompanySupplierId = this.userCompanySupplierId;
        tn.publicationCompanySupplierId = this.publicationCompanySupplierId;
        
        tn.actionMode = this.actionMode;
        
		tn.ctfaCommentList = (DOList)this.ctfaCommentList.clone();
		tn.userCommentList = (DOList)this.userCommentList.clone();
		
        tn.functionList = (DOList)this.functionList.clone();
        tn.otherFunctions = this.otherFunctions;
        tn.reviewDt = (TDate)this.reviewDt.clone();
        tn.ingredient = this.ingredient;
        tn.ingredDesc = this.ingredDesc;
        tn.chemStructOpt = this.chemStructOpt;
        tn.sendEmailFlag = this.sendEmailFlag;
        tn.isSubmitting = this.isSubmitting;
        tn.onHold = this.onHold;
        tn.onHoldForACH = this.onHoldForACH;
        tn.paymentInfo = this.paymentInfo;
		tn.adminComments = this.adminComments;
		tn.refundInfo = this.refundInfo;
		
		tn.monoId = this.monoId;
		
        return tn;
    }  
    
    public String getOriginalAttachmentFileName(int attachmentIndex) {
        switch (attachmentIndex) {
        case 1:
            return file1;
        case 2:
            return file2;
        case 3:
            return file3;
        case 4:
            return file4;
        case 5:
            return file5;
        default:
            return null;
        }
    }
    
    public void setAttachmentFileNameByIndex(int attachmentIndex, String fileName) {
        switch (attachmentIndex) {
        case 1:
            file1 = fileName;
            break;
        case 2:
            file2 = fileName;
            break;
        case 3:
            file3 = fileName;
            break;
        case 4:
            file4 = fileName;
            break;
        case 5:
            file5 = fileName;
        }
    }
}
