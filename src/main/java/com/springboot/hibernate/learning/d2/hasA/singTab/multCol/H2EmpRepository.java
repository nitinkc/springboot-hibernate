package com.springboot.hibernate.learning.d2.hasA.singTab.multCol;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by nichaurasia on Friday, January/17/2020 at 10:21 PM
 */
@Repository
public interface H2EmpRepository extends JpaRepository<H2Emp, Integer> {
}
