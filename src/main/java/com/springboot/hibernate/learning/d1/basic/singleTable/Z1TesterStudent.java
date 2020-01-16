package com.springboot.hibernate.learning.d1.basic.singleTable;

import com.springboot.hibernate.learning.d1.basic.singleTable.entity.Student;
import com.springboot.hibernate.learning.d1.basic.singleTable.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Z1TesterStudent implements CommandLineRunner {

	@Autowired
	private static StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        Student student1=new Student();
        student1.setId(101);
        student1.setName("Nitin");

        Student student2=new Student();
        student2.setId(102);
        student2.setName("Sangram");

        System.err.println("###################################### POST Begins ######################################");
        //studentRepository.save(student1);
        //studentRepository.save(student2);
        System.err.println("###################################### POST Ends ######################################");


        // Fetching the data from the database (BEFORE COMMITTING)
        //Student student=studentRepository.findById(2).get();
        //System.out.println("User name is : "+student.getName());
    }
}
