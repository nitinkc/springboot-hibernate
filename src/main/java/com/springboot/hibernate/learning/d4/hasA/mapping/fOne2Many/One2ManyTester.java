package com.springboot.hibernate.learning.d4.hasA.mapping.fOne2Many;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nitin on Wednesday, January/22/2020 at 11:01 PM
 */
@Component
//@Order(value = 2)
@ConditionalOnExpression("${One2ManyTester:false}")
public class One2ManyTester implements CommandLineRunner {
    @Autowired
    private Student2Repository student2Repository;
    @Autowired
    private Vehicle2Repository vehicle2Repository;
    @Override
    public void run(String... args) throws Exception {
        Vehicle2 v1 = new Vehicle2("Honda CRV");
        Vehicle2 v2 = new Vehicle2("Toyotq RAV2");
        Vehicle2 v3 = new Vehicle2("Nissan SB");

        List<Vehicle2> list1 = new ArrayList<>();
        list1.add(v1);list1.add(v2);list1.add(v3);

        List<Vehicle2> list2 = new ArrayList<>();
        list2.add(v1);list2.add(v2);

        List<Vehicle2> list3 = new ArrayList<>();
        list3.add(v1);list3.add(v3);

        /* A Student has many Vehicles.
           Thus Student Class has List of Vehicles
         */
        Student2 s1 = new Student2("Nitin", list1);
        Student2 s2 = new Student2("Kirti", list2);

        vehicle2Repository.save(v1);
        vehicle2Repository.save(v2);
        vehicle2Repository.save(v3);

        student2Repository.save(s1);
        student2Repository.save(s2);
    }
}
