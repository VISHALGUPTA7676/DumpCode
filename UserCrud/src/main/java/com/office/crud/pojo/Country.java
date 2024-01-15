package com.office.crud.pojo;

public class Country {
	private short countryId;
	private String countryName;
	public short getCountryId() {
		return countryId;
	}
	public void setCountryId(short countryId) {
		this.countryId = countryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", countryName=" + countryName + "]";
	}
	
	
}
