/*   1:    */ package sample.core.repository;
/*   2:    */ 
/*   3:    */ import java.sql.Connection;
/*   4:    */ import java.sql.PreparedStatement;
/*   5:    */ import java.sql.ResultSet;
/*   6:    */ import java.sql.SQLException;
/*   7:    */ 
/*   8:    */ public class OntologyData
/*   9:    */ {
/*  10:    */   public static ResultSet getOntologiesForOrganization(int iOrganizationID)
/*  11:    */     throws SQLException
/*  12:    */   {
/*  13: 14 */     Connection db = SIDB.getConnection();
/*  14:    */     
/*  15:    */ 
/*  16: 17 */     PreparedStatement ps = db.prepareCall("{ call ontology.spGetOrgOntologies(?) }");
/*  17: 18 */     ps.setInt(1, iOrganizationID);
/*  18: 19 */     return ps.executeQuery();
/*  19:    */   }
/*  20:    */   
/*  21:    */   public static ResultSet getOntologyByID(int iOntologyID, long lFieldMask)
/*  22:    */     throws SQLException
/*  23:    */   {
/*  24: 78 */     Connection db = SIDB.getConnection();
/*  25: 79 */     db.setAutoCommit(false);
/*  26: 80 */     PreparedStatement ps = db.prepareStatement("SELECT * FROM ontology.spgetontologybyid(?, ?)");
/*  27: 81 */     ps.setInt(1, iOntologyID);
/*  28:    */     
/*  29: 83 */     int iResultSets = 1;
/*  30: 86 */     if ((lFieldMask & 0x100) == 256L) {
/*  31: 87 */       iResultSets++;
/*  32:    */     }
/*  33: 89 */     if ((lFieldMask & 0x200) == 512L) {
/*  34: 90 */       iResultSets++;
/*  35:    */     }
/*  36: 93 */     ps.setInt(2, iResultSets);
/*  37:    */     
/*  38: 95 */     ResultSet rs = ps.executeQuery();
/*  39:    */     
/*  40:    */ 
/*  41:    */ 
/*  42:    */ 
/*  43:    */ 
/*  44:    */ 
/*  45:    */ 
/*  46:    */ 
/*  47:    */ 
/*  48:    */ 
/*  49:106 */     return rs;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public static ResultSet getOntologiesByCategoryID(int iCategoryID)
/*  53:    */     throws SQLException
/*  54:    */   {
/*  55:114 */     Connection db = SIDB.getConnection();
/*  56:    */     
/*  57:116 */     PreparedStatement ps = db.prepareCall("SELECT * FROM ontology.ontology WHERE category_id = ?");
/*  58:117 */     ps.setInt(1, iCategoryID);
/*  59:118 */     return ps.executeQuery();
/*  60:    */   }
/*  61:    */   
/*  62:    */   public static int createOntology(int iOrgID, String strName, int iUserID, String strDescription, int iCategoryID)
/*  63:    */     throws SQLException
/*  64:    */   {
/*  65:123 */     Connection db = SIDB.getConnection();
/*  66:124 */     db.setAutoCommit(false);
/*  67:125 */     PreparedStatement ps = db.prepareStatement("SELECT ontology.spcreateontology(?, ?, ?, ?, ?)");
/*  68:    */     
/*  69:127 */     ps.setInt(1, iOrgID);
/*  70:128 */     ps.setString(2, strName);
/*  71:129 */     ps.setString(3, strDescription);
/*  72:130 */     ps.setInt(4, iUserID);
/*  73:131 */     ps.setInt(5, iCategoryID);
/*  74:    */     
/*  75:133 */     ResultSet rs = ps.executeQuery();
/*  76:    */     
/*  77:135 */     int iNewID = -1;
/*  78:137 */     if (rs.next())
/*  79:    */     {
/*  80:138 */       iNewID = rs.getInt(1);
/*  81:139 */       rs.close();
/*  82:    */     }
/*  83:142 */     db.commit();
/*  84:143 */     ps.close();
/*  85:144 */     db.close();
/*  86:    */     
/*  87:146 */     return iNewID;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public static void deleteOntology(int iOntologyID, int iOrgID)
/*  91:    */     throws SQLException
/*  92:    */   {
/*  93:151 */     Connection db = SIDB.getConnection();
/*  94:152 */     db.setAutoCommit(false);
/*  95:153 */     PreparedStatement ps = db.prepareStatement("SELECT ontology.spdeleteontology(?, ?)");
/*  96:    */     
/*  97:155 */     ps.setInt(1, iOntologyID);
/*  98:156 */     ps.setInt(2, iOrgID);
/*  99:    */     
/* 100:158 */     ps.execute();
/* 101:159 */     db.commit();
/* 102:160 */     ps.close();
/* 103:161 */     db.close();
/* 104:    */   }
/* 105:    */   
/* 106:    */   public static void updateOntology(int iOntologyID, String strName, String strDescription, int iCategoryID, int iUserID)
/* 107:    */     throws SQLException
/* 108:    */   {
/* 109:166 */     Connection db = SIDB.getConnection();
/* 110:167 */     db.setAutoCommit(false);
/* 111:168 */     PreparedStatement ps = db.prepareStatement("SELECT ontology.spupdateontology(?, ?, ?, ?, ?)");
/* 112:    */     
/* 113:    */ 
/* 114:    */ 
/* 115:172 */     ps.setInt(1, iOntologyID);
/* 116:173 */     ps.setString(2, strName);
/* 117:174 */     ps.setString(3, strDescription);
/* 118:175 */     ps.setInt(4, iCategoryID);
/* 119:176 */     ps.setInt(5, iUserID);
/* 120:    */     
/* 121:178 */     ps.execute();
/* 122:179 */     db.commit();
/* 123:180 */     ps.close();
/* 124:181 */     db.close();
/* 125:    */   }
/* 126:    */   
/* 127:    */   public static int copyOntology(int iOntologyID, int iDestinationCategoryID, String strDestinationOntologyName, int iDestinationOrgID, int iUserID)
/* 128:    */     throws SQLException
/* 129:    */   {
/* 130:186 */     Connection db = SIDB.getConnection();
/* 131:187 */     db.setAutoCommit(false);
/* 132:188 */     PreparedStatement ps = db.prepareStatement("SELECT ontology.spcopyontologyacrossorgs(?, ?, ?, ?, ?)");
/* 133:    */     
/* 134:    */ 
/* 135:    */ 
/* 136:192 */     ps.setInt(1, iOntologyID);
/* 137:193 */     ps.setInt(2, iDestinationCategoryID);
/* 138:194 */     ps.setString(3, strDestinationOntologyName);
/* 139:195 */     ps.setInt(4, iDestinationOrgID);
/* 140:196 */     ps.setInt(5, iUserID);
/* 141:    */     
/* 142:198 */     ResultSet rs = ps.executeQuery();
/* 143:    */     
/* 144:200 */     int iNewID = -1;
/* 145:202 */     if (rs.next())
/* 146:    */     {
/* 147:203 */       iNewID = rs.getInt(1);
/* 148:204 */       rs.close();
/* 149:    */     }
/* 150:207 */     db.commit();
/* 151:208 */     ps.close();
/* 152:209 */     db.close();
/* 153:    */     
/* 154:211 */     return iNewID;
/* 155:    */   }
/* 156:    */   
/* 157:    */   public static ResultSet getProcessedOntologies(long lDocumentID)
/* 158:    */     throws SQLException
/* 159:    */   {
/* 160:216 */     Connection db = SIDB.getConnection();
/* 161:217 */     db.setAutoCommit(false);
/* 162:    */     
/* 163:219 */     PreparedStatement ps = db.prepareStatement("SELECT * FROM ontology.spgetprocessedontologies(?)");
/* 164:220 */     ps.setLong(1, lDocumentID);
/* 165:    */     
/* 166:222 */     ResultSet rs = ps.executeQuery();
/* 167:223 */     return rs;
/* 168:    */   }
/* 169:    */   
/* 170:    */   public static ResultSet getDocumentResultAndOntology(long lDocumentID)
/* 171:    */     throws SQLException
/* 172:    */   {
/* 173:228 */     Connection db = SIDB.getConnection();
/* 174:229 */     db.setAutoCommit(false);
/* 175:230 */     PreparedStatement ps = db.prepareStatement("SELECT * FROM ontology.spgetdocumentresultandontology(?)");
/* 176:    */     
/* 177:232 */     ps.setLong(1, lDocumentID);
/* 178:233 */     ResultSet rs = ps.executeQuery();
/* 179:    */     
/* 180:235 */     return rs;
/* 181:    */   }
/* 182:    */ }


/* Location:           G:\Proximo\Search Incite\old system\actinium_169_21\opt\apache-tomcat-6.0.13\apache-tomcat-6.0.13\webapps\ViewResult\WEB-INF\classes\
 * Qualified Name:     sample.core.repository.OntologyData
 * JD-Core Version:    0.7.0.1
 */