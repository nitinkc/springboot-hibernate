<<<<<<< HEAD:src/main/java/com/springboot/hibernate/learning/many2many/old/T3MTMTester.java
package com.springboot.hibernate.learning.many2many.old;

import com.springboot.hibernate.learning.test.City;
import com.springboot.hibernate.learning.test.MyRunner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
=======
package com.springboot.hibernate.learning.d4.hasA.mapping;
>>>>>>> 42ca355de49003e5d26fd9bed64bf5e15a1463a0:src/main/java/com/springboot/hibernate/learning/d4/hasA/mapping/T3MTMTester.java

import java.util.ArrayList;
import java.util.List;

@Component
public class T3MTMTester  implements CommandLineRunner {

	@Autowired
	private M3CompLabRepo compLabRepo;
	@Autowired
	private M3StudRepo studRepo;
	private static final Logger logger = LoggerFactory.getLogger(MyRunner.class);


	@Override
	public void run(String... args) throws Exception {
		/* Both the participating tables has Alphanumeric Primary keys
		 * Thus no @GeneratedValues annotation is used in either table
		 * */

		/* Adding Data into the individual Objects */
		M3ComputerLab lab1 = new M3ComputerLab();
		M3ComputerLab lab2 = new M3ComputerLab();
		M3ComputerLab lab3 = new M3ComputerLab();
		M3ComputerLab lab4 = new M3ComputerLab();
		M3ComputerLab lab5 = new M3ComputerLab();

		M3Student student1 = new M3Student();
		M3Student student2 = new M3Student();
		M3Student student3 = new M3Student();

		lab1.setComputerId("M60Q-4T35");
		lab1.setNetworkId("192.156.243.63");

		lab2.setComputerId("M60Q-4T36");
		lab2.setNetworkId("193.233.234.12");

		lab3.setComputerId("M60Q-4T37");
		lab3.setNetworkId("191.11.114.11");

		lab4.setComputerId("M60Q-4T38");
		lab4.setNetworkId("193.234.56.45");

		lab5.setComputerId("M60Q-4T39");
		lab5.setNetworkId("123.111.114.56");

		student1.setEnrollId("GS123");
		student1.setName("Billoo");

		student2.setEnrollId("GS124");
		student2.setName("Billoo");

		student3.setEnrollId("GS125");
		student3.setName("Billoo");

		List<M3ComputerLab> compLab1 = new ArrayList<M3ComputerLab>();
		List<M3ComputerLab> compLab2 = new ArrayList<M3ComputerLab>();

		compLab1.add(lab1);
		compLab1.add(lab2);
		compLab1.add(lab3);

		compLab2.add(lab4);
		compLab2.add(lab5);

		List<M3Student> stud1 = new ArrayList<M3Student>();
		List<M3Student> stud2 = new ArrayList<M3Student>();

		stud1.add(student1);
		stud1.add(student2);

		stud2.add(student3);
		stud2.add(student2);

		lab1.setStudentAssigned(stud1);
		lab2.setStudentAssigned(stud1);
		lab3.setStudentAssigned(stud1);
		lab4.setStudentAssigned(stud2);
		lab5.setStudentAssigned(stud2);

		student1.setAssignedToComp(compLab2);
		student2.setAssignedToComp(compLab2);
		student3.setAssignedToComp(compLab1);

		studRepo.save(student1);
		studRepo.save(student2);
		studRepo.save(student3);

		compLabRepo.save(lab1);
		compLabRepo.save(lab2);
		compLabRepo.save(lab3);
		compLabRepo.save(lab4);
		compLabRepo.save(lab5);



		logger.info("# of Labs ", compLabRepo.count());
	}
}
