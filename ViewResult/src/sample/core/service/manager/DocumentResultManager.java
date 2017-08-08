/*   1:    */ package sample.core.service.manager;
/*   2:    */ 
/*   3:    */ import java.sql.Connection;
/*   4:    */ import java.sql.ResultSet;
/*   5:    */ import java.sql.SQLException;
/*   6:    */ import java.sql.Statement;
/*   7:    */ import java.util.ArrayList;
/*   8:    */ import sample.core.domain.DocumentResult;
/*   9:    */ import sample.core.domain.DocumentSubjectResult;
/*  10:    */ import sample.core.domain.Phrase;
/*  11:    */ import sample.core.domain.Subject;
/*  12:    */ import sample.core.repository.DocumentData;
/*  13:    */ 
/*  14:    */ public class DocumentResultManager
/*  15:    */ {
/*  16:    */   public static DocumentResult deserialize(ResultSet rs, long lFieldMask)
/*  17:    */     throws SQLException
/*  18:    */   {
/*  19: 18 */     DocumentResult dr = new DocumentResult();
/*  20:    */     
/*  21: 20 */     dr.setDocumentID(rs.getLong("document_id"));
/*  22: 21 */     dr.setMarkedUpDocument(rs.getString("document_cache"));
/*  23: 22 */     dr.setDocumentStatusID(rs.getInt("status_id"));
/*  24: 23 */     dr.setDocumentStatus(rs.getString("status"));
/*  25:    */     
/*  26: 25 */     return dr;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public static DocumentSubjectResult deserializeSubjectResult(ResultSet rs)
/*  30:    */     throws SQLException
/*  31:    */   {
/*  32: 30 */     DocumentSubjectResult dsr = new DocumentSubjectResult();
/*  33:    */     
/*  34: 32 */     dsr.setResult(rs.getString("result"));
/*  35: 33 */     dsr.setSubject(SubjectManager.deserialize(rs, 30L));
/*  36:    */     
/*  37: 35 */     return dsr;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public static DocumentResult getDocumentResult(int iOntologyID, long lDocumentID, long lFieldMask)
/*  41:    */     throws SQLException
/*  42:    */   {
/*  43: 41 */     ResultSet rs = DocumentData.getDocumentResult(iOntologyID, lDocumentID, lFieldMask);
/*  44:    */     
/*  45: 43 */     DocumentResult documentResult = null;
/*  46: 45 */     if (rs.next())
/*  47:    */     {
/*  48: 46 */       ResultSet rsResult = (ResultSet)rs.getObject(1);
/*  49: 47 */       if (rsResult.next())
/*  50:    */       {
/*  51: 48 */         documentResult = deserialize(rsResult, lFieldMask);
/*  52: 49 */         documentResult.setOntology(OntologyManager.deserialize(rsResult, 6L));
/*  53:    */       }
/*  54: 51 */       rsResult.close();
/*  55:    */     }
/*  56: 56 */     if (rs.next())
/*  57:    */     {
/*  58: 57 */       ResultSet rsSubjectResult = (ResultSet)rs.getObject(1);
/*  59:    */       
/*  60: 59 */       ArrayList arrSubjectResults = new ArrayList();
/*  61: 61 */       while (rsSubjectResult.next()) {
/*  62: 62 */         arrSubjectResults.add(deserializeSubjectResult(rsSubjectResult));
/*  63:    */       }
/*  64: 65 */       rsSubjectResult.close();
/*  65:    */       
/*  66: 67 */       documentResult.setSubjectResults((DocumentSubjectResult[])arrSubjectResults.toArray((Object[])new DocumentSubjectResult[arrSubjectResults.size()]));
/*  67:    */     }
/*  68: 72 */     if (rs.next())
/*  69:    */     {
/*  70: 73 */       ResultSet rsPhrases = (ResultSet)rs.getObject(1);
/*  71:    */       
/*  72: 75 */       ArrayList arrPhrases = new ArrayList();
/*  73: 77 */       while (rsPhrases.next())
/*  74:    */       {
/*  75: 79 */         Phrase p = PhraseManager.deserialize(rsPhrases, 0L);
/*  76: 80 */         arrPhrases.add(p);
/*  77:    */       }
/*  78: 82 */       rsPhrases.close();
/*  79: 84 */       if (arrPhrases.size() > 0) {
/*  80: 87 */         for (int iSubjects = 0; iSubjects < documentResult.getSubjectResults().length; iSubjects++)
/*  81:    */         {
/*  82: 89 */           Subject s = documentResult.getSubjectResults()[iSubjects].getSubject();
/*  83:    */           
/*  84: 91 */           ArrayList arrSubjectPhrases = new ArrayList();
/*  85: 93 */           for (int iPhrases = 0; iPhrases < arrPhrases.size(); iPhrases++)
/*  86:    */           {
/*  87: 94 */             Phrase p = (Phrase)arrPhrases.get(iPhrases);
/*  88: 95 */             if (p.getSubjectID() == s.getSubjectID()) {
/*  89: 96 */               arrSubjectPhrases.add(p);
/*  90:    */             }
/*  91:    */           }
/*  92:100 */           if (arrSubjectPhrases.size() > 0) {
/*  93:101 */             s.setPhrases((Phrase[])arrSubjectPhrases.toArray((Object[])new Phrase[arrSubjectPhrases.size()]));
/*  94:    */           }
/*  95:    */         }
/*  96:    */       }
/*  97:    */     }
/*  98:108 */     rs.getStatement().getConnection().close();
/*  99:109 */     rs.getStatement().close();
/* 100:110 */     rs.close();
/* 101:    */     
/* 102:112 */     return documentResult;
/* 103:    */   }
/* 104:    */ }


/* Location:           G:\Proximo\Search Incite\old system\actinium_169_21\opt\apache-tomcat-6.0.13\apache-tomcat-6.0.13\webapps\ViewResult\WEB-INF\classes\
 * Qualified Name:     sample.core.service.manager.DocumentResultManager
 * JD-Core Version:    0.7.0.1
 */