package com.springboot.hibernate.learning.test;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by nitin on Thursday, January/16/2020 at 2:13 AM
 */
@Repository
public interface CityRepository extends JpaRepository<City, Long> {
}
