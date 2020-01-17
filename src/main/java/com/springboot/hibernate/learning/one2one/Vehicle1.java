package com.springboot.hibernate.learning.one2one;

import javax.persistence.*;

/**
 * Created by nichaurasia on Friday, January/17/2020 at 10:46 AM
 */

@Entity
@Table(name = "vehicle_oTo")
public class Vehicle1 {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long vId;

}
