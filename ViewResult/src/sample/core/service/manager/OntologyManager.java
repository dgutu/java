/*   1:    */ package sample.core.service.manager;
/*   2:    */ 
/*   3:    */ import java.sql.Connection;
/*   4:    */ import java.sql.ResultSet;
/*   5:    */ import java.sql.SQLException;
/*   6:    */ import java.sql.Statement;
/*   7:    */ import java.util.ArrayList;
/*   8:    */ import java.util.Hashtable;
/*   9:    */ import sample.core.domain.Ontology;
/*  10:    */ import sample.core.domain.Phrase;
/*  11:    */ import sample.core.domain.Subject;
/*  12:    */ import sample.core.repository.OntologyData;
/*  13:    */ 
/*  14:    */ public class OntologyManager
/*  15:    */ {
/*  16:    */   public static Ontology[] getOntologiesForOrganization(int iOrganizationID, long lFieldMask)
/*  17:    */     throws SQLException
/*  18:    */   {
/*  19: 17 */     ResultSet rs = OntologyData.getOntologiesForOrganization(iOrganizationID);
/*  20:    */     
/*  21: 19 */     ArrayList arrOntologies = new ArrayList();
/*  22: 21 */     while (rs.next())
/*  23:    */     {
/*  24: 22 */       Ontology o = deserialize(rs, lFieldMask);
/*  25: 23 */       arrOntologies.add(o);
/*  26:    */     }
/*  27: 28 */     if ((lFieldMask & 0x100) == 256L) {
/*  28: 30 */       for (int i = 0; i < arrOntologies.size(); i++)
/*  29:    */       {
/*  30: 32 */         Ontology o = (Ontology)arrOntologies.get(i);
/*  31:    */         
/*  32: 34 */         o.setSubjects(SubjectManager.getSubjectsForOntology(o.getOntologyID(), 0L));
/*  33:    */       }
/*  34:    */     }
/*  35: 38 */     rs.getStatement().getConnection().close();
/*  36: 39 */     rs.getStatement().close();
/*  37: 40 */     rs.close();
/*  38:    */     
/*  39: 42 */     return (Ontology[])arrOntologies.toArray((Object[])new Ontology[arrOntologies.size()]);
/*  40:    */   }
/*  41:    */   
/*  42:    */   public static Ontology getOntologyByID(int iOntologyID, long lFieldMask)
/*  43:    */     throws SQLException
/*  44:    */   {
/*  45: 47 */     ResultSet rs = OntologyData.getOntologyByID(iOntologyID, lFieldMask);
/*  46: 50 */     if (!rs.next()) {
/*  47: 51 */       return null;
/*  48:    */     }
/*  49: 55 */     ResultSet rsOntology = (ResultSet)rs.getObject(1);
/*  50:    */     
/*  51: 57 */     Ontology o = null;
/*  52: 59 */     if (rsOntology.next()) {
/*  53: 60 */       o = deserialize(rsOntology, lFieldMask);
/*  54:    */     } else {
/*  55: 64 */       return null;
/*  56:    */     }
/*  57: 68 */     if ((rs.next()) && ((lFieldMask & 0x100) == 256L))
/*  58:    */     {
/*  59: 70 */       ResultSet rsSubjects = (ResultSet)rs.getObject(1);
/*  60:    */       
/*  61:    */ 
/*  62: 73 */       ArrayList arrSubjects = null;
/*  63: 75 */       while (rsSubjects.next())
/*  64:    */       {
/*  65: 77 */         if (arrSubjects == null) {
/*  66: 78 */           arrSubjects = new ArrayList();
/*  67:    */         }
/*  68: 81 */         arrSubjects.add(SubjectManager.deserialize(rsSubjects, 0L));
/*  69:    */       }
/*  70: 84 */       rsSubjects.close();
/*  71: 86 */       if (arrSubjects != null)
/*  72:    */       {
/*  73: 87 */         o.setSubjects((Subject[])arrSubjects.toArray((Object[])new Subject[arrSubjects.size()]));
/*  74: 90 */         if ((rs.next()) && ((lFieldMask & 0x200) == 512L))
/*  75:    */         {
/*  76: 92 */           ResultSet rsPhrases = (ResultSet)rs.getObject(1);
/*  77:    */           
/*  78:    */ 
/*  79:    */ 
/*  80: 96 */           Hashtable ht = new Hashtable();
/*  81: 98 */           while (rsPhrases.next())
/*  82:    */           {
/*  83:100 */             int iSubjectID = rsPhrases.getInt("subject_id");
/*  84:    */             
/*  85:102 */             ArrayList arrPhrases = (ArrayList)ht.get(String.valueOf(iSubjectID));
/*  86:104 */             if (arrPhrases == null)
/*  87:    */             {
/*  88:105 */               arrPhrases = new ArrayList();
/*  89:106 */               ht.put(String.valueOf(iSubjectID), arrPhrases);
/*  90:    */             }
/*  91:109 */             arrPhrases.add(PhraseManager.deserialize(rsPhrases, 0L));
/*  92:    */           }
/*  93:114 */           for (int iSubjectCount = 0; iSubjectCount < o.getSubjects().length; iSubjectCount++)
/*  94:    */           {
/*  95:116 */             Subject s = o.getSubjects()[iSubjectCount];
/*  96:    */             
/*  97:118 */             ArrayList arrPhrases = (ArrayList)ht.get(String.valueOf(s.getSubjectID()));
/*  98:119 */             if (arrPhrases != null) {
/*  99:120 */               s.setPhrases((Phrase[])arrPhrases.toArray((Object[])new Phrase[arrPhrases.size()]));
/* 100:    */             }
/* 101:    */           }
/* 102:124 */           rsPhrases.close();
/* 103:    */         }
/* 104:    */       }
/* 105:    */     }
/* 106:132 */     rs.getStatement().getConnection().close();
/* 107:133 */     rs.getStatement().close();
/* 108:134 */     rs.close();
/* 109:    */     
/* 110:136 */     return o;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public static Ontology deserialize(ResultSet rs, long lFieldMask)
/* 114:    */     throws SQLException
/* 115:    */   {
/* 116:141 */     Ontology o = new Ontology();
/* 117:    */     
/* 118:    */ 
/* 119:    */ 
/* 120:145 */     o.setOrganizationID(rs.getInt("org_id"));
/* 121:    */     
/* 122:    */ 
/* 123:    */ 
/* 124:149 */     o.setOntologyID(rs.getInt("ontology_id"));
/* 125:152 */     if ((lFieldMask & 0x400) == 1024L) {
/* 126:153 */       o.setCategoryID(rs.getInt("category_id"));
/* 127:    */     }
/* 128:156 */     if ((lFieldMask & 0x4) == 4L) {
/* 129:157 */       o.setName(rs.getString("name"));
/* 130:    */     }
/* 131:160 */     if ((lFieldMask & 0x8) == 8L) {
/* 132:161 */       o.setDescription(rs.getString("description"));
/* 133:    */     }
/* 134:164 */     if ((lFieldMask & 0x10) == 16L) {
/* 135:165 */       o.setDateCreated(new java.util.Date(rs.getDate("creation_date").getTime()));
/* 136:    */     }
/* 137:168 */     if ((lFieldMask & 0x20) == 32L) {
/* 138:169 */       o.setCreatedByUserID(rs.getInt("created_by"));
/* 139:    */     }
/* 140:172 */     if ((lFieldMask & 0x80) == 128L) {
/* 141:173 */       o.setLastModifiedDate(new java.util.Date(rs.getDate("last_modified_date").getTime()));
/* 142:    */     }
/* 143:176 */     if ((lFieldMask & 0x40) == 64L) {
/* 144:177 */       o.setLastModifiedByUserID(rs.getInt("last_modified_by"));
/* 145:    */     }
/* 146:180 */     return o;
/* 147:    */   }
/* 148:    */   
/* 149:    */   public static Ontology[] getOntologiesByCategoryID(int iCategoryID, long lFieldMask)
/* 150:    */     throws SQLException
/* 151:    */   {
/* 152:185 */     ResultSet rs = OntologyData.getOntologiesByCategoryID(iCategoryID);
/* 153:    */     
/* 154:187 */     ArrayList arrOntologies = new ArrayList();
/* 155:189 */     while (rs.next())
/* 156:    */     {
/* 157:190 */       Ontology o = deserialize(rs, lFieldMask);
/* 158:191 */       arrOntologies.add(o);
/* 159:    */     }
/* 160:208 */     rs.getStatement().getConnection().close();
/* 161:209 */     rs.getStatement().close();
/* 162:210 */     rs.close();
/* 163:    */     
/* 164:212 */     return (Ontology[])arrOntologies.toArray((Object[])new Ontology[arrOntologies.size()]);
/* 165:    */   }
/* 166:    */   
/* 167:    */   public static Ontology createOntology(Ontology o)
/* 168:    */     throws SQLException
/* 169:    */   {
/* 170:217 */     if (o.getCreatedByUserID() <= 0) {
/* 171:218 */       return null;
/* 172:    */     }
/* 173:221 */     int iNewID = OntologyData.createOntology(o.getOrganizationID(), o.getName(), o.getCreatedByUserID(), o.getDescription(), o.getCategoryID());
/* 174:    */     
/* 175:    */ 
/* 176:    */ 
/* 177:    */ 
/* 178:    */ 
/* 179:    */ 
/* 180:228 */     o.setOntologyID(iNewID);
/* 181:    */     
/* 182:230 */     return o;
/* 183:    */   }
/* 184:    */   
/* 185:    */   public static void deleteOntology(int iOntologyID, int iOrgID)
/* 186:    */     throws SQLException
/* 187:    */   {
/* 188:234 */     OntologyData.deleteOntology(iOntologyID, iOrgID);
/* 189:    */   }
/* 190:    */   
/* 191:    */   public static Ontology updateOntology(Ontology o)
/* 192:    */     throws SQLException
/* 193:    */   {
/* 194:239 */     OntologyData.updateOntology(o.getOntologyID(), o.getName(), o.getDescription(), o.getCategoryID(), o.getLastModifiedByUserID());
/* 195:    */     
/* 196:    */ 
/* 197:    */ 
/* 198:    */ 
/* 199:    */ 
/* 200:    */ 
/* 201:246 */     return o;
/* 202:    */   }
/* 203:    */   
/* 204:    */   public static Ontology copyOntology(int iOntologyID, int iDestinationCategoryID, String strDestinationOntologyName, int iDestinationOrgID, int iUserID)
/* 205:    */     throws SQLException
/* 206:    */   {
/* 207:251 */     int iNewOntologyID = OntologyData.copyOntology(iOntologyID, iDestinationCategoryID, strDestinationOntologyName, iDestinationOrgID, iUserID);
/* 208:    */     
/* 209:253 */     return getOntologyByID(iNewOntologyID, 1030L);
/* 210:    */   }
/* 211:    */   
/* 212:    */   public static Ontology[] getProcessedOntologies(long lDocumentID, long lFieldMask)
/* 213:    */     throws SQLException
/* 214:    */   {
/* 215:258 */     ResultSet rs = OntologyData.getProcessedOntologies(lDocumentID);
/* 216:    */     
/* 217:260 */     ArrayList arrOntologies = new ArrayList();
/* 218:262 */     while (rs.next())
/* 219:    */     {
/* 220:263 */       Ontology o = deserialize(rs, 2046L);
/* 221:264 */       arrOntologies.add(o);
/* 222:    */     }
/* 223:267 */     rs.getStatement().getConnection().close();
/* 224:268 */     rs.getStatement().close();
/* 225:269 */     rs.close();
/* 226:    */     
/* 227:271 */     return (Ontology[])arrOntologies.toArray((Object[])new Ontology[arrOntologies.size()]);
/* 228:    */   }
/* 229:    */   
/* 230:    */   public static Ontology getDocumentResultAndOntology(long lDocumentID)
/* 231:    */     throws SQLException
/* 232:    */   {
/* 233:278 */     ResultSet rs = OntologyData.getDocumentResultAndOntology(lDocumentID);
/* 234:281 */     if (!rs.next()) {
/* 235:282 */       return null;
/* 236:    */     }
/* 237:286 */     ResultSet rsOntology = (ResultSet)rs.getObject(1);
/* 238:    */     
/* 239:288 */     Ontology o = null;
/* 240:290 */     if (rsOntology.next()) {
/* 241:291 */       o = deserialize(rsOntology, 2046L);
/* 242:    */     } else {
/* 243:295 */       return null;
/* 244:    */     }
/* 245:299 */     if (rs.next())
/* 246:    */     {
/* 247:301 */       ResultSet rsSubjects = (ResultSet)rs.getObject(1);
/* 248:    */       
/* 249:    */ 
/* 250:304 */       ArrayList arrSubjects = null;
/* 251:306 */       while (rsSubjects.next())
/* 252:    */       {
/* 253:308 */         if (arrSubjects == null) {
/* 254:309 */           arrSubjects = new ArrayList();
/* 255:    */         }
/* 256:312 */         arrSubjects.add(SubjectManager.deserialize(rsSubjects, 0L));
/* 257:    */       }
/* 258:315 */       rsSubjects.close();
/* 259:317 */       if (arrSubjects != null)
/* 260:    */       {
/* 261:318 */         o.setSubjects((Subject[])arrSubjects.toArray((Object[])new Subject[arrSubjects.size()]));
/* 262:321 */         if (rs.next())
/* 263:    */         {
/* 264:323 */           ResultSet rsPhrases = (ResultSet)rs.getObject(1);
/* 265:    */           
/* 266:    */ 
/* 267:    */ 
/* 268:327 */           Hashtable ht = new Hashtable();
/* 269:329 */           while (rsPhrases.next())
/* 270:    */           {
/* 271:331 */             int iSubjectID = rsPhrases.getInt("subject_id");
/* 272:    */             
/* 273:333 */             ArrayList arrPhrases = (ArrayList)ht.get(String.valueOf(iSubjectID));
/* 274:335 */             if (arrPhrases == null)
/* 275:    */             {
/* 276:336 */               arrPhrases = new ArrayList();
/* 277:337 */               ht.put(String.valueOf(iSubjectID), arrPhrases);
/* 278:    */             }
/* 279:340 */             arrPhrases.add(PhraseManager.deserialize(rsPhrases, 0L));
/* 280:    */           }
/* 281:345 */           for (int iSubjectCount = 0; iSubjectCount < o.getSubjects().length; iSubjectCount++)
/* 282:    */           {
/* 283:347 */             Subject s = o.getSubjects()[iSubjectCount];
/* 284:    */             
/* 285:349 */             ArrayList arrPhrases = (ArrayList)ht.get(String.valueOf(s.getSubjectID()));
/* 286:350 */             if (arrPhrases != null) {
/* 287:351 */               s.setPhrases((Phrase[])arrPhrases.toArray((Object[])new Phrase[arrPhrases.size()]));
/* 288:    */             }
/* 289:    */           }
/* 290:355 */           rsPhrases.close();
/* 291:    */         }
/* 292:    */       }
/* 293:    */     }
/* 294:360 */     rs.getStatement().getConnection().close();
/* 295:361 */     rs.getStatement().close();
/* 296:362 */     rs.close();
/* 297:    */     
/* 298:364 */     return o;
/* 299:    */   }
/* 300:    */ }


/* Location:           G:\Proximo\Search Incite\old system\actinium_169_21\opt\apache-tomcat-6.0.13\apache-tomcat-6.0.13\webapps\ViewResult\WEB-INF\classes\
 * Qualified Name:     sample.core.service.manager.OntologyManager
 * JD-Core Version:    0.7.0.1
 */