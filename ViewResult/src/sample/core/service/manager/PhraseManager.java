/*  1:   */ package sample.core.service.manager;
/*  2:   */ 
/*  3:   */ import java.sql.ResultSet;
/*  4:   */ import java.sql.SQLException;
/*  5:   */ import sample.core.domain.Phrase;
/*  6:   */ import sample.core.repository.PhraseData;
/*  7:   */ 
/*  8:   */ public class PhraseManager
/*  9:   */ {
/* 10:   */   public static Phrase[] getPhrasesForSubject(int iSubjectID, long lFieldMask)
/* 11:   */     throws SQLException
/* 12:   */   {
/* 13:11 */     return null;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public static Phrase deserialize(ResultSet rs, long lFieldMask)
/* 17:   */     throws SQLException
/* 18:   */   {
/* 19:21 */     Phrase p = new Phrase();
/* 20:22 */     p.setPhraseID(rs.getInt("phrase_id"));
/* 21:23 */     p.setSubjectID(rs.getInt("subject_id"));
/* 22:24 */     p.setName(rs.getString("name"));
/* 23:25 */     p.setColor(rs.getString("color"));
/* 24:26 */     p.setWeight(rs.getInt("weight"));
/* 25:27 */     p.setDateCreated(new java.util.Date(rs.getDate("creation_date").getTime()));
/* 26:28 */     p.setCreatedByUserID(rs.getInt("created_by"));
/* 27:29 */     p.setLastModifiedDate(new java.util.Date(rs.getDate("last_modified_date").getTime()));
/* 28:30 */     p.setLastModifiedByUserID(rs.getInt("last_modified_by"));
/* 29:   */     
/* 30:32 */     return p;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public static Phrase createPhrase(Phrase p)
/* 34:   */     throws SQLException
/* 35:   */   {
/* 36:37 */     if (p.getCreatedByUserID() <= 0) {
/* 37:38 */       return null;
/* 38:   */     }
/* 39:41 */     int iNewID = PhraseData.createPhrase(p.getSubjectID(), p.getName(), p.getColor(), p.getWeight(), p.getCreatedByUserID());
/* 40:   */     
/* 41:   */ 
/* 42:   */ 
/* 43:   */ 
/* 44:   */ 
/* 45:   */ 
/* 46:48 */     p.setPhraseID(iNewID);
/* 47:   */     
/* 48:50 */     return p;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public static void deletePhrase(int iPhraseID, int iOrgID)
/* 52:   */     throws SQLException
/* 53:   */   {
/* 54:54 */     PhraseData.deletePhrase(iPhraseID, iOrgID);
/* 55:   */   }
/* 56:   */   
/* 57:   */   public static void updatePhrase(Phrase p)
/* 58:   */     throws SQLException
/* 59:   */   {
/* 60:59 */     PhraseData.updatePhrase(p.getPhraseID(), p.getName(), p.getColor(), p.getWeight(), p.getLastModifiedByUserID());
/* 61:   */   }
/* 62:   */ }


/* Location:           G:\Proximo\Search Incite\old system\actinium_169_21\opt\apache-tomcat-6.0.13\apache-tomcat-6.0.13\webapps\ViewResult\WEB-INF\classes\
 * Qualified Name:     sample.core.service.manager.PhraseManager
 * JD-Core Version:    0.7.0.1
 */