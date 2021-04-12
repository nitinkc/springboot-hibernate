/* BUG: CHECK*/
package com.springboot.hibernate.learning.d3.hasA.multTab;
import java.util.ArrayList;
import java.util.List;

/**
 * HAS-A Relationship between User class and Address Class
 * One Table for all the classes  
 */

import com.springboot.hibernate.learning.test.MyRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Component;

@Component
//@Order(value = 2)
@ConditionalOnExpression("${z2Tester:false}")
public class Z2Tester implements CommandLineRunner {
	@Autowired
	private H3EmpRepository h3EmpRepository;

	private final Logger logger = LoggerFactory.getLogger(MyRunner.class);

	@Override
	public void run(String... args) throws Exception {
		/* 3 address that are used in the User Class*/
		H3EmpAddress myOfficeAddress=new H3EmpAddress();
		myOfficeAddress.setZipCode(12345);
		myOfficeAddress.setEmpCity("Fremont");

		H3EmpAddress homeAddress=new H3EmpAddress();
		homeAddress.setZipCode(54321);
		homeAddress.setEmpCity("Chicago");

		H3EmpAddress hisOfficeAddress=new H3EmpAddress();
		hisOfficeAddress.setZipCode(98765);
		hisOfficeAddress.setEmpCity("Seattle");

		//List of addresses for various users
		List<H3EmpAddress> myAdresses = new ArrayList<H3EmpAddress>();
		myAdresses.add(myOfficeAddress);
		myAdresses.add(homeAddress);
		myAdresses.add(hisOfficeAddress);

		List<H3EmpAddress> hisAddresses = new ArrayList<H3EmpAddress>();
		hisAddresses.add(myOfficeAddress);
		hisAddresses.add(homeAddress);
		hisAddresses.add(hisOfficeAddress);

		List<H3EmpAddress> herAddresses = new ArrayList<H3EmpAddress>();
		hisAddresses.add(myOfficeAddress);

		/* each user has multiple addresses, can be null */
		H3Emp me=new H3Emp();
		//U_id is automatically set
		me.setEmpName("Nitin");
		// List of may addresses
		me.setList(myAdresses);

		H3Emp him=new H3Emp();
		him.setEmpName("Gulgule");
		him.setList(hisAddresses);

		H3Emp her=new H3Emp();
		her.setEmpName("Biloo");
		him.setList(herAddresses);;


		//Asking the HB to persist these objects in DB
		// save() will fire Insert query
		h3EmpRepository.save(me);
		h3EmpRepository.save(him);
		h3EmpRepository.save(her);

		// Retrieving the data - Difference between get and load
		logger.info("----------h3EmpRepository.findById(1)--------------");
		H3Emp h3Emp=h3EmpRepository.findById(1)
				.orElse(null);

		System.out.println(h3Emp);
	}
}