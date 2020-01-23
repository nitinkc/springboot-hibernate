package com.springboot.hibernate.learning.d2.hasA.singTab.multCol;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Getter
@Setter
@Embeddable
public class H2EmpAddress {
	
	/* Exception in thread "main" org.hibernate.MappingException: 
	 * Repeated column in mapping for entity: d2.hasA.singTab.multCol.H2Emp 
	 * column: empCity (should be mapped with insert="false" update="false")*/
	@Column(name="ZipCode")
	private int zipCode;
	
	@Column(name="empCity")
	private String empCity;
}
