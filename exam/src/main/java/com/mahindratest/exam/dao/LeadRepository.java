package com.mahindratest.exam.dao;

import java.util.List;

//LeadRepository.java
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface LeadRepository extends JpaRepository<Lead, Integer> {

 boolean existsByLeadId(Integer leadId);
 
 
 List<Lead> findByMobileNumber(Long mobileNumber);

}
