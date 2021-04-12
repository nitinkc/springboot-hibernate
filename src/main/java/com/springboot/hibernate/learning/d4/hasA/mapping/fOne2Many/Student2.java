package com.springboot.hibernate.learning.d4.hasA.mapping.fOne2Many;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nichaurasia on Friday, January/17/2020 at 10:44 AM
 */

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="stud_oTm")
public class Student2 {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long stud_id;
    private String name;
    @OneToMany
    @JoinColumn(name = "stud_id")
    private List<Vehicle2> vehicle = new ArrayList<>();

    public Student2(String name, List<Vehicle2> vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }
}