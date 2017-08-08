/*   1:    */ package sample.core.domain;
/*   2:    */ 
/*   3:    */ import java.io.Serializable;
/*   4:    */ 
/*   5:    */ public class DocumentResult
/*   6:    */   implements Serializable
/*   7:    */ {
/*   8:  7 */   private long m_lDocumentID = -1L;
/*   9:    */   private int m_iDocumentStatusID;
/*  10:    */   private String m_strDocumentStatus;
/*  11: 12 */   private Ontology m_Ontology = null;
/*  12:    */   private String m_strOntologyName;
/*  13:    */   private DocumentSubjectResult[] m_arrSubjectResults;
/*  14: 18 */   private String m_strMarkedUpDocument = new String();
/*  15:    */   
/*  16:    */   public String getOntologyName()
/*  17:    */   {
/*  18: 21 */     return this.m_strOntologyName;
/*  19:    */   }
/*  20:    */   
/*  21:    */   public void setOntologyName(String strOntologyName)
/*  22:    */   {
/*  23: 24 */     this.m_strOntologyName = strOntologyName;
/*  24:    */   }
/*  25:    */   
/*  26:    */   public String getMarkedUpDocument()
/*  27:    */   {
/*  28: 28 */     return this.m_strMarkedUpDocument;
/*  29:    */   }
/*  30:    */   
/*  31:    */   public void setMarkedUpDocument(String strMarkedUpDocument)
/*  32:    */   {
/*  33: 31 */     this.m_strMarkedUpDocument = strMarkedUpDocument;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public Ontology getOntology()
/*  37:    */   {
/*  38: 35 */     return this.m_Ontology;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public void setOntology(Ontology o)
/*  42:    */   {
/*  43: 38 */     this.m_Ontology = o;
/*  44: 39 */     setOntologyName(o.getName());
/*  45:    */   }
/*  46:    */   
/*  47:    */   public String getDocumentStatus()
/*  48:    */   {
/*  49: 43 */     return this.m_strDocumentStatus;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void setDocumentStatus(String strDocumentStatus)
/*  53:    */   {
/*  54: 46 */     this.m_strDocumentStatus = strDocumentStatus;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public int getDocumentStatusID()
/*  58:    */   {
/*  59: 50 */     return this.m_iDocumentStatusID;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public void setDocumentStatusID(int documentStatusID)
/*  63:    */   {
/*  64: 53 */     this.m_iDocumentStatusID = documentStatusID;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public long getDocumentID()
/*  68:    */   {
/*  69: 65 */     return this.m_lDocumentID;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void setDocumentID(long documentID)
/*  73:    */   {
/*  74: 68 */     this.m_lDocumentID = documentID;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public DocumentSubjectResult[] getSubjectResults()
/*  78:    */   {
/*  79: 72 */     return this.m_arrSubjectResults;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void setSubjectResults(DocumentSubjectResult[] arrSubjectResults)
/*  83:    */   {
/*  84: 75 */     this.m_arrSubjectResults = arrSubjectResults;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public String getSubjectResult(int iSubjectID)
/*  88:    */   {
/*  89: 80 */     for (int iSubjects = 0; iSubjects < this.m_arrSubjectResults.length; iSubjects++)
/*  90:    */     {
/*  91: 82 */       DocumentSubjectResult dsr = this.m_arrSubjectResults[iSubjects];
/*  92: 83 */       Subject s = dsr.getSubject();
/*  93: 86 */       if (s.getSubjectID() == iSubjectID) {
/*  94: 87 */         return dsr.getResult();
/*  95:    */       }
/*  96:    */     }
/*  97: 91 */     return "";
/*  98:    */   }
/*  99:    */   
/* 100:    */   public DocumentSubjectResult getResult(int iSubjectID)
/* 101:    */   {
/* 102: 96 */     for (int iSubjects = 0; iSubjects < this.m_arrSubjectResults.length; iSubjects++)
/* 103:    */     {
/* 104: 98 */       DocumentSubjectResult dsr = this.m_arrSubjectResults[iSubjects];
/* 105: 99 */       Subject s = dsr.getSubject();
/* 106:101 */       if (s.getSubjectID() == iSubjectID) {
/* 107:102 */         return dsr;
/* 108:    */       }
/* 109:    */     }
/* 110:106 */     return null;
/* 111:    */   }
/* 112:    */ }


/* Location:           G:\Proximo\Search Incite\old system\actinium_169_21\opt\apache-tomcat-6.0.13\apache-tomcat-6.0.13\webapps\ViewResult\WEB-INF\classes\
 * Qualified Name:     sample.core.domain.DocumentResult
 * JD-Core Version:    0.7.0.1
 */