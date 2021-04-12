package com.springboot.hibernate.learning.d4.hasA.mapping.gMany2Many;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nichaurasia on Friday, January/17/2020 at 10:46 AM
 */

@Entity
@Table(name = "vehicle_mTm")
public class Vehicle3 {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long vId;
    private String vehName;
    @ManyToMany(mappedBy = "vehicles")
    private List<Student3> students=new ArrayList<>();

}
