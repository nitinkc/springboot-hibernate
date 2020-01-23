package com.springboot.hibernate.learning.eOne2One;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by nitin on Wednesday, January/22/2020 at 10:38 PM
 */
@Component
public class One2OneTester implements CommandLineRunner {
    @Autowired
    private Student1Repository student1Repository;
    @Autowired
    private Vehicle1Repository vehicle1Repository;

    @Override
    public void run(String... args) throws Exception {
        Vehicle1 v1 = new Vehicle1("Honda CRV");
        Vehicle1 v2 = new Vehicle1("Toyotq RAV2");
        Vehicle1 v3 = new Vehicle1("Nissan SB");
        vehicle1Repository.save(v1);
        vehicle1Repository.save(v2);
        vehicle1Repository.save(v3);

        student1Repository.save(new Student1("Nitin", v1));
        student1Repository.save(new Student1("Kirti", v2));
        student1Repository.save(new Student1("Nidhi", v3));
    }
}
