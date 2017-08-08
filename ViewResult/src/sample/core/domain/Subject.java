/*  1:   */ package sample.core.domain;
/*  2:   */ 
/*  3:   */ import java.io.Serializable;
/*  4:   */ import java.util.Date;
/*  5:   */ 
/*  6:   */ public class Subject
/*  7:   */   implements Serializable
/*  8:   */ {
/*  9:   */   public static final long FIELD_ID = 2L;
/* 10:   */   public static final long FIELD_NAME = 4L;
/* 11:   */   public static final long FIELD_COLOR = 8L;
/* 12:   */   public static final long FIELD_WEIGHT = 16L;
/* 13:   */   public static final long FIELD_DATE_CREATED = 32L;
/* 14:   */   public static final long FIELD_CREATED_BY_USER = 64L;
/* 15:   */   public static final long FIELD_MODIFIED_BY_USER = 128L;
/* 16:   */   public static final long FIELD_DATE_MODIFIED = 256L;
/* 17:   */   public static final long FIELD_PHRASES = 512L;
/* 18:   */   public static final long FIELD_ALL_FIELDS = 1022L;
/* 19:   */   private int m_iSubjectID;
/* 20:   */   private String m_strName;
/* 21:   */   private String m_strColor;
/* 22:   */   private double m_dWeight;
/* 23:   */   private Date m_dtCreated;
/* 24:   */   private int m_iCreatedByUserID;
/* 25:   */   private Date m_dtLastModified;
/* 26:   */   private int m_iLastModifiedByUserID;
/* 27:   */   private Phrase[] m_arrPhrases;
/* 28:   */   private int m_iOntologyID;
/* 29:   */   private boolean m_bActive;
/* 30:   */   
/* 31:   */   public boolean getActive()
/* 32:   */   {
/* 33:34 */     return this.m_bActive;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void setActive(boolean active)
/* 37:   */   {
/* 38:37 */     this.m_bActive = active;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public Date getDateCreated()
/* 42:   */   {
/* 43:40 */     return this.m_dtCreated;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public void setDateCreated(Date created)
/* 47:   */   {
/* 48:43 */     this.m_dtCreated = created;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public Date getLastModifiedDate()
/* 52:   */   {
/* 53:46 */     return this.m_dtLastModified;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public void setLastModifiedDate(Date lastModified)
/* 57:   */   {
/* 58:49 */     this.m_dtLastModified = lastModified;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public int getCreatedByUserID()
/* 62:   */   {
/* 63:52 */     return this.m_iCreatedByUserID;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public void setCreatedByUserID(int createdByUserID)
/* 67:   */   {
/* 68:55 */     this.m_iCreatedByUserID = createdByUserID;
/* 69:   */   }
/* 70:   */   
/* 71:   */   public int getLastModifiedByUserID()
/* 72:   */   {
/* 73:58 */     return this.m_iLastModifiedByUserID;
/* 74:   */   }
/* 75:   */   
/* 76:   */   public void setLastModifiedByUserID(int lastModifiedByUserID)
/* 77:   */   {
/* 78:61 */     this.m_iLastModifiedByUserID = lastModifiedByUserID;
/* 79:   */   }
/* 80:   */   
/* 81:   */   public int getSubjectID()
/* 82:   */   {
/* 83:64 */     return this.m_iSubjectID;
/* 84:   */   }
/* 85:   */   
/* 86:   */   public void setSubjectID(int subjectID)
/* 87:   */   {
/* 88:67 */     this.m_iSubjectID = subjectID;
/* 89:   */   }
/* 90:   */   
/* 91:   */   public String getColor()
/* 92:   */   {
/* 93:70 */     return this.m_strColor;
/* 94:   */   }
/* 95:   */   
/* 96:   */   public void setColor(String color)
/* 97:   */   {
/* 98:73 */     this.m_strColor = color;
/* 99:   */   }
/* :0:   */   
/* :1:   */   public String getName()
/* :2:   */   {
/* :3:76 */     return this.m_strName;
/* :4:   */   }
/* :5:   */   
/* :6:   */   public void setName(String name)
/* :7:   */   {
/* :8:79 */     this.m_strName = name;
/* :9:   */   }
/* ;0:   */   
/* ;1:   */   public double getWeight()
/* ;2:   */   {
/* ;3:82 */     return this.m_dWeight;
/* ;4:   */   }
/* ;5:   */   
/* ;6:   */   public void setWeight(double weight)
/* ;7:   */   {
/* ;8:85 */     this.m_dWeight = weight;
/* ;9:   */   }
/* <0:   */   
/* <1:   */   public Phrase[] getPhrases()
/* <2:   */   {
/* <3:88 */     return this.m_arrPhrases;
/* <4:   */   }
/* <5:   */   
/* <6:   */   public void setPhrases(Phrase[] arrPhrases)
/* <7:   */   {
/* <8:91 */     this.m_arrPhrases = arrPhrases;
/* <9:   */   }
/* =0:   */   
/* =1:   */   public int getOntologyID()
/* =2:   */   {
/* =3:94 */     return this.m_iOntologyID;
/* =4:   */   }
/* =5:   */   
/* =6:   */   public void setOntologyID(int iOntologyID)
/* =7:   */   {
/* =8:97 */     this.m_iOntologyID = iOntologyID;
/* =9:   */   }
/* >0:   */ }


/* Location:           G:\Proximo\Search Incite\old system\actinium_169_21\opt\apache-tomcat-6.0.13\apache-tomcat-6.0.13\webapps\ViewResult\WEB-INF\classes\
 * Qualified Name:     sample.core.domain.Subject
 * JD-Core Version:    0.7.0.1
 */