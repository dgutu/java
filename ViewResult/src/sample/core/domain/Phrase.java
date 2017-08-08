/*  1:   */ package sample.core.domain;
/*  2:   */ 
/*  3:   */ import java.io.Serializable;
/*  4:   */ import java.util.Date;
/*  5:   */ 
/*  6:   */ public class Phrase
/*  7:   */   implements Serializable
/*  8:   */ {
/*  9:   */   private int m_iPhraseID;
/* 10:   */   private int m_iSubjectID;
/* 11:   */   private String m_strName;
/* 12:   */   private String m_strColor;
/* 13:   */   private double m_dWeight;
/* 14:   */   private Date m_dtCreated;
/* 15:   */   private int m_iCreatedByUserID;
/* 16:   */   private Date m_dtLastModified;
/* 17:   */   private int m_iLastModifiedByUserID;
/* 18:   */   
/* 19:   */   public int getPhraseID()
/* 20:   */   {
/* 21:19 */     return this.m_iPhraseID;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setPhraseID(int iPhraseID)
/* 25:   */   {
/* 26:22 */     this.m_iPhraseID = iPhraseID;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public int getSubjectID()
/* 30:   */   {
/* 31:26 */     return this.m_iSubjectID;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setSubjectID(int iSubjectID)
/* 35:   */   {
/* 36:29 */     this.m_iSubjectID = iSubjectID;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public Date getDateCreated()
/* 40:   */   {
/* 41:33 */     return this.m_dtCreated;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setDateCreated(Date created)
/* 45:   */   {
/* 46:36 */     this.m_dtCreated = created;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public Date getLastModifiedDate()
/* 50:   */   {
/* 51:39 */     return this.m_dtLastModified;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setLastModifiedDate(Date lastModified)
/* 55:   */   {
/* 56:42 */     this.m_dtLastModified = lastModified;
/* 57:   */   }
/* 58:   */   
/* 59:   */   public int getCreatedByUserID()
/* 60:   */   {
/* 61:45 */     return this.m_iCreatedByUserID;
/* 62:   */   }
/* 63:   */   
/* 64:   */   public void setCreatedByUserID(int createdByUserID)
/* 65:   */   {
/* 66:48 */     this.m_iCreatedByUserID = createdByUserID;
/* 67:   */   }
/* 68:   */   
/* 69:   */   public int getLastModifiedByUserID()
/* 70:   */   {
/* 71:51 */     return this.m_iLastModifiedByUserID;
/* 72:   */   }
/* 73:   */   
/* 74:   */   public void setLastModifiedByUserID(int lastModifiedByUserID)
/* 75:   */   {
/* 76:54 */     this.m_iLastModifiedByUserID = lastModifiedByUserID;
/* 77:   */   }
/* 78:   */   
/* 79:   */   public String getColor()
/* 80:   */   {
/* 81:57 */     return this.m_strColor;
/* 82:   */   }
/* 83:   */   
/* 84:   */   public void setColor(String color)
/* 85:   */   {
/* 86:60 */     this.m_strColor = color;
/* 87:   */   }
/* 88:   */   
/* 89:   */   public String getName()
/* 90:   */   {
/* 91:63 */     return this.m_strName;
/* 92:   */   }
/* 93:   */   
/* 94:   */   public void setName(String name)
/* 95:   */   {
/* 96:66 */     this.m_strName = name;
/* 97:   */   }
/* 98:   */   
/* 99:   */   public double getWeight()
/* :0:   */   {
/* :1:69 */     return this.m_dWeight;
/* :2:   */   }
/* :3:   */   
/* :4:   */   public void setWeight(double weight)
/* :5:   */   {
/* :6:72 */     this.m_dWeight = weight;
/* :7:   */   }
/* :8:   */ }


/* Location:           G:\Proximo\Search Incite\old system\actinium_169_21\opt\apache-tomcat-6.0.13\apache-tomcat-6.0.13\webapps\ViewResult\WEB-INF\classes\
 * Qualified Name:     sample.core.domain.Phrase
 * JD-Core Version:    0.7.0.1
 */