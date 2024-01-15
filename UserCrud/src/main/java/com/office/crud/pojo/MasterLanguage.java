package com.office.crud.pojo;

public class MasterLanguage {
	private byte languageId;
	private String language;
	public byte getLanguageId() {
		return languageId;
	}
	public void setLanguageId(byte languageId) {
		this.languageId = languageId;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	@Override
	public String toString() {
		return "MasterLanguage [languageId=" + languageId + ", language=" + language + "]";
	}
	
}
