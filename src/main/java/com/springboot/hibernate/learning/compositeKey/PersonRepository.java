package com.springboot.hibernate.learning.compositeKey;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person1, PersonIdentity> {
}
