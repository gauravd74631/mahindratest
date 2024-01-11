package com.mahindratest.exam.dao;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
//Lead.java
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Entity
public class Lead {
	@Id
	@NotNull
    @Min(value = 1, message = "LeadId should be a positive integer")
    private Integer leadId;

    @NotNull
    @Pattern(regexp = "^[a-zA-Z]+$", message = "FirstName should contain only alphabets")
    private String firstName;

    @Pattern(regexp = "^[a-zA-Z]*$", message = "MiddleName should contain only alphabets")
    private String middleName;

    @NotNull
    @Pattern(regexp = "^[a-zA-Z]+$", message = "LastName should contain only alphabets")
    private String lastName;
    
    @Column(name = "mobile_number")
    @NotNull
    @Min(value = 1000000000, message = "MobileNumber should be a 10-digit integer with the first digit greater than 5")
    private Long mobileNumber;

    
    @Pattern(regexp = "^(?i)(Male|Female|Others)$", message = "Gender should be Male, Female, or Others")
    private String gender;

   
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dob;

    @NotNull
    @Email(message = "Invalid email format")
    private String email;

 public Integer getLeadId() {
		return leadId;
	}
	public void setLeadId(Integer leadId) {
		this.leadId = leadId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

 // getters and setters
}
