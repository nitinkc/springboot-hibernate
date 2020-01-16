package com.springboot.hibernate.learning.d1.basic.singleTable.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
@Setter
public class H1Address {
	//@Column(name="User_Pincode")
	private int pincode;
	
	//@Column(name="User_City")
	private String city;

}
