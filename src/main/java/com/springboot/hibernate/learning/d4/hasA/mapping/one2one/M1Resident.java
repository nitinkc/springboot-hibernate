package com.springboot.hibernate.learning.d4.hasA.mapping.one2one;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="cResident")
public class M1Resident {
	
	private String name;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int resId;
	
	@OneToOne
	@JoinColumn(name="mySSN")
	private M1SSNCard ssn;
}
