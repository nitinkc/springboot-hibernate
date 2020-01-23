package com.springboot.hibernate.learning.d3.hasA.multTab;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "bApple")
public class Apple {
	@Id
	private int appleId;
	private String appleLocation;
}
