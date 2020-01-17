package com.springboot.hibernate.learning.one2one;

import javax.persistence.*;

/**
 * Created by nichaurasia on Friday, January/17/2020 at 10:44 AM
 */

@Entity
@Table(name="stud_oTo")
public class Student1 {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long stud_id;
    @OneToOne
    private Vehicle1 vehicle;
}
