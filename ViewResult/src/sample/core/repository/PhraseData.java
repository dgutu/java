/*  1:   */ package sample.core.repository;
/*  2:   */ 
/*  3:   */ import java.math.BigDecimal;
/*  4:   */ import java.sql.Connection;
/*  5:   */ import java.sql.PreparedStatement;
/*  6:   */ import java.sql.ResultSet;
/*  7:   */ import java.sql.SQLException;
/*  8:   */ 
/*  9:   */ public class PhraseData
/* 10:   */ {
/* 11:   */   public static int createPhrase(int iSubjectID, String strName, String strColor, double dWeight, int iUserID)
/* 12:   */     throws SQLException
/* 13:   */   {
/* 14:13 */     Connection db = SIDB.getConnection();
/* 15:14 */     db.setAutoCommit(false);
/* 16:15 */     PreparedStatement ps = db.prepareStatement("SELECT ontology.spcreatephrase(?, ?, ?, ?, ?)");
/* 17:   */     
/* 18:   */ 
/* 19:18 */     ps.setInt(1, iSubjectID);
/* 20:19 */     ps.setString(2, strName);
/* 21:20 */     ps.setString(3, "");
/* 22:21 */     ps.setBigDecimal(4, new BigDecimal(dWeight));
/* 23:22 */     ps.setInt(5, iUserID);
/* 24:   */     
/* 25:24 */     ResultSet rs = ps.executeQuery();
/* 26:   */     
/* 27:26 */     int iNewID = -1;
/* 28:28 */     if (rs.next())
/* 29:   */     {
/* 30:29 */       iNewID = rs.getInt(1);
/* 31:30 */       rs.close();
/* 32:   */     }
/* 33:33 */     db.commit();
/* 34:34 */     ps.close();
/* 35:35 */     db.close();
/* 36:   */     
/* 37:37 */     return iNewID;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public static void deletePhrase(int iPhraseID, int iOrgID)
/* 41:   */     throws SQLException
/* 42:   */   {
/* 43:42 */     Connection db = SIDB.getConnection();
/* 44:43 */     db.setAutoCommit(false);
/* 45:44 */     PreparedStatement ps = db.prepareStatement("SELECT ontology.spdeletephrase(?, ?)");
/* 46:   */     
/* 47:46 */     ps.setInt(1, iPhraseID);
/* 48:47 */     ps.setInt(2, iOrgID);
/* 49:   */     
/* 50:49 */     ps.execute();
/* 51:50 */     db.commit();
/* 52:51 */     ps.close();
/* 53:52 */     db.close();
/* 54:   */   }
/* 55:   */   
/* 56:   */   public static void updatePhrase(int iPhraseID, String strName, String strColor, double dWeight, int iUserID)
/* 57:   */     throws SQLException
/* 58:   */   {
/* 59:58 */     Connection db = SIDB.getConnection();
/* 60:59 */     db.setAutoCommit(false);
/* 61:60 */     PreparedStatement ps = db.prepareStatement("SELECT ontology.spupdatephrase(?, ?, ?, ?, ?)");
/* 62:   */     
/* 63:62 */     ps.setInt(1, iPhraseID);
/* 64:63 */     ps.setString(2, strName);
/* 65:64 */     ps.setString(3, strColor);
/* 66:65 */     ps.setBigDecimal(4, new BigDecimal(dWeight));
/* 67:66 */     ps.setInt(5, iUserID);
/* 68:   */     
/* 69:68 */     ps.execute();
/* 70:69 */     db.commit();
/* 71:70 */     ps.close();
/* 72:71 */     db.close();
/* 73:   */   }
/* 74:   */ }


/* Location:           G:\Proximo\Search Incite\old system\actinium_169_21\opt\apache-tomcat-6.0.13\apache-tomcat-6.0.13\webapps\ViewResult\WEB-INF\classes\
 * Qualified Name:     sample.core.repository.PhraseData
 * JD-Core Version:    0.7.0.1
 */