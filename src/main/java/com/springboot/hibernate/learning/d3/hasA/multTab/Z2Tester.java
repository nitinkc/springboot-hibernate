/* BUG: CHECK*/
package d3.hasA.multTab;
import java.util.ArrayList;
import java.util.List;

/**
 * HAS-A Relationship between User class and Address Class
 * One Table for all the classes  
 */

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Z2Tester {
	public static void main(String[] args) {
		
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
		me.setList(hisAddresses);
		
		H3Emp him=new H3Emp();
		him.setEmpName("Gulgule");
		him.setList(myAdresses);
		
		H3Emp her=new H3Emp();
		her.setEmpName("Biloo");
		him.setList(herAddresses);;
		
		//loading the hibernate.cfg.xml file details
		SessionFactory sessionFactory = new AnnotationConfiguration()
				.configure().buildSessionFactory();
		
		//create a Session interface ref for all the transaction
		Session session=sessionFactory.openSession();
		
		//Starting the transaction for DB operations
		session.beginTransaction();		
		
		//Asking the HB to persist these objects in DB
		// save() will fire Insert query
		session.save(me);
		session.save(him);
		session.save(her);
		
		session.getTransaction().commit();
		
		// Retrieving the data - Difference between get and load
		H3Emp h3Emp=(H3Emp)session.load(H3Emp.class, 1);
		System.out.println(h3Emp.getEmpName() + " - - "+ h3Emp.getList());
		
		
		session.close();			
	}
}