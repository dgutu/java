/*  1:   */ package sample.core.domain;
/*  2:   */ 
/*  3:   */ import java.io.Serializable;
/*  4:   */ import java.util.Date;
/*  5:   */ 
/*  6:   */ public class Ontology
/*  7:   */   implements Serializable
/*  8:   */ {
/*  9:   */   public static final long FIELD_ID = 2L;
/* 10:   */   public static final long FIELD_NAME = 4L;
/* 11:   */   public static final long FIELD_DESCRIPTION = 8L;
/* 12:   */   public static final long FIELD_DATE_CREATED = 16L;
/* 13:   */   public static final long FIELD_CREATED_BY_USER = 32L;
/* 14:   */   public static final long FIELD_MODIFIED_BY_USER = 64L;
/* 15:   */   public static final long FIELD_DATE_MODIFIED = 128L;
/* 16:   */   public static final long FIELD_SUBJECTS = 256L;
/* 17:   */   public static final long FIELD_PHRASES = 512L;
/* 18:   */   public static final long FIELD_CATEGORY_ID = 1024L;
/* 19:   */   public static final long FIELD_ALL_FIELDS = 2046L;
/* 20:   */   int m_iOrganizationID;
/* 21:   */   int m_iOntologyID;
/* 22:   */   String m_strName;
/* 23:   */   String m_strDescription;
/* 24:   */   Date m_dtCreated;
/* 25:   */   int m_iCreatedByUserID;
/* 26:   */   Date m_dtLastModified;
/* 27:   */   int m_iLastModifiedByUserID;
/* 28:   */   Subject[] m_arrSubjects;
/* 29:   */   int m_iCategoryID;
/* 30:   */   
/* 31:   */   public int getOrganizationID()
/* 32:   */   {
/* 33:34 */     return this.m_iOrganizationID;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void setOrganizationID(int iOrganizationID)
/* 37:   */   {
/* 38:37 */     this.m_iOrganizationID = iOrganizationID;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public int getCategoryID()
/* 42:   */   {
/* 43:41 */     return this.m_iCategoryID;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public void setCategoryID(int iCategoryID)
/* 47:   */   {
/* 48:44 */     this.m_iCategoryID = iCategoryID;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public Date getDateCreated()
/* 52:   */   {
/* 53:48 */     return this.m_dtCreated;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public void setDateCreated(Date created)
/* 57:   */   {
/* 58:51 */     this.m_dtCreated = created;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public Date getLastModifiedDate()
/* 62:   */   {
/* 63:54 */     return this.m_dtLastModified;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public void setLastModifiedDate(Date lastModified)
/* 67:   */   {
/* 68:57 */     this.m_dtLastModified = lastModified;
/* 69:   */   }
/* 70:   */   
/* 71:   */   public int getCreatedByUserID()
/* 72:   */   {
/* 73:60 */     return this.m_iCreatedByUserID;
/* 74:   */   }
/* 75:   */   
/* 76:   */   public void setCreatedByUserID(int createdByUserID)
/* 77:   */   {
/* 78:63 */     this.m_iCreatedByUserID = createdByUserID;
/* 79:   */   }
/* 80:   */   
/* 81:   */   public int getLastModifiedByUserID()
/* 82:   */   {
/* 83:66 */     return this.m_iLastModifiedByUserID;
/* 84:   */   }
/* 85:   */   
/* 86:   */   public void setLastModifiedByUserID(int lastModifiedByUserID)
/* 87:   */   {
/* 88:69 */     this.m_iLastModifiedByUserID = lastModifiedByUserID;
/* 89:   */   }
/* 90:   */   
/* 91:   */   public int getOntologyID()
/* 92:   */   {
/* 93:72 */     return this.m_iOntologyID;
/* 94:   */   }
/* 95:   */   
/* 96:   */   public void setOntologyID(int ontologyID)
/* 97:   */   {
/* 98:75 */     this.m_iOntologyID = ontologyID;
/* 99:   */   }
/* :0:   */   
/* :1:   */   public String getDescription()
/* :2:   */   {
/* :3:78 */     return this.m_strDescription;
/* :4:   */   }
/* :5:   */   
/* :6:   */   public void setDescription(String description)
/* :7:   */   {
/* :8:81 */     this.m_strDescription = description;
/* :9:   */   }
/* ;0:   */   
/* ;1:   */   public String getName()
/* ;2:   */   {
/* ;3:84 */     return this.m_strName;
/* ;4:   */   }
/* ;5:   */   
/* ;6:   */   public void setName(String name)
/* ;7:   */   {
/* ;8:87 */     this.m_strName = name;
/* ;9:   */   }
/* <0:   */   
/* <1:   */   public Subject[] getSubjects()
/* <2:   */   {
/* <3:90 */     return this.m_arrSubjects;
/* <4:   */   }
/* <5:   */   
/* <6:   */   public void setSubjects(Subject[] arrSubjects)
/* <7:   */   {
/* <8:93 */     this.m_arrSubjects = arrSubjects;
/* <9:   */   }
/* =0:   */ }


/* Location:           G:\Proximo\Search Incite\old system\actinium_169_21\opt\apache-tomcat-6.0.13\apache-tomcat-6.0.13\webapps\ViewResult\WEB-INF\classes\
 * Qualified Name:     sample.core.domain.Ontology
 * JD-Core Version:    0.7.0.1
 */