/*  1:   */ package sample.json;
/*  2:   */ 
/*  3:   */ import java.util.ArrayList;
/*  4:   */ import java.util.List;
/*  5:   */ import org.springframework.stereotype.Controller;
/*  6:   */ import org.springframework.ui.ModelMap;
/*  7:   */ import org.springframework.web.bind.annotation.RequestMapping;
/*  8:   */ import sample.core.domain.DocumentResult;
/*  9:   */ import sample.core.domain.DocumentSubjectResult;
/* 10:   */ import sample.core.domain.DsrObj;
/* 11:   */ import sample.core.domain.Subject;
/* 12:   */ import sample.core.service.manager.DocumentResultManager;
/* 13:   */ 
/* 14:   */ @Controller
/* 15:   */ public class DocumentResultController
/* 16:   */ {
/* 17:   */   @RequestMapping({"/documentResult.json"})
/* 18:   */   public ModelMap documentResult(int ontId, long docId)
/* 19:   */   {
/* 20:25 */     DocumentResult dr = null;
/* 21:   */     try
/* 22:   */     {
/* 23:27 */       dr = DocumentResultManager.getDocumentResult(ontId, docId, 0L);
/* 24:   */     }
/* 25:   */     catch (Exception e)
/* 26:   */     {
/* 27:29 */       e.printStackTrace();
/* 28:   */     }
/* 29:38 */     List<DsrObj> dsrObjList = new ArrayList();
/* 30:   */     
/* 31:   */ 
/* 32:41 */     DocumentSubjectResult[] arrSubjectResults = dr.getSubjectResults();
/* 33:42 */     if ((arrSubjectResults != null) && (arrSubjectResults.length > 0)) {
/* 34:43 */       for (int i = 0; i < arrSubjectResults.length; i++)
/* 35:   */       {
/* 36:44 */         DocumentSubjectResult sr = arrSubjectResults[i];
/* 37:45 */         Subject subject = sr.getSubject();
/* 38:46 */         DsrObj dsrObj = new DsrObj();
/* 39:47 */         dsrObj.setSubjectName(subject.getName());
/* 40:48 */         dsrObj.setSubjectColor(subject.getColor());
/* 41:49 */         dsrObj.setResultValue(String.valueOf(sr.getResult()));
/* 42:50 */         dsrObjList.add(dsrObj);
/* 43:   */       }
/* 44:   */     }
/* 45:54 */     ModelMap model = new ModelMap();
/* 46:55 */     model.addAttribute("dsrObjList", dsrObjList);
/* 47:56 */     return model;
/* 48:   */   }
/* 49:   */   
/* 50:   */   @RequestMapping({"/documentResultMarkup.json"})
/* 51:   */   public ModelMap documentResultMarkup(int ontId, long docId)
/* 52:   */   {
/* 53:62 */     DocumentResult dr = null;
/* 54:   */     try
/* 55:   */     {
/* 56:64 */       dr = DocumentResultManager.getDocumentResult(ontId, docId, 0L);
/* 57:   */     }
/* 58:   */     catch (Exception e)
/* 59:   */     {
/* 60:66 */       e.printStackTrace();
/* 61:   */     }
/* 62:68 */     String markedUpDocument = dr.getMarkedUpDocument();
/* 63:69 */     String html = markedUpDocument.replace("\n", " ").replace("\r", " ");
/* 64:70 */     ModelMap model = new ModelMap();
/* 65:71 */     model.addAttribute("response", html);
/* 66:72 */     return model;
/* 67:   */   }
/* 68:   */ }


/* Location:           G:\Proximo\Search Incite\old system\actinium_169_21\opt\apache-tomcat-6.0.13\apache-tomcat-6.0.13\webapps\ViewResult\WEB-INF\classes\
 * Qualified Name:     sample.json.DocumentResultController
 * JD-Core Version:    0.7.0.1
 */