package com.springboot.hibernate.learning.d1.basic.singleTable.repository;

import com.springboot.hibernate.learning.d1.basic.singleTable.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by nitin on Thursday, January/16/2020 at 12:52 AM
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer > {
}
