/*   1:    */ package sample.core.service.manager;
/*   2:    */ 
/*   3:    */ import java.sql.Connection;
/*   4:    */ import java.sql.ResultSet;
/*   5:    */ import java.sql.SQLException;
/*   6:    */ import java.sql.Statement;
/*   7:    */ import java.util.ArrayList;
/*   8:    */ import java.util.Collections;
/*   9:    */ import sample.core.domain.Phrase;
/*  10:    */ import sample.core.domain.Subject;
/*  11:    */ import sample.core.repository.SubjectData;
/*  12:    */ import sample.core.service.SubjectComparer;
/*  13:    */ 
/*  14:    */ public class SubjectManager
/*  15:    */ {
/*  16:    */   public static Subject[] getSubjectsForOntology(int iOntologyID, long lFieldMask)
/*  17:    */     throws SQLException
/*  18:    */   {
/*  19: 15 */     ResultSet rs = SubjectData.getSubjectsForOntology(iOntologyID);
/*  20:    */     
/*  21: 17 */     ArrayList arrSubjects = new ArrayList();
/*  22: 19 */     while (rs.next())
/*  23:    */     {
/*  24: 20 */       Subject s = deserialize(rs, lFieldMask);
/*  25: 21 */       arrSubjects.add(s);
/*  26:    */     }
/*  27: 24 */     rs.getStatement().getConnection().close();
/*  28: 25 */     rs.getStatement().close();
/*  29: 26 */     rs.close();
/*  30: 28 */     if (arrSubjects.size() > 1) {
/*  31: 29 */       Collections.sort(arrSubjects, new SubjectComparer(4L));
/*  32:    */     }
/*  33: 32 */     return (Subject[])arrSubjects.toArray((Object[])new Subject[arrSubjects.size()]);
/*  34:    */   }
/*  35:    */   
/*  36:    */   public static Subject deserialize(ResultSet rs, long lFieldMask)
/*  37:    */     throws SQLException
/*  38:    */   {
/*  39: 42 */     Subject s = new Subject();
/*  40:    */     
/*  41:    */ 
/*  42:    */ 
/*  43: 46 */     s.setSubjectID(rs.getInt("subject_id"));
/*  44: 47 */     s.setName(rs.getString("name"));
/*  45: 48 */     s.setColor(rs.getString("color"));
/*  46: 49 */     s.setWeight(rs.getDouble("weight"));
/*  47: 50 */     s.setDateCreated(new java.util.Date(rs.getDate("creation_date").getTime()));
/*  48: 51 */     s.setCreatedByUserID(rs.getInt("created_by"));
/*  49: 52 */     s.setLastModifiedDate(new java.util.Date(rs.getDate("last_modified_date").getTime()));
/*  50: 53 */     s.setLastModifiedByUserID(rs.getInt("last_modified_by"));
/*  51: 54 */     s.setActive(rs.getBoolean("active"));
/*  52: 55 */     s.setOntologyID(rs.getInt("ontology_id"));
/*  53: 56 */     return s;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public static Subject createSubject(Subject s)
/*  57:    */     throws SQLException
/*  58:    */   {
/*  59: 61 */     if (s.getCreatedByUserID() <= 0) {
/*  60: 62 */       return null;
/*  61:    */     }
/*  62: 65 */     int iNewID = SubjectData.createSubject(s.getOntologyID(), s.getName(), s.getColor(), s.getWeight(), s.getCreatedByUserID(), s.getActive());
/*  63:    */     
/*  64:    */ 
/*  65:    */ 
/*  66:    */ 
/*  67:    */ 
/*  68:    */ 
/*  69:    */ 
/*  70: 73 */     s.setSubjectID(iNewID);
/*  71:    */     
/*  72: 75 */     return s;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public static void deleteSubject(int iSubjectID, int iOrgID)
/*  76:    */     throws SQLException
/*  77:    */   {
/*  78: 79 */     SubjectData.deleteSubject(iSubjectID, iOrgID);
/*  79:    */   }
/*  80:    */   
/*  81:    */   public static void updateSubject(Subject s)
/*  82:    */     throws SQLException
/*  83:    */   {
/*  84: 84 */     SubjectData.updateSubject(s.getSubjectID(), s.getName(), s.getColor(), s.getWeight(), s.getLastModifiedByUserID(), s.getActive());
/*  85:    */   }
/*  86:    */   
/*  87:    */   public static Subject getSubjectByID(int iSubjectID, long lFieldMask)
/*  88:    */     throws SQLException
/*  89:    */   {
/*  90: 95 */     ResultSet rs = SubjectData.getSubjectByID(iSubjectID, lFieldMask);
/*  91: 98 */     if (!rs.next()) {
/*  92: 99 */       return null;
/*  93:    */     }
/*  94:103 */     ResultSet rsSubject = (ResultSet)rs.getObject(1);
/*  95:    */     
/*  96:105 */     Subject s = null;
/*  97:107 */     if (rsSubject.next()) {
/*  98:108 */       s = deserialize(rsSubject, lFieldMask);
/*  99:    */     } else {
/* 100:112 */       return null;
/* 101:    */     }
/* 102:116 */     if ((rs.next()) && ((lFieldMask & 0x200) == 512L))
/* 103:    */     {
/* 104:118 */       ResultSet rsPhrases = (ResultSet)rs.getObject(1);
/* 105:    */       
/* 106:    */ 
/* 107:121 */       ArrayList arrPhrases = null;
/* 108:123 */       while (rsPhrases.next())
/* 109:    */       {
/* 110:125 */         if (arrPhrases == null) {
/* 111:126 */           arrPhrases = new ArrayList();
/* 112:    */         }
/* 113:129 */         arrPhrases.add(PhraseManager.deserialize(rsPhrases, 0L));
/* 114:    */       }
/* 115:132 */       rsPhrases.close();
/* 116:134 */       if (arrPhrases != null) {
/* 117:135 */         s.setPhrases((Phrase[])arrPhrases.toArray((Object[])new Phrase[arrPhrases.size()]));
/* 118:    */       }
/* 119:    */     }
/* 120:139 */     rs.getStatement().getConnection().close();
/* 121:140 */     rs.getStatement().close();
/* 122:141 */     rs.close();
/* 123:    */     
/* 124:143 */     return s;
/* 125:    */   }
/* 126:    */ }


/* Location:           G:\Proximo\Search Incite\old system\actinium_169_21\opt\apache-tomcat-6.0.13\apache-tomcat-6.0.13\webapps\ViewResult\WEB-INF\classes\
 * Qualified Name:     sample.core.service.manager.SubjectManager
 * JD-Core Version:    0.7.0.1
 */