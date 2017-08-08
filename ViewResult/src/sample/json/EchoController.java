/*  1:   */ package sample.json;
/*  2:   */ 
/*  3:   */ import javax.annotation.Resource;
/*  4:   */ import org.springframework.stereotype.Controller;
/*  5:   */ import org.springframework.ui.ModelMap;
/*  6:   */ import org.springframework.web.bind.annotation.RequestMapping;
/*  7:   */ import sample.core.service.EchoService;
/*  8:   */ 
/*  9:   */ @Controller
/* 10:   */ public class EchoController
/* 11:   */ {
/* 12:   */   @Resource(name="echoService")
/* 13:   */   private EchoService echoService;
/* 14:   */   
/* 15:   */   @RequestMapping({"/echo.json"})
/* 16:   */   public ModelMap echoMessage(String text)
/* 17:   */   {
/* 18:23 */     String response = this.echoService.echo(text);
/* 19:24 */     ModelMap model = new ModelMap("response", response);
/* 20:25 */     return model;
/* 21:   */   }
/* 22:   */ }


/* Location:           G:\Proximo\Search Incite\old system\actinium_169_21\opt\apache-tomcat-6.0.13\apache-tomcat-6.0.13\webapps\ViewResult\WEB-INF\classes\
 * Qualified Name:     sample.json.EchoController
 * JD-Core Version:    0.7.0.1
 */