package com.mahindratest.exam.service;

import java.util.List;

//LeadService.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mahindratest.exam.dao.Lead;
import com.mahindratest.exam.dao.LeadRepository;

import jakarta.transaction.Transactional;
@Transactional
@Service
public class LeadService {

 @Autowired
 private LeadRepository leadRepository;

 public Lead createLead(Lead lead) {
     
     // Add other validations and save the lead to the repository
     return leadRepository.save(lead);
 }
 public List<Lead> getLeadsByMobileNumber(Long mobileNumber) {
     List<Lead> tt =leadRepository.findByMobileNumber(mobileNumber);
     return tt;
 }
}
