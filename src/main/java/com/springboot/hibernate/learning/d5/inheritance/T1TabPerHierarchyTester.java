package com.springboot.hibernate.learning.d5.inheritance;

import com.springboot.hibernate.learning.test.City;
import com.springboot.hibernate.learning.test.MyRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

/* The default strategy is Table Per Hierarchy. 
 * You can achieve this without using Annotation 
 * It Gives a Discriminatory Type as a connecting Column (Basically the names of the Class)
 * 
 * Can use any of the given types to have the feature. Just one Annotation will take care of everything
 *  @Inheritance(strategy = InheritanceType.JOINED)
 *  @Inheritance(strategy = InheritanceType.SINGLE_TABLE)
 *  @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
 *  
 *  With @Table Per Class, have to declare the Primary key in each
 * 
 * the other types can be generated simply by changing
 * */

@Component
public class T1TabPerHierarchyTester implements CommandLineRunner {

	@Autowired
	private FruitsRepository fruitsRepository;
	@Autowired
	private SummerFruitsRepositiory summeFruitsRepositiory;
	@Autowired
	private WinterFruitsRepositiory winterFruitsRepositiory;

	private final Logger logger = LoggerFactory.getLogger(MyRunner.class);

	@Override
	public void run(String... args) throws Exception {
		Fruits fruits = new Fruits();
		SummerFruits summerFruits = new SummerFruits();
		WinterFruits winterFruits = new WinterFruits();

		fruits.setColor("Red");

		summerFruits.setName("Mango");
		summerFruits.setTaste("Sweet");

		winterFruits.setAvailable(true);
		winterFruits.setName("Guava");

		// Creating the basic initialization from another Class
		fruitsRepository.save(fruits);
		summeFruitsRepositiory.save(summerFruits);
		winterFruitsRepositiory.save(winterFruits);

		logger.info("FROM Inheritence");

		logger.info("# of Fruits: {}", fruitsRepository.count());

		logger.info("All Winter Fruits:");
		List<WinterFruits> wf = winterFruitsRepositiory.findAll();
		logger.info("{}", wf);

		logger.info("------------------------");


	}
}