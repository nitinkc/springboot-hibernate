package com.springboot.hibernate.learning.d5.inheritance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by nichaurasia on Friday, January/17/2020 at 10:48 PM
 */
@Repository
public interface WinterFruitsRepositiory extends JpaRepository<WinterFruits, Integer> {
}
