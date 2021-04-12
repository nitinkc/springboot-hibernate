package com.springboot.hibernate.learning.compositeKey;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Table;

@Data
@Table(name = "Person_compositeKey")
public class Person1 {
    @EmbeddedId
    private PersonIdentity personCompositePK;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String State;

}
