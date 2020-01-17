package com.springboot.hibernate.learning.many2many;

import com.springboot.hibernate.learning.test.City;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by nichaurasia on Friday, January/17/2020 at 11:24 AM
 */

public interface Stud3Repo extends JpaRepository<Student3, Long> {
}
