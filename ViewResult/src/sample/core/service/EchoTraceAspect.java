/*  1:   */ package sample.core.service;
/*  2:   */ 
/*  3:   */ import java.util.logging.Logger;
/*  4:   */ import org.aspectj.lang.ProceedingJoinPoint;
/*  5:   */ import org.aspectj.lang.annotation.Around;
/*  6:   */ import org.aspectj.lang.annotation.Aspect;
/*  7:   */ 
/*  8:   */ @Aspect
/*  9:   */ public class EchoTraceAspect
/* 10:   */ {
/* 11:16 */   private Logger log = Logger.getLogger("EchoTraceAspect");
/* 12:   */   
/* 13:   */   @Around("execution(* EchoService.echo(..))")
/* 14:   */   public Object traceService(ProceedingJoinPoint joinPoint)
/* 15:   */     throws Throwable
/* 16:   */   {
/* 17:21 */     this.log.info("EchoService call started");
/* 18:   */     try
/* 19:   */     {
/* 20:24 */       Object result = joinPoint.proceed();
/* 21:25 */       this.log.info("EchoService call ended");
/* 22:26 */       return result;
/* 23:   */     }
/* 24:   */     catch (Throwable t)
/* 25:   */     {
/* 26:29 */       this.log.info("EchoService threw " + t.getClass().getName());
/* 27:   */       
/* 28:31 */       throw t;
/* 29:   */     }
/* 30:   */   }
/* 31:   */ }


/* Location:           G:\Proximo\Search Incite\old system\actinium_169_21\opt\apache-tomcat-6.0.13\apache-tomcat-6.0.13\webapps\ViewResult\WEB-INF\classes\
 * Qualified Name:     sample.core.service.EchoTraceAspect
 * JD-Core Version:    0.7.0.1
 */