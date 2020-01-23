package com.springboot.hibernate.learning.d4.hasA.mapping.one2one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class T1OTOTester implements CommandLineRunner {
	@Autowired
	private M1ResidentRepository m1ResidentRepository;
	@Autowired
	private M1SSNCardRespository m1SSNCardRespository;

	@Override
	public void run(String... args) throws Exception {
		M1SSNCard card = new M1SSNCard();
		card.setSsn(123456789);
		card.setIssuedBy("Ohio");

		M1Resident person = new M1Resident();
		person.setName("Nitin");
		person.setSsn(card);

		m1SSNCardRespository.save(card);
		m1ResidentRepository.save(person);
	}
}
