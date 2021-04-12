package com.springboot.hibernate.learning.compositeKey.IdClass;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "Person_compositeKey")
public class Person2 {

    @Column(name = "FName")
    private String fName;

    @Column(name = "LName")
    private String lName;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private Character State;

}
