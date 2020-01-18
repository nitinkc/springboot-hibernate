<<<<<<< HEAD:src/main/java/com/springboot/hibernate/learning/many2many/old/M3Student.java
package com.springboot.hibernate.learning.many2many.old;
=======
package com.springboot.hibernate.learning.d4.hasA.mapping;
>>>>>>> 42ca355de49003e5d26fd9bed64bf5e15a1463a0:src/main/java/com/springboot/hibernate/learning/d4/hasA/mapping/M3Student.java
/*
 * If Only @ManyToMany Annotation is used, there will be multiple tables with the 
 * redundant data consisting foreign keys.
 * 
 * A Solution to this is to use a @JoinTable Annotation with .
 * */
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Student_Lab")
public class M3Student {
	
	@Id
	@Column(name="Enrollment_No")
	private String enrollId;
	
	@Column(name="Name")
	private String name;
	
	@ManyToMany
	//@Column(name="Assigned_Computer")
	@JoinTable(
			name="Joined_Table",
			// Name in the Student table (Current Table)
			joinColumns=@JoinColumn(name="ENROLL_NO",nullable=true),
			//Name in the Other Table (Entity)
			inverseJoinColumns=@JoinColumn(name="COMP_ID",nullable=true)
		  )
	private List<M3ComputerLab> AssignedToComp = new ArrayList<M3ComputerLab>();
	//private List<M3ComputerLab> AssignedToComp;
	/* THE ABOVE DECLARATION DOES NOT WORK. FIND OUT WHY */
	
	// Getters and Setters //
	public String getEnrollId() {
		return enrollId;
	}
	public void setEnrollId(String enrollId) {
		this.enrollId = enrollId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<M3ComputerLab> getAssignedToComp() {
		return AssignedToComp;
	}
	public void setAssignedToComp(List<M3ComputerLab> assignedToComp) {
		AssignedToComp = assignedToComp;
	}
}
