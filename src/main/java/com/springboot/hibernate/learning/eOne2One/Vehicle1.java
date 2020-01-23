package com.springboot.hibernate.learning.eOne2One;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by nichaurasia on Friday, January/17/2020 at 10:46 AM
 */

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "vehicle_oTo")
public class Vehicle1 {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long vId;
    private String vName;

    public Vehicle1(String vName) {
        this.vName = vName;
    }
}
