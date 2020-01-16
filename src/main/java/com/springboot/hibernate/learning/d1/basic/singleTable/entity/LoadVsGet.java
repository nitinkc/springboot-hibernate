package com.springboot.hibernate.learning.d1.basic.singleTable.entity;

public class LoadVsGet {

	/**
	 * 1. Load method Throws Exception orgghibernate.ObjectNotFoundException
	 *    if the Id is not found. Get methods returns null
	 * 
	 * 2. Load method returns a Proxy by default and DB won't hit until proxy is first invoked
	 *    while get method hits the DB everytime
	 *    
	 * 3. If sure that the id exists, use Load else use get   */
	public static void main(String[] args) {
		
		/*Plant plant=new Plant();
		plant.setpName("SunFlower");

		
		Plant plant2=(Plant)session.load(Plant.class,1);
		System.out.println("Name of plant : "+plant2.getpName());
		
		session.getTransaction().commit();
		session.close();*/
	}

}
