package com.springboot.hibernate.learning.d3.hasA.multTab;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by nichaurasia on Friday, January/17/2020 at 10:30 PM
 */
@Repository
public interface AppleRepository extends JpaRepository<Apple, Integer> {
}
