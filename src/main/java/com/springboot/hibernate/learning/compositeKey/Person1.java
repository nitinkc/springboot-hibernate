package com.springboot.hibernate.learning.compositeKey;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "Person_compositeKey")
public class Person1 {
    @EmbeddedId
    private PersonIdentity personCompositePK;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String State;
}