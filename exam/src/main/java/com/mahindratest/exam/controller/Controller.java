package com.mahindratest.exam.controller;

import java.util.List;

//LeadController.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mahindratest.exam.dao.Lead;
import com.mahindratest.exam.dao.LeadRepository;
import com.mahindratest.exam.service.ApiErrorResponse;
import com.mahindratest.exam.service.ApiResponse;
import com.mahindratest.exam.service.ErrorDetails;
import com.mahindratest.exam.service.LeadAlreadyExistsException;
import com.mahindratest.exam.service.LeadResponse;
import com.mahindratest.exam.service.LeadService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/leads")
public class Controller {

 @Autowired
 private LeadService leadService;

 @Autowired
 private LeadRepository leadRepository;
 @PostMapping
 public ApiResponse createLead(@Valid @RequestBody Lead lead) {
     try {
    	 if (leadRepository.existsByLeadId(lead.getLeadId())) {
    		 ErrorDetails errorResponse = new ErrorDetails("E10010","Lead Already Exists in the database with the lead id");
    		 return new ApiErrorResponse("error",errorResponse);
         }else {
         Lead createdLead = leadService.createLead(lead);
         return new ApiResponse("success", "Created Leads Successfully");
         }
     } catch (LeadAlreadyExistsException e) {
         return new ApiErrorResponse("error", new ErrorDetails("E10010", e.getMessage()));
     }
 }
 
 @GetMapping("/mobileNumber/{mobileNumber}")
 public ResponseEntity<LeadResponse> getLeadsByMobileNumber(@PathVariable Long mobileNumber) {
     List<Lead> leads = leadService.getLeadsByMobileNumber(mobileNumber);

     if (leads.isEmpty()) {
         LeadResponse response = new LeadResponse("error", "No leads found with the given mobile number", null);
         return ResponseEntity.status(404).body(response);
     } else {
         LeadResponse response = new LeadResponse("success", "Leads retrieved successfully", leads);
         return ResponseEntity.ok(response);
     }
 }
}

