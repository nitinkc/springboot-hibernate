package com.springboot.hibernate.learning.d4.hasA.mapping.gMany2Many;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nichaurasia on Friday, January/17/2020 at 10:44 AM
 */

@Entity
@Table(name="stud_mTm")
public class Student3 {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long stud_id;
    private String name;
    @ManyToMany
    @JoinTable(name = "vehicle_mTm",
            joinColumns = @JoinColumn(name="stud_id"),
            inverseJoinColumns = @JoinColumn(name = "vId"))
    private List<Vehicle3> vehicles = new ArrayList<>();
}
