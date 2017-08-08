/*  1:   */ package sample.core.service;
/*  2:   */ 
/*  3:   */ import java.util.Comparator;
/*  4:   */ import sample.core.domain.Subject;
/*  5:   */ 
/*  6:   */ public class SubjectComparer
/*  7:   */   implements Comparator<Object>
/*  8:   */ {
/*  9: 9 */   private long m_lSortField = 0L;
/* 10:   */   
/* 11:   */   public void setSortField(long lSortField)
/* 12:   */   {
/* 13:12 */     this.m_lSortField = lSortField;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public void addSortField(long lSortField)
/* 17:   */   {
/* 18:16 */     this.m_lSortField |= lSortField;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void removeSortField(long lSortField)
/* 22:   */   {
/* 23:20 */     this.m_lSortField |= lSortField ^ 0xFFFFFFFF;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public SubjectComparer(long lSortField)
/* 27:   */   {
/* 28:24 */     setSortField(lSortField);
/* 29:   */   }
/* 30:   */   
/* 31:   */   public int compare(Object o1, Object o2)
/* 32:   */   {
/* 33:29 */     Subject s1 = (Subject)o1;
/* 34:30 */     Subject s2 = (Subject)o2;
/* 35:32 */     if ((s1 != null) && (s2 != null)) {
/* 36:34 */       if ((this.m_lSortField & 0x4) == 4L) {
/* 37:35 */         return s1.getName().compareTo(s2.getName());
/* 38:   */       }
/* 39:   */     }
/* 40:42 */     return 0;
/* 41:   */   }
/* 42:   */ }


/* Location:           G:\Proximo\Search Incite\old system\actinium_169_21\opt\apache-tomcat-6.0.13\apache-tomcat-6.0.13\webapps\ViewResult\WEB-INF\classes\
 * Qualified Name:     sample.core.service.SubjectComparer
 * JD-Core Version:    0.7.0.1
 */