package com.searchincite.client.entity;

import com.google.gwt.user.client.rpc.IsSerializable;
import java.util.Date;

public class Document
  implements IsSerializable
{
  private int m_iOrganizationID;
  private long m_lDocumentID = -1L;
  private String m_strFilename;
  private String m_strDescription;
  private Date m_dtCreated;
  private int m_iCreatedByUserID;
  private Date m_dtLastModified;
  private int m_iLastModifiedByUserID;
  private byte[] m_bArrContent;
  private int m_iDocumentSourceID;
  private String status;
  private String ontologyName;
  public static final long FIELD_ID = 2L;
  public static final long FIELD_ORGANIZATION_ID = 4L;
  public static final long FIELD_FILENAME = 8L;
  public static final long FIELD_DESCRIPTION = 16L;
  public static final long FIELD_DATE_CREATED = 32L;
  public static final long FIELD_CREATED_BY_USER = 64L;
  public static final long FIELD_MODIFIED_BY_USER = 128L;
  public static final long FIELD_DATE_MODIFIED = 256L;
  public static final long FIELD_CONTENT = 512L;
  public static final long FIELD_DOCUMENT_SOURCE_ID = 1024L;
  public static final long FIELD_ALL_FIELDS = 2030L;
  
  public Long getDocumentId()
  {
    return Long.valueOf(getDocumentID());
  }
  
  public void setDocumentId(Long documentId)
  {
    setDocumentID(documentId.longValue());
  }
  
  public String getFileName()
  {
    return getFilename();
  }
  
  public void setFileName(String fileName)
  {
    setFilename(fileName);
  }
  
  public void setOntologyName(String ontologyName)
  {
    this.ontologyName = ontologyName;
  }
  
  public String getOntologyName()
  {
    return this.ontologyName;
  }
  
  public void setStatus(String status)
  {
    this.status = status;
  }
  
  public String getStatus()
  {
    return this.status;
  }
  
  public int getDocumentSourceID()
  {
    return this.m_iDocumentSourceID;
  }
  
  public void setDocumentSourceID(int documentSourceID)
  {
    this.m_iDocumentSourceID = documentSourceID;
  }
  
  public byte[] getContent()
  {
    return this.m_bArrContent;
  }
  
  public void setContent(byte[] documentContent)
  {
    this.m_bArrContent = documentContent;
  }
  
  public int getOrganizationID()
  {
    return this.m_iOrganizationID;
  }
  
  public void setOrganizationID(int iOrganizationID)
  {
    this.m_iOrganizationID = iOrganizationID;
  }
  
  public long getDocumentID()
  {
    return this.m_lDocumentID;
  }
  
  public void setDocumentID(long documentID)
  {
    this.m_lDocumentID = documentID;
  }
  
  public String getDescription()
  {
    return this.m_strDescription;
  }
  
  public void setDescription(String description)
  {
    this.m_strDescription = description;
  }
  
  public String getFilename()
  {
    return this.m_strFilename;
  }
  
  public void setFilename(String filename)
  {
    this.m_strFilename = filename;
  }
  
  public Date getDateCreated()
  {
    return this.m_dtCreated;
  }
  
  public void setDateCreated(Date created)
  {
    this.m_dtCreated = created;
  }
  
  public Date getLastModifiedDate()
  {
    return this.m_dtLastModified;
  }
  
  public void setLastModifiedDate(Date lastModified)
  {
    this.m_dtLastModified = lastModified;
  }
  
  public int getCreatedByUserID()
  {
    return this.m_iCreatedByUserID;
  }
  
  public void setCreatedByUserID(int createdByUserID)
  {
    this.m_iCreatedByUserID = createdByUserID;
  }
  
  public int getLastModifiedByUserID()
  {
    return this.m_iLastModifiedByUserID;
  }
  
  public void setLastModifiedByUserID(int lastModifiedByUserID)
  {
    this.m_iLastModifiedByUserID = lastModifiedByUserID;
  }
  
  public String getContentString()
  {
    String strRet = new String("");
    for (int i = 0; i < this.m_bArrContent.length; i++) {
      strRet = strRet + (char)this.m_bArrContent[i];
    }
    return strRet;
  }
  
  public void setContentString(String strContent)
  {
    byte[] bArr = new byte[strContent.length()];
    for (int i = 0; i < strContent.length(); i++) {
      bArr[i] = ((byte)strContent.charAt(i));
    }
    setContent(bArr);
  }
}
