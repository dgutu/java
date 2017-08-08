/*   1:    */ package sample.core.repository;
/*   2:    */ 
/*   3:    */ import java.math.BigDecimal;
/*   4:    */ import java.sql.Connection;
/*   5:    */ import java.sql.PreparedStatement;
/*   6:    */ import java.sql.ResultSet;
/*   7:    */ import java.sql.SQLException;
/*   8:    */ 
/*   9:    */ public class SubjectData
/*  10:    */ {
/*  11:    */   public static ResultSet getSubjectsForOntology(int iOntologyID)
/*  12:    */     throws SQLException
/*  13:    */   {
/*  14: 15 */     Connection db = SIDB.getConnection();
/*  15:    */     
/*  16: 17 */     PreparedStatement ps = db.prepareStatement("SELECT * FROM spgetontologysubjectcounts(?)");
/*  17:    */     
/*  18: 19 */     ps.setInt(1, iOntologyID);
/*  19:    */     
/*  20: 21 */     ResultSet rs = ps.executeQuery();
/*  21:    */     
/*  22: 23 */     return rs;
/*  23:    */   }
/*  24:    */   
/*  25:    */   public static int createSubject(int iOntologyID, String strName, String strColor, double dWeight, int iUserID, boolean bActive)
/*  26:    */     throws SQLException
/*  27:    */   {
/*  28: 28 */     Connection db = SIDB.getConnection();
/*  29: 29 */     db.setAutoCommit(false);
/*  30: 30 */     PreparedStatement ps = db.prepareStatement("SELECT ontology.spcreatesubject(?, ?, ?, ?, ?, ?)");
/*  31:    */     
/*  32:    */ 
/*  33: 33 */     ps.setInt(1, iOntologyID);
/*  34: 34 */     ps.setString(2, strName);
/*  35: 35 */     ps.setString(3, strColor);
/*  36: 36 */     ps.setBigDecimal(4, new BigDecimal(dWeight));
/*  37: 37 */     ps.setBoolean(5, true);
/*  38: 38 */     ps.setInt(6, iUserID);
/*  39:    */     
/*  40: 40 */     ResultSet rs = ps.executeQuery();
/*  41:    */     
/*  42: 42 */     int iNewID = -1;
/*  43: 44 */     if (rs.next())
/*  44:    */     {
/*  45: 45 */       iNewID = rs.getInt(1);
/*  46: 46 */       rs.close();
/*  47:    */     }
/*  48: 49 */     db.commit();
/*  49: 50 */     ps.close();
/*  50: 51 */     db.close();
/*  51:    */     
/*  52: 53 */     return iNewID;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public static void deleteSubject(int iSubjectID, int iOrgID)
/*  56:    */     throws SQLException
/*  57:    */   {
/*  58: 58 */     Connection db = SIDB.getConnection();
/*  59: 59 */     db.setAutoCommit(false);
/*  60: 60 */     PreparedStatement ps = db.prepareStatement("SELECT ontology.spdeletesubject(?, ?)");
/*  61:    */     
/*  62: 62 */     ps.setInt(1, iSubjectID);
/*  63: 63 */     ps.setInt(2, iOrgID);
/*  64:    */     
/*  65: 65 */     ps.execute();
/*  66: 66 */     db.commit();
/*  67: 67 */     ps.close();
/*  68: 68 */     db.close();
/*  69:    */   }
/*  70:    */   
/*  71:    */   public static void updateSubject(int iSubjectID, String strName, String strColor, double dWeight, int iUserID, boolean bActive)
/*  72:    */     throws SQLException
/*  73:    */   {
/*  74: 74 */     Connection db = SIDB.getConnection();
/*  75: 75 */     db.setAutoCommit(false);
/*  76: 76 */     PreparedStatement ps = db.prepareStatement("SELECT ontology.spupdatesubject(?, ?, ?, ?, ?, ?)");
/*  77:    */     
/*  78: 78 */     ps.setInt(1, iSubjectID);
/*  79: 79 */     ps.setString(2, strName);
/*  80: 80 */     ps.setString(3, strColor);
/*  81: 81 */     ps.setBigDecimal(4, new BigDecimal(dWeight));
/*  82: 82 */     ps.setBoolean(5, bActive);
/*  83: 83 */     ps.setInt(6, iUserID);
/*  84:    */     
/*  85: 85 */     ps.execute();
/*  86: 86 */     db.commit();
/*  87: 87 */     ps.close();
/*  88: 88 */     db.close();
/*  89:    */   }
/*  90:    */   
/*  91:    */   public static ResultSet getSubjectByID(int iSubjectID, long lFieldMask)
/*  92:    */     throws SQLException
/*  93:    */   {
/*  94: 93 */     Connection db = SIDB.getConnection();
/*  95: 94 */     db.setAutoCommit(false);
/*  96: 95 */     PreparedStatement ps = db.prepareStatement("SELECT * FROM ontology.spgetsubjectbyid(?, ?)");
/*  97: 96 */     ps.setInt(1, iSubjectID);
/*  98:    */     
/*  99: 98 */     int iResultSets = 1;
/* 100:101 */     if ((lFieldMask & 0x200) == 512L) {
/* 101:102 */       iResultSets++;
/* 102:    */     }
/* 103:105 */     ps.setInt(2, iResultSets);
/* 104:    */     
/* 105:107 */     ResultSet rs = ps.executeQuery();
/* 106:    */     
/* 107:109 */     return rs;
/* 108:    */   }
/* 109:    */ }


/* Location:           G:\Proximo\Search Incite\old system\actinium_169_21\opt\apache-tomcat-6.0.13\apache-tomcat-6.0.13\webapps\ViewResult\WEB-INF\classes\
 * Qualified Name:     sample.core.repository.SubjectData
 * JD-Core Version:    0.7.0.1
 */