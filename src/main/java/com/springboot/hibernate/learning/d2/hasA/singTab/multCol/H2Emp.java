package com.springboot.hibernate.learning.d2.hasA.singTab.multCol;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "aHasASingle")
//DO NOT USE table or desc OR ANY RESERVED KEYEORD. SQL EXCEPTION OCCURS AS RESERVED KEYWORD USED
public class H2Emp {

	@Id
	@Column(name = "Emp")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;

	//@Column(name="city")
	private String empName;

	/* Exception in thread "main" org.hibernate.MappingException:
	 * Repeated column in mapping for entity: d2.hasA.singTab.multCol.H2Emp
	 * column: empCity (should be mapped with insert="false" update="false")*/
	@Embedded
	@AttributeOverrides({
			@AttributeOverride(name = "zipCode", column = @Column(name = "Office_Pincode")),
			@AttributeOverride(name = "empCity", column = @Column(name = "Office_City"))
	})
	private H2EmpAddress homeAddress;

	@Embedded
	@AttributeOverrides({
			@AttributeOverride(name = "zipCode", column = @Column(name = "Home_Pincode")),
			@AttributeOverride(name = "empCity", column = @Column(name = "Home_City"))
	})
	private H2EmpAddress officeAddress;
}
