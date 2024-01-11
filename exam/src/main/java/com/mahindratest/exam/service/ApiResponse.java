package com.mahindratest.exam.service;

//ApiResponse.java
public class ApiResponse {

	private String status;
	private String data;

	

	public ApiResponse(String status, String data) {
		super();
		this.status = status;
		this.data = data;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	// getters and setters
}
