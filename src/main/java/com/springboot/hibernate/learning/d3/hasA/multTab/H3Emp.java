package com.springboot.hibernate.learning.d3.hasA.multTab;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "bHasAMult")
//DO NOT USE table or desc OR ANY RESERVED KEYWORD. SQL EXCEPTION OCCURS AS RESERVED KEYWORD USED
public class H3Emp {

	@Id
	@Column(name = "Emp")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	@Column(name = "name")
	private String empName;

	/* It's to keep multiple entries, it is better to use a list
	 * This will ensure that proper joining takes place.
	 *
	 * Collection of elements needs a joinTable annotation which should be
	 * customized for the name
	 * */
	@ElementCollection
	@JoinTable(
			name="bUserAddresses" ,
			joinColumns=@JoinColumn(name="empId")
		)
	private List<H3EmpAddress> list = new ArrayList<H3EmpAddress>();

}
