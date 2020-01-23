package com.springboot.hibernate.learning.eOne2One;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by nichaurasia on Friday, January/17/2020 at 10:44 AM
 */

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="stud_oTo")
public class Student1 {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long stud_id;
    private String stud_name;
    @OneToOne
    private Vehicle1 vehicle;

    public Student1(String stud_name, Vehicle1 vehicle) {
        this.stud_name=stud_name;
        this.vehicle=vehicle;
    }
}
