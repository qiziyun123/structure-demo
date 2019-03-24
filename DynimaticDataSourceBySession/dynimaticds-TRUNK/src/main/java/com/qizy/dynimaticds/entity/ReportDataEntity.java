package com.qizy.dynimaticds.entity;

public class ReportDataEntity {

	private String userId;
	private Long dataId;
	private String message;
	// yyyyMMDD
	private int date;
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Long getDataId() {
		return dataId;
	}

	public void setDataId(Long dataId) {
		this.dataId = dataId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	
}
