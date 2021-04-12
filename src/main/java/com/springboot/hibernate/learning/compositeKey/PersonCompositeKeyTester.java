package com.springboot.hibernate.learning.compositeKey;

import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
//@Order(value = 2)
@AllArgsConstructor
@ConditionalOnExpression("${compositeKeys:false}")
public class PersonCompositeKeyTester implements CommandLineRunner {

    private final PersonRepository personRepository;

    @Override
    public void run(String... args) throws Exception {
        List<Person1> list = new ArrayList<>();

        Person1 person1 = new Person1();
        person1.setPersonCompositePK(new PersonIdentity("nitin","chaurasia"));
        person1.setCity("Nashville");
        person1.setState("TN");
        personRepository.save(person1);
        //list.add(person1);

        //Second person
        Person1 person2 = new Person1();
        person2.setPersonCompositePK(new PersonIdentity("kirti","chaurasia"));
        person2.setCity("Nashville");
        person2.setState("TN");
        //list.add(person2);
        personRepository.save(person2);

        //personRepository.saveAll(list);
    }
}
