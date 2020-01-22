package com.springboot.hibernate.learning.d4.hasA.mapping;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="Mobile_user")
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
	@OneToMany
	@JoinColumn(name="COMMON_ID")
	private List<M2CellPhone> cells;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<M2CellPhone> getCells() {
		return cells;
	}
	public void setCells(List<M2CellPhone> cells) {
		this.cells = cells;
	}
}