package com.mahindratest.exam.service;

//ApiErrorResponse.java
public class ApiErrorResponse extends ApiResponse {

 private ErrorDetails errorResponse;

 public ApiErrorResponse(String status, ErrorDetails errorResponse) {
     super(status, null);
     this.errorResponse = errorResponse;
 }

 // getters and setters
}