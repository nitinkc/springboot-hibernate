package com.springboot.hibernate.learning.d4.hasA.mapping.one2one;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by nichaurasia on Friday, January/17/2020 at 10:38 PM
 */
@Repository
public interface M1ResidentRepository extends JpaRepository<M1Resident, Integer> {
}
