package com.searchincite.client.entity;

public class ChangeEvent {

	private boolean m_bIsCreate = false;
	private boolean m_bIsUpdate = false;
	private boolean m_bIsDelete = false;
	
	public ChangeEvent(boolean bIsCreate, boolean bIsUpdate, boolean bIsDelete) {
		m_bIsCreate = bIsCreate;
		m_bIsUpdate = bIsUpdate;
		m_bIsDelete = bIsDelete;
	}

	public boolean isCreate() {
		return m_bIsCreate == true;
	}

	public boolean isUpdate() {
		return m_bIsUpdate == true;
	}

	public boolean isDelete() {
		return m_bIsDelete == true;
	}

}
