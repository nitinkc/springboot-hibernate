package com.springboot.hibernate.learning.d4.hasA.mapping.one2many;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "c_M2CellPhone")
public class M2CellPhone {
	//Testing the String primary Key
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int modelNo;
	private String model;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinTable(name="c_JoinedTable")
	private M2CellUser user;
}
