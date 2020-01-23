package com.springboot.hibernate.learning.d4.hasA.mapping.one2many;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by nichaurasia on Friday, January/17/2020 at 10:41 PM
 */

@Repository
public interface M2CellPhoneRepository extends JpaRepository<M2CellPhone, Integer> {
}

