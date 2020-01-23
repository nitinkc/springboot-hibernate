package com.springboot.hibernate.learning.eOne2One;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

/**
 * Created by nitin on Wednesday, January/22/2020 at 10:38 PM
 */
public class One2OneTester implements CommandLineRunner {
    @Autowired
    private Student1Repository student1Repository;
    @Autowired
    private Vehicle1Repository vehicle1Repository;

    @Override
    public void run(String... args) throws Exception {
        student1Repository.save(new Student1("Nitin", new Vehicle1("Honda CRV")));
    }
}
