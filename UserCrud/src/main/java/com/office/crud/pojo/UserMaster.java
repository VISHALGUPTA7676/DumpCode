package com.office.crud.pojo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class UserMaster {
	
	private int userid;
	private String emailId;
	private String password;
	private LocalDateTime createdOn;
	private LocalDateTime updatedOn;
	private boolean isActive;
	private List<UserLanguage> userLanguages = new ArrayList<>();
	private List<UserExperiences> userExperiences = new ArrayList<>();
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDateTime getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}
	public LocalDateTime getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(LocalDateTime updatedOn) {
		this.updatedOn = updatedOn;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public List<UserLanguage> getUserLanguages() {
		return userLanguages;
	}
	public void setUserLanguages(List<UserLanguage> userLanguages) {
		this.userLanguages = userLanguages;
	}
	public List<UserExperiences> getUserExperiences() {
		return userExperiences;
	}
	public void setUserExperiences(List<UserExperiences> userExperiences) {
		this.userExperiences = userExperiences;
	}
	@Override
	public String toString() {
		return "UserMaster [userid=" + userid + ", emailId=" + emailId + ", password=" + password + ", createdOn="
				+ createdOn + ", updatedOn=" + updatedOn + ", isActive=" + isActive + ", userLanguages=" + userLanguages
				+ ", userExperiences=" + userExperiences + "]";
	}
	
	
	

	
}
