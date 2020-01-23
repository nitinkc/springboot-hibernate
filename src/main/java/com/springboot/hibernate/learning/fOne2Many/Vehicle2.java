package com.springboot.hibernate.learning.fOne2Many;

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

    public Vehicle2(String vehName) {
        this.vehName = vehName;
    }
}
