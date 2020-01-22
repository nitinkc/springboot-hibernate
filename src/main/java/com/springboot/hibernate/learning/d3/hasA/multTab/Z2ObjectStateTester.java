package com.springboot.hibernate.learning.d3.hasA.multTab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Z2ObjectStateTester implements CommandLineRunner {

	@Autowired
	private AppleRepository appleRepository;

	@Override
	public void run(String... args) throws Exception {
		Apple apple=new Apple();
		//apple is transient now
		apple.setAppleId(101);
		apple.setAppleLocation("Kashmir");

		appleRepository.save(apple);
	}
}
