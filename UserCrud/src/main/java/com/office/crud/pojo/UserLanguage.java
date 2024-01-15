package com.office.crud.pojo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UserLanguage {
	private int userLanguageId;
	private LocalDateTime createdOn;
	private MasterLanguage masterLanguage;
	public int getUserLanguageId() {
		return userLanguageId;
	}
	public void setUserLanguageId(int userLanguageId) {
		this.userLanguageId = userLanguageId;
	}
	public LocalDateTime getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}
	public MasterLanguage getMasterLanguage() {
		return masterLanguage;
	}
	public void setMasterLanguage(MasterLanguage masterLanguage) {
		this.masterLanguage = masterLanguage;
	}
	@Override
	public String toString() {
		return "UserLanguage [userLanguageId=" + userLanguageId + ", createdOn=" + createdOn + ", masterLanguage="
				+ masterLanguage + "]";
	}
	
	

}
