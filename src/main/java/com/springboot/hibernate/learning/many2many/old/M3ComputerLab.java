<<<<<<< HEAD:src/main/java/com/springboot/hibernate/learning/many2many/old/M3ComputerLab.java
package com.springboot.hibernate.learning.many2many.old;
=======
package com.springboot.hibernate.learning.d4.hasA.mapping;
>>>>>>> 42ca355de49003e5d26fd9bed64bf5e15a1463a0:src/main/java/com/springboot/hibernate/learning/d4/hasA/mapping/M3ComputerLab.java

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Computer_Lab")
public class M3ComputerLab {
	
	@Id
	@Column(name="Comp_ID")
	private String computerId;
	
	@Column(name="Ip_Address")
	private String networkId;
	
	@ManyToMany(mappedBy="AssignedToComp")
	private List<M3Student> studentAssigned = new ArrayList<M3Student>();

	
	//private List<M3Student> studentAssigned ;
	/* The above declaration does not work FIND WHY*/
	

	// Getters and Setters //

	public List<M3Student> getStudentAssigned() {
		return studentAssigned;
	}

	public void setStudentAssigned(List<M3Student> studentAssigned) {
		this.studentAssigned = studentAssigned;
	}

	public String getComputerId() {
		return computerId;
	}
	
	public void setComputerId(String computerId) {
		this.computerId = computerId;
	}
	public String getNetworkId() {
		return networkId;
	}
	public void setNetworkId(String networkId) {
		this.networkId = networkId;
	}
	
}
