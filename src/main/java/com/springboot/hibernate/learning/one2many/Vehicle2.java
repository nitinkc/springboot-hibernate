package com.springboot.hibernate.learning.one2many;

import javax.persistence.*;

/**
 * Created by nichaurasia on Friday, January/17/2020 at 10:46 AM
 */

@Entity
@Table(name = "vehicle_oTm")
public class Vehicle2 {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long vId;
    private String vehName;
    @ManyToOne
    @JoinColumn(name = "stud_id")
    private Student2 student;

}
