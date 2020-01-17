package com.springboot.hibernate.learning.one2many;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nichaurasia on Friday, January/17/2020 at 10:44 AM
 */

@Entity
@Table(name="stud_oTm")
public class Student2 {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long stud_id;
    private String name;
    @OneToMany
    @JoinColumn(name = "stud_id")
    private List<Vehicle2> vehicle = new ArrayList<>();
}
