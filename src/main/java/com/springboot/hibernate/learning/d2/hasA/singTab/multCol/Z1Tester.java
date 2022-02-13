package com.springboot.hibernate.learning.d2.hasA.singTab.multCol;

/**
 * HAS-A Relationship between User class and Address Class
 * One Table for all the classes  
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
//@Order(value = 2)
@ConditionalOnExpression("${multCol:false}")
public class Z1Tester implements CommandLineRunner  {
	@Autowired
	private H2EmpRepository h2EmpRepository;
	@Override
	public void run(String... args) throws Exception {
		/* 3 address that are used in the User Class*/
		H2EmpAddress myOfficeAddress=new H2EmpAddress();
		myOfficeAddress.setZipCode(12345);
		myOfficeAddress.setEmpCity("Fremont");

		H2EmpAddress homeAddress=new H2EmpAddress();
		homeAddress.setZipCode(54321);
		homeAddress.setEmpCity("Chicago");

		H2EmpAddress hisOfficeAddress=new H2EmpAddress();
		hisOfficeAddress.setZipCode(98765);
		hisOfficeAddress.setEmpCity("Seattle");

		/* each user has two addresses, can be null */
		H2Emp user1=new H2Emp();
		//U_id is automatically set
		user1.setEmpName("Roshej");
		user1.setHomeAddress(homeAddress);
		user1.setOfficeAddress(myOfficeAddress);

		H2Emp user2=new H2Emp();
		user2.setEmpName("Gulgule");
		user2.setHomeAddress(homeAddress);
		user2.setOfficeAddress(hisOfficeAddress);

		H2Emp user3=new H2Emp();
		user3.setEmpName("Biloo");
		user3.setHomeAddress(hisOfficeAddress);
		user3.setOfficeAddress(myOfficeAddress);

		//Asking the HB to persist these objects in DB
		// save() will fire Insert query
		h2EmpRepository.save(user1);
		h2EmpRepository.save(user2);
		h2EmpRepository.save(user3);

		// Retrieving the data - Difference between get and load
		//H2Emp h2Emp= h2EmpRepository.findById(1).get();//Id may not be 1, because of the auto generation.
		//System.out.println(h2Emp.getEmpId() + " - " + h2Emp.getEmpName() +" - "+ h2Emp.getOfficeAddress().getEmpCity());

		List<H2Emp> h2EmpList= h2EmpRepository.findAll(Sort.by(Sort.Direction.DESC, "empName"));//Id may not be 1, because of the auto generation.
		h2EmpList.forEach(h2Emp -> {
			System.out.println(h2Emp.getEmpId() + " - " + h2Emp.getEmpName() +" - "+ h2Emp.getOfficeAddress().getEmpCity());
		});
	}
}

