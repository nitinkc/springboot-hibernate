package com.springboot.hibernate.learning.many2many;

import com.springboot.hibernate.learning.test.City;
import com.springboot.hibernate.learning.test.MyRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nichaurasia on Friday, January/17/2020 at 11:25 AM
 */
@Component
public class m2mTester implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(MyRunner.class);

    @Autowired
    private Stud3Repo stud3Repo;

    @Override
    public void run(String... args) throws Exception {

        //stud3Repo.save(new Student3("Bratislava", new Vehicle3("Tata",new ArrayList<Student3>().add())));


    }
}
