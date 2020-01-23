package com.springboot.hibernate.learning.d4.hasA.mapping.one2many;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="c_M2MobileUser")
public class M2CellUser {
	
	@Column(name="User_Name")
	private String user;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="User_Id")
	private int id;
/*
	 * The list is One to Many
	 * If join table is not used, then the Column cannot be customized
	 * */
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="c_COMMON_ID")
	private List<M2CellPhone> cells;

}
