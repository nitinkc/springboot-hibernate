package com.springboot.hibernate.learning.d4.hasA.mapping.one2one;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name="c_SSNTable")
public class M1SSNCard {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private int ssn;
	private String issuedBy;
}
