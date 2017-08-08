/*  1:   */ package sample.core.service;
/*  2:   */ 
/*  3:   */ import org.springframework.security.annotation.Secured;
/*  4:   */ import org.springframework.stereotype.Service;
/*  5:   */ 
/*  6:   */ @Service("echoService")
/*  7:   */ public class EchoService
/*  8:   */ {
/*  9:   */   @Secured({"ROLE_ADMIN"})
/* 10:   */   public String echo(String message)
/* 11:   */   {
/* 12:15 */     return message;
/* 13:   */   }
/* 14:   */ }


/* Location:           G:\Proximo\Search Incite\old system\actinium_169_21\opt\apache-tomcat-6.0.13\apache-tomcat-6.0.13\webapps\ViewResult\WEB-INF\classes\
 * Qualified Name:     sample.core.service.EchoService
 * JD-Core Version:    0.7.0.1
 */