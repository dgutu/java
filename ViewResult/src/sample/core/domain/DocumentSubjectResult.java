/*  1:   */ package sample.core.domain;
/*  2:   */ 
/*  3:   */ import java.io.Serializable;
/*  4:   */ 
/*  5:   */ public class DocumentSubjectResult
/*  6:   */   implements Serializable
/*  7:   */ {
/*  8:   */   private Subject m_Subject;
/*  9:   */   private String m_strResult;
/* 10:   */   
/* 11:   */   public Subject getSubject()
/* 12:   */   {
/* 13:11 */     return this.m_Subject;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public void setSubject(Subject s)
/* 17:   */   {
/* 18:14 */     this.m_Subject = s;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public String getResult()
/* 22:   */   {
/* 23:17 */     return this.m_strResult;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void setResult(String strResult)
/* 27:   */   {
/* 28:20 */     this.m_strResult = strResult;
/* 29:   */   }
/* 30:   */ }


/* Location:           G:\Proximo\Search Incite\old system\actinium_169_21\opt\apache-tomcat-6.0.13\apache-tomcat-6.0.13\webapps\ViewResult\WEB-INF\classes\
 * Qualified Name:     sample.core.domain.DocumentSubjectResult
 * JD-Core Version:    0.7.0.1
 */