
package com.springboot.hibernate.learning.d4.hasA.mapping.one2many;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Component;

/* In this example the primary key is not declared to be int
 * String type is set and manually set. It works*/

@Component
//@Order(value = 2)
@ConditionalOnExpression("${T2OTMTester:false}")
public class T2OTMTester implements CommandLineRunner {

	@Autowired
	private M2CellPhoneRepository m2CellPhoneRepository;
	@Autowired
	private M2CellUserRepository m2CellUserRepository;
	@Override
	public void run(String... args) throws Exception {
		M2CellPhone cell1 = new M2CellPhone();
		//Forcing the Primary key
		//cell1.setModelNo("A1B1");
		cell1.setModel("Nexus 5");
		//SET USER AFTER IT HAS BEEN INSTANTIATED

		M2CellPhone cell2 = new M2CellPhone();
		//Forcing the Primary key
		//cell2.setModelNo("A1B2");
		cell2.setModel("Samsung 6");

		M2CellPhone cell3 = new M2CellPhone();
		//Forcing the Primary key
		//cell3.setModelNo("A1B3");
		cell3.setModel("iPhone 4");

		List<M2CellPhone> cellList = new ArrayList<M2CellPhone>();
		cellList.add(cell1);
		cellList.add(cell2);
		cellList.add(cell3);

		M2CellUser user = new M2CellUser();
		user.setUser("nitin");
		user.setCells(cellList);

		//Now set the users
		cell1.setUser(user);
		cell2.setUser(user);
		cell3.setUser(user);

		m2CellPhoneRepository.save(cell1);
		m2CellPhoneRepository.save(cell2);
		m2CellPhoneRepository.save(cell3);
		m2CellUserRepository.save(user);

	}
}

