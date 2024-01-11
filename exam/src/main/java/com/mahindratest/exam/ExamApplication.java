package com.mahindratest.exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.mahindratest.exam.dao")
@SpringBootApplication
@ComponentScan(basePackages = {"com.mahindratest.exam.controller","com.mahindratest.exam.service"})
@EntityScan("com.mahindratest.exam.dao")
public class ExamApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamApplication.class, args);
	}

}
