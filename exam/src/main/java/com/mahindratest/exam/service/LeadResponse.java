package com.mahindratest.exam.service;

import java.util.List;

import com.mahindratest.exam.dao.Lead;

public class LeadResponse {

    private String status;
    private String message;
    private List<Lead> leads;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LeadResponse(String status, String message, List<Lead> leads) {
		super();
		this.status = status;
		this.message = message;
		this.leads = leads;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<Lead> getLeads() {
		return leads;
	}
	public void setLeads(List<Lead> leads) {
		this.leads = leads;
	}
}
