package com.springboot.hibernate.learning.d4.hasA.mapping.one2one;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by nichaurasia on Friday, January/17/2020 at 10:39 PM
 */
@Repository
public interface M1SSNCardRespository extends JpaRepository<M1SSNCard, Integer> {
}
