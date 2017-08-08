/*   1:    */ package sample.core.repository;
/*   2:    */ 
/*   3:    */ import java.sql.Connection;
/*   4:    */ import java.sql.PreparedStatement;
/*   5:    */ import java.sql.ResultSet;
/*   6:    */ import java.sql.SQLException;
/*   7:    */ import java.util.concurrent.Semaphore;
/*   8:    */ 
/*   9:    */ public class DocumentData
/*  10:    */ {
/*  11:    */   public static final int STATUS_UPLOADED = 1;
/*  12:    */   public static final int STATUS_PROCESSING = 2;
/*  13:    */   public static final int STATUS_PROCESSED = 3;
/*  14:    */   public static final int STATUS_ERROR = 4;
/*  15:    */   public static final int STATUS_DO_NOT_PROCESS = 5;
/*  16:    */   public static final int STATUS_ERROR_NO_ASSOCIATED_ONTOLOGY_WHEN_ATTEMPTED_PROCESSING = 6;
/*  17:    */   public static final int STATUS_CONVERT_READY = 7;
/*  18:    */   public static final int STATUS_CONVERT_PRECONVERT = 8;
/*  19:    */   public static final int STATUS_CONVERT_CONVERTING = 9;
/*  20:    */   public static final int STATUS_CONVERT_POSTCONVERT = 10;
/*  21:    */   public static final int STATUS_CONVERT_DONE = 11;
/*  22:    */   public static final int STATUS_CONVERT_ERROR = 12;
/*  23:    */   private static final int MAX_AVAILABLE = 75;
/*  24: 36 */   protected static Semaphore available = new Semaphore(75, true);
/*  25:    */   
/*  26:    */   public static long createDocument(int iOrganizationID, String strFilename, byte[] bArrContent, String strDescription, int iDocumentSourceID, int iUserID)
/*  27:    */     throws SQLException
/*  28:    */   {
/*  29: 39 */     header();
/*  30: 40 */     Connection db = getConnection();
/*  31: 41 */     db.setAutoCommit(false);
/*  32:    */     
/*  33: 43 */     PreparedStatement ps = db.prepareStatement("SELECT ontology.spcreatedocument(?, ?, ?, ?, ?, ?);");
/*  34: 44 */     ps.setInt(1, iOrganizationID);
/*  35: 45 */     ps.setString(2, strFilename);
/*  36: 46 */     ps.setBytes(3, bArrContent);
/*  37: 47 */     ps.setString(4, strDescription);
/*  38: 48 */     ps.setInt(5, iDocumentSourceID);
/*  39: 49 */     ps.setInt(6, iUserID);
/*  40:    */     
/*  41: 51 */     ResultSet rs = ps.executeQuery();
/*  42:    */     
/*  43: 53 */     long lNewID = -1L;
/*  44: 55 */     if (rs.next())
/*  45:    */     {
/*  46: 56 */       lNewID = rs.getLong(1);
/*  47: 57 */       rs.close();
/*  48:    */     }
/*  49: 60 */     db.commit();
/*  50: 61 */     closeConnection(db, ps);
/*  51: 62 */     footer();
/*  52: 63 */     return lNewID;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public static void deleteDocument(long lDocumentID, int iOrgID)
/*  56:    */     throws SQLException
/*  57:    */   {
/*  58: 68 */     header();
/*  59:    */     
/*  60: 70 */     Connection db = getConnection();
/*  61: 71 */     db.setAutoCommit(false);
/*  62: 72 */     PreparedStatement ps = db.prepareStatement("SELECT ontology.spdeletedocument(?, ?)");
/*  63:    */     
/*  64: 74 */     ps.setLong(1, lDocumentID);
/*  65: 75 */     ps.setInt(2, iOrgID);
/*  66:    */     
/*  67: 77 */     ps.execute();
/*  68: 78 */     db.commit();
/*  69: 79 */     closeConnection(db, ps);
/*  70: 80 */     footer();
/*  71:    */   }
/*  72:    */   
/*  73:    */   public static void deleteDocumentsFromSource(int iDocumentSourceID)
/*  74:    */     throws SQLException
/*  75:    */   {
/*  76: 85 */     header();
/*  77:    */     
/*  78: 87 */     Connection db = getConnection();
/*  79: 88 */     db.setAutoCommit(false);
/*  80: 89 */     PreparedStatement ps = db.prepareStatement("SELECT ontology.spdeletedocumentsfromsource(?)");
/*  81:    */     
/*  82: 91 */     ps.setInt(1, iDocumentSourceID);
/*  83:    */     
/*  84: 93 */     ps.execute();
/*  85: 94 */     db.commit();
/*  86: 95 */     closeConnection(db, ps);
/*  87: 96 */     footer();
/*  88:    */   }
/*  89:    */   
/*  90:    */   public static void updateDocument(long lDocumentID, int iOrgID, String strFilename, byte[] bArrContent, String strDescription, int iDocumentSourceID, int iUserID)
/*  91:    */     throws SQLException
/*  92:    */   {
/*  93:100 */     header();
/*  94:    */     
/*  95:102 */     Connection db = getConnection();
/*  96:103 */     db.setAutoCommit(false);
/*  97:    */     
/*  98:105 */     PreparedStatement ps = db.prepareStatement("SELECT ontology.spupdatedocument(?, ?, ?, ?, ?, ?, ?);");
/*  99:    */     
/* 100:    */ 
/* 101:    */ 
/* 102:    */ 
/* 103:    */ 
/* 104:    */ 
/* 105:    */ 
/* 106:    */ 
/* 107:    */ 
/* 108:    */ 
/* 109:    */ 
/* 110:117 */     ps.setLong(1, lDocumentID);
/* 111:118 */     ps.setInt(2, iOrgID);
/* 112:119 */     ps.setString(3, strFilename);
/* 113:120 */     ps.setBytes(4, bArrContent);
/* 114:121 */     ps.setInt(5, iDocumentSourceID);
/* 115:122 */     ps.setString(6, strDescription);
/* 116:123 */     ps.setInt(7, iUserID);
/* 117:    */     
/* 118:125 */     ps.execute();
/* 119:126 */     db.commit();
/* 120:127 */     closeConnection(db, ps);
/* 121:128 */     footer();
/* 122:    */   }
/* 123:    */   
/* 124:    */   public static ResultSet getDocumentByID(long lDocumentID, int iOrganizationID, long lFieldMask)
/* 125:    */     throws SQLException
/* 126:    */   {
/* 127:132 */     header();
/* 128:    */     
/* 129:134 */     Connection db = getConnection();
/* 130:135 */     db.setAutoCommit(false);
/* 131:136 */     PreparedStatement ps = db.prepareStatement("SELECT * FROM ontology.spgetdocumentbyid(?, ?)");
/* 132:    */     
/* 133:138 */     ps.setLong(1, lDocumentID);
/* 134:139 */     ps.setInt(2, iOrganizationID);
/* 135:140 */     ResultSet rs = ps.executeQuery();
/* 136:141 */     footer();
/* 137:142 */     return rs;
/* 138:    */   }
/* 139:    */   
/* 140:    */   public static ResultSet getAllDocumentsBySourceID(int iSourceID)
/* 141:    */     throws SQLException
/* 142:    */   {
/* 143:146 */     header();
/* 144:    */     
/* 145:148 */     Connection db = getConnection();
/* 146:149 */     db.setAutoCommit(false);
/* 147:150 */     PreparedStatement ps = db.prepareStatement("SELECT * FROM ontology.spgetalldocsbysourceid(?)");
/* 148:    */     
/* 149:152 */     ps.setInt(1, iSourceID);
/* 150:153 */     ResultSet rs = ps.executeQuery();
/* 151:154 */     footer();
/* 152:155 */     return rs;
/* 153:    */   }
/* 154:    */   
/* 155:    */   public static ResultSet getDocumentResult(int iOntologyID, long lDocumentID, long lFieldMask)
/* 156:    */     throws SQLException
/* 157:    */   {
/* 158:159 */     header();
/* 159:    */     
/* 160:    */ 
/* 161:162 */     Connection db = getConnection();
/* 162:163 */     db.setAutoCommit(false);
/* 163:164 */     PreparedStatement ps = db.prepareStatement("SELECT * FROM ontology.spgetdocumentresult(?, ?)");
/* 164:    */     
/* 165:166 */     ps.setLong(1, lDocumentID);
/* 166:167 */     ps.setInt(2, iOntologyID);
/* 167:168 */     ResultSet rs = ps.executeQuery();
/* 168:169 */     footer();
/* 169:170 */     return rs;
/* 170:    */   }
/* 171:    */   
/* 172:    */   public static ResultSet getDocumentResults(long lDocumentID, long lFieldMask)
/* 173:    */     throws SQLException
/* 174:    */   {
/* 175:174 */     header();
/* 176:    */     
/* 177:    */ 
/* 178:177 */     Connection db = getConnection();
/* 179:178 */     db.setAutoCommit(false);
/* 180:179 */     PreparedStatement ps = db.prepareStatement("SELECT * FROM ontology.spgetdocumentresult(?)");
/* 181:    */     
/* 182:181 */     ps.setLong(1, lDocumentID);
/* 183:182 */     ResultSet rs = ps.executeQuery();
/* 184:    */     
/* 185:184 */     footer();
/* 186:185 */     return rs;
/* 187:    */   }
/* 188:    */   
/* 189:    */   public static ResultSet getOntologyDocumentStatus(long lDocumentID, int iOntologyID)
/* 190:    */     throws SQLException
/* 191:    */   {
/* 192:189 */     header();
/* 193:    */     
/* 194:191 */     Connection db = getConnection();
/* 195:192 */     db.setAutoCommit(false);
/* 196:193 */     PreparedStatement ps = db.prepareStatement("SELECT * FROM ontology.spgetontologydocumentstatus(?, ?)");
/* 197:    */     
/* 198:195 */     ps.setLong(1, lDocumentID);
/* 199:196 */     ps.setInt(2, iOntologyID);
/* 200:197 */     ResultSet rs = ps.executeQuery();
/* 201:    */     
/* 202:199 */     footer();
/* 203:200 */     return rs;
/* 204:    */   }
/* 205:    */   
/* 206:    */   public static ResultSet getOntologyDocumentStatusWithoutOntology(long lDocumentID)
/* 207:    */     throws SQLException
/* 208:    */   {
/* 209:204 */     header();
/* 210:    */     
/* 211:206 */     Connection db = getConnection();
/* 212:207 */     db.setAutoCommit(false);
/* 213:208 */     PreparedStatement ps = db.prepareStatement("SELECT os.status as status FROM ontology.ontology_document_cache odc LEFT JOIN ontology.status os ON odc.status_id = os.status_id WHERE document_id = ?");
/* 214:    */     
/* 215:210 */     ps.setLong(1, lDocumentID);
/* 216:211 */     ResultSet rs = ps.executeQuery();
/* 217:    */     
/* 218:213 */     footer();
/* 219:214 */     return rs;
/* 220:    */   }
/* 221:    */   
/* 222:    */   public static void updateDocumentStatus(int iOntologyID, long lDocumentID, int iDocumentStatusID)
/* 223:    */     throws SQLException
/* 224:    */   {
/* 225:218 */     header();
/* 226:    */     
/* 227:220 */     Connection db = getConnection();
/* 228:221 */     db.setAutoCommit(false);
/* 229:222 */     PreparedStatement ps = db.prepareStatement("SELECT ontology.spupdatedocumentstatus(?, ?, ?)");
/* 230:    */     
/* 231:224 */     ps.setInt(1, iOntologyID);
/* 232:225 */     ps.setLong(2, lDocumentID);
/* 233:226 */     ps.setInt(3, iDocumentStatusID);
/* 234:    */     
/* 235:228 */     ps.execute();
/* 236:229 */     db.commit();
/* 237:230 */     closeConnection(db, ps);
/* 238:    */     
/* 239:232 */     footer();
/* 240:    */   }
/* 241:    */   
/* 242:    */   public static int getDocumentStatus(long lDocumentID)
/* 243:    */     throws SQLException
/* 244:    */   {
/* 245:250 */     header();
/* 246:    */     
/* 247:252 */     Connection db = getConnection();
/* 248:253 */     db.setAutoCommit(false);
/* 249:254 */     PreparedStatement ps = db.prepareStatement("SELECT ontology.spgetdocumentstatus(?)");
/* 250:    */     
/* 251:256 */     ps.setLong(1, lDocumentID);
/* 252:    */     
/* 253:258 */     ResultSet rs = ps.executeQuery();
/* 254:259 */     int status = rs.getInt("status_id");
/* 255:    */     
/* 256:    */ 
/* 257:    */ 
/* 258:    */ 
/* 259:    */ 
/* 260:    */ 
/* 261:266 */     footer();
/* 262:267 */     return status;
/* 263:    */   }
/* 264:    */   
/* 265:    */   public static ResultSet getDocumentWithStatus(int iStatusID)
/* 266:    */     throws SQLException
/* 267:    */   {
/* 268:279 */     header();
/* 269:    */     
/* 270:281 */     Connection db = getConnection();
/* 271:282 */     db.setAutoCommit(false);
/* 272:    */     
/* 273:284 */     PreparedStatement ps = db.prepareStatement("SELECT * from ontology.document where status_id  = ? or status_id is null");
/* 274:    */     
/* 275:286 */     ps.setInt(1, iStatusID);
/* 276:    */     
/* 277:288 */     ResultSet rs = ps.executeQuery();
/* 278:    */     
/* 279:    */ 
/* 280:    */ 
/* 281:    */ 
/* 282:    */ 
/* 283:    */ 
/* 284:    */ 
/* 285:296 */     footer();
/* 286:297 */     return rs;
/* 287:    */   }
/* 288:    */   
/* 289:    */   public static void updateDocumentPlainText(long lDocumentID, String bytes)
/* 290:    */     throws SQLException
/* 291:    */   {
/* 292:307 */     header();
/* 293:    */     
/* 294:309 */     Connection db = getConnection();
/* 295:310 */     db.setAutoCommit(false);
/* 296:311 */     PreparedStatement ps = db.prepareStatement("SELECT ontology.spupdatedocumentplaintext(?, ?, ?)");
/* 297:    */     
/* 298:313 */     ps.setLong(1, lDocumentID);
/* 299:314 */     ps.setString(2, bytes);
/* 300:315 */     ps.setInt(3, 1);
/* 301:    */     
/* 302:317 */     ps.execute();
/* 303:318 */     db.commit();
/* 304:319 */     closeConnection(db, ps);
/* 305:320 */     footer();
/* 306:    */   }
/* 307:    */   
/* 308:    */   public static void updateDocumentStatusForGivenDocument(long lDocumentID, int iDocumentStatusID, int iuserID)
/* 309:    */     throws SQLException
/* 310:    */   {
/* 311:333 */     header();
/* 312:334 */     Connection db = getConnection();
/* 313:335 */     db.setAutoCommit(false);
/* 314:336 */     PreparedStatement ps = db.prepareStatement("SELECT ontology.spupdatedocumentstatus2(?, ?, ?)");
/* 315:    */     
/* 316:338 */     ps.setLong(1, lDocumentID);
/* 317:339 */     ps.setInt(2, iDocumentStatusID);
/* 318:340 */     ps.setInt(3, iuserID);
/* 319:    */     
/* 320:342 */     ps.execute();
/* 321:343 */     db.commit();
/* 322:344 */     closeConnection(db, ps);
/* 323:    */   }
/* 324:    */   
/* 325:    */   public static boolean checkFilenameExists(int iOrganizationID, String strFilename)
/* 326:    */     throws SQLException
/* 327:    */   {
/* 328:349 */     header();
/* 329:350 */     Connection db = getConnection();
/* 330:351 */     db.setAutoCommit(false);
/* 331:352 */     PreparedStatement ps = db.prepareStatement("SELECT COUNT(*) AS the_count FROM ontology.document WHERE org_id = ? AND file_name = ?");
/* 332:    */     
/* 333:354 */     ps.setInt(1, iOrganizationID);
/* 334:355 */     ps.setString(2, strFilename);
/* 335:356 */     ResultSet rs = ps.executeQuery();
/* 336:    */     
/* 337:358 */     long lCount = 0L;
/* 338:360 */     if (rs.next())
/* 339:    */     {
/* 340:361 */       lCount = rs.getLong(1);
/* 341:362 */       rs.close();
/* 342:    */     }
/* 343:365 */     db.commit();
/* 344:366 */     closeConnection(db, ps);
/* 345:    */     
/* 346:368 */     footer();
/* 347:369 */     return lCount > 0L;
/* 348:    */   }
/* 349:    */   
/* 350:    */   public static int createURL(int orgID, String url, int documentSourceID, String desc, int user)
/* 351:    */     throws SQLException
/* 352:    */   {
/* 353:374 */     header();
/* 354:375 */     Connection db = getConnection();
/* 355:376 */     db.setAutoCommit(false);
/* 356:377 */     PreparedStatement ps = db.prepareStatement("SELECT ontology.spcreateurl(?, ?, ?, ?, ?)");
/* 357:    */     
/* 358:379 */     ps.setInt(1, orgID);
/* 359:380 */     ps.setString(2, url);
/* 360:381 */     ps.setInt(3, documentSourceID);
/* 361:382 */     ps.setString(4, desc);
/* 362:383 */     ps.setInt(5, user);
/* 363:    */     
/* 364:385 */     ResultSet rs = ps.executeQuery();
/* 365:    */     
/* 366:387 */     int lNewID = -1;
/* 367:389 */     if (rs.next())
/* 368:    */     {
/* 369:390 */       lNewID = rs.getInt(1);
/* 370:391 */       rs.close();
/* 371:    */     }
/* 372:394 */     db.commit();
/* 373:395 */     closeConnection(db, ps);
/* 374:    */     
/* 375:397 */     header();
/* 376:398 */     return lNewID;
/* 377:    */   }
/* 378:    */   
/* 379:    */   public static ResultSet getAllURLs(boolean flag)
/* 380:    */     throws SQLException
/* 381:    */   {
/* 382:402 */     header();
/* 383:403 */     Connection db = getConnection();
/* 384:404 */     db.setAutoCommit(false);
/* 385:405 */     PreparedStatement ps = db.prepareStatement("SELECT * FROM ontology.spallurls(?)");
/* 386:    */     
/* 387:407 */     ps.setBoolean(1, flag);
/* 388:408 */     ResultSet rs = ps.executeQuery();
/* 389:409 */     footer();
/* 390:410 */     return rs;
/* 391:    */   }
/* 392:    */   
/* 393:    */   public static ResultSet getAllURLs(boolean flag, int orgID)
/* 394:    */     throws SQLException
/* 395:    */   {
/* 396:414 */     header();
/* 397:415 */     Connection db = getConnection();
/* 398:416 */     db.setAutoCommit(false);
/* 399:417 */     PreparedStatement ps = db.prepareStatement("SELECT * FROM ontology.spallurls(?) WHERE fieldname=?");
/* 400:    */     
/* 401:419 */     ps.setBoolean(1, flag);
/* 402:420 */     ps.setInt(2, orgID);
/* 403:421 */     ResultSet rs = ps.executeQuery();
/* 404:422 */     footer();
/* 405:423 */     return rs;
/* 406:    */   }
/* 407:    */   
/* 408:    */   public static ResultSet getAllURLsForDocumentSource(boolean flag, int documentSourceID)
/* 409:    */     throws SQLException
/* 410:    */   {
/* 411:427 */     header();
/* 412:428 */     Connection db = getConnection();
/* 413:429 */     db.setAutoCommit(false);
/* 414:430 */     PreparedStatement ps = db.prepareStatement("SELECT * FROM ontology.spallurls(?) WHERE document_source_id=?");
/* 415:    */     
/* 416:432 */     ps.setBoolean(1, flag);
/* 417:433 */     ps.setInt(2, documentSourceID);
/* 418:434 */     ResultSet rs = ps.executeQuery();
/* 419:435 */     footer();
/* 420:436 */     return rs;
/* 421:    */   }
/* 422:    */   
/* 423:    */   public static void setURLActiveFlag(long URLID, boolean flag)
/* 424:    */     throws SQLException
/* 425:    */   {
/* 426:440 */     header();
/* 427:441 */     Connection db = getConnection();
/* 428:442 */     db.setAutoCommit(false);
/* 429:443 */     PreparedStatement ps = db.prepareStatement("SELECT ontology.spseturlactiveflag(?, ?)");
/* 430:    */     
/* 431:445 */     ps.setLong(1, URLID);
/* 432:446 */     ps.setBoolean(2, flag);
/* 433:    */     
/* 434:448 */     ps.executeQuery();
/* 435:449 */     closeConnection(db, ps);
/* 436:450 */     footer();
/* 437:    */   }
/* 438:    */   
/* 439:    */   public static void updateURL(long URLID, String hash)
/* 440:    */     throws SQLException
/* 441:    */   {
/* 442:454 */     header();
/* 443:455 */     Connection db = getConnection();
/* 444:456 */     db.setAutoCommit(false);
/* 445:457 */     PreparedStatement ps = db.prepareStatement("SELECT ontology.spupdateurl(?, ?)");
/* 446:    */     
/* 447:459 */     ps.setLong(1, URLID);
/* 448:460 */     ps.setString(2, hash);
/* 449:    */     
/* 450:462 */     ps.executeQuery();
/* 451:463 */     closeConnection(db, ps);
/* 452:464 */     footer();
/* 453:    */   }
/* 454:    */   
/* 455:    */   public static void updateURLData(long URLID, String URL, String desc, boolean flag)
/* 456:    */     throws SQLException
/* 457:    */   {
/* 458:468 */     header();
/* 459:469 */     Connection db = getConnection();
/* 460:    */     
/* 461:471 */     db.setAutoCommit(false);
/* 462:472 */     PreparedStatement ps = db.prepareStatement("SELECT ontology.spupdateurldata(?, ?, ?, ?)");
/* 463:    */     
/* 464:474 */     ps.setLong(1, URLID);
/* 465:475 */     ps.setString(2, URL);
/* 466:476 */     ps.setString(3, desc);
/* 467:477 */     ps.setBoolean(4, flag);
/* 468:    */     
/* 469:479 */     ps.executeQuery();
/* 470:480 */     closeConnection(db, ps);
/* 471:481 */     footer();
/* 472:    */   }
/* 473:    */   
/* 474:    */   private static Connection getConnection()
/* 475:    */     throws SQLException
/* 476:    */   {
/* 477:485 */     return SIDB.getConnection();
/* 478:    */   }
/* 479:    */   
/* 480:    */   private static void closeConnection(Connection db, PreparedStatement ps)
/* 481:    */     throws SQLException
/* 482:    */   {
/* 483:489 */     ps.close();
/* 484:490 */     db.close();
/* 485:    */   }
/* 486:    */   
/* 487:    */   public static void closeConnection(ResultSet rs)
/* 488:    */     throws SQLException
/* 489:    */   {
/* 490:494 */     rs.close();
/* 491:    */   }
/* 492:    */   
/* 493:    */   public static void updateStatusOfDocsInSource(int iDocumentSourceID, int iDocumentStatusID, int lNumberOfDocsToUpdate)
/* 494:    */     throws SQLException
/* 495:    */   {
/* 496:499 */     Connection db = getConnection();
/* 497:500 */     db.setAutoCommit(false);
/* 498:501 */     PreparedStatement ps = db.prepareStatement("SELECT ontology.spupdatestatusofdocsinsource(?, ?, ?)");
/* 499:    */     
/* 500:503 */     ps.setInt(1, iDocumentSourceID);
/* 501:504 */     ps.setInt(2, iDocumentStatusID);
/* 502:505 */     ps.setInt(3, lNumberOfDocsToUpdate);
/* 503:    */     
/* 504:507 */     ps.execute();
/* 505:508 */     db.commit();
/* 506:509 */     ps.close();
/* 507:510 */     db.close();
/* 508:    */   }
/* 509:    */   
/* 510:    */   private static void header()
/* 511:    */   {
/* 512:    */     try
/* 513:    */     {
/* 514:515 */       available.acquire();
/* 515:    */     }
/* 516:    */     catch (InterruptedException e)
/* 517:    */     {
/* 518:518 */       e.printStackTrace();
/* 519:    */     }
/* 520:    */   }
/* 521:    */   
/* 522:    */   private static void footer()
/* 523:    */   {
/* 524:523 */     available.release();
/* 525:    */   }
/* 526:    */ }


/* Location:           G:\Proximo\Search Incite\old system\actinium_169_21\opt\apache-tomcat-6.0.13\apache-tomcat-6.0.13\webapps\ViewResult\WEB-INF\classes\
 * Qualified Name:     sample.core.repository.DocumentData
 * JD-Core Version:    0.7.0.1
 */