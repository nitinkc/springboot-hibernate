package com.springboot.hibernate.learning;

import org.hibernate.resource.beans.container.internal.CdiBeanContainerExtendedAccessImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearningApplication{

	@Autowired
	static final Logger LOG = LoggerFactory.getLogger(LearningApplication.class);

	public static void main(String[] args){

		LOG.info("STARTING THE APPLICATION");
		SpringApplication.run(LearningApplication.class, args);
		LOG.info("APPLICATION FINISHED CREATING MODEL AND LOADING TEST DATA");
	}
}
