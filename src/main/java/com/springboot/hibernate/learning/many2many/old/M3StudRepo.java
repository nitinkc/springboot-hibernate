package com.springboot.hibernate.learning.many2many.old;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by nichaurasia on Friday, January/17/2020 at 11:34 AM
 */

public interface M3StudRepo extends JpaRepository<M3Student, String> {
}
