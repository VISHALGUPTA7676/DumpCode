package com.office.crud.pojo;

import java.time.LocalDateTime;

public class UserExperiences {
	private int userExperienceId;
	private String description;
	private LocalDateTime createdOn;
	private byte noOfYears;
	private String companyName;
	private UserType userType;
	public int getUserExperienceId() {
		return userExperienceId;
	}
	public void setUserExperienceId(int userExperienceId) {
		this.userExperienceId = userExperienceId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDateTime getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}
	public byte getNoOfYears() {
		return noOfYears;
	}
	public void setNoOfYears(byte noOfYears) {
		this.noOfYears = noOfYears;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public UserType getUserType() {
		return userType;
	}
	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	@Override
	public String toString() {
		return "UserExperiences [userExperienceId=" + userExperienceId + ", description=" + description + ", createdOn="
				+ createdOn + ", noOfYears=" + noOfYears + ", companyName=" + companyName + ", userType=" + userType
				+ "]";
	}
	
	
	

}
