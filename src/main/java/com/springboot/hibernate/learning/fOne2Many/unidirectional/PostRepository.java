package com.springboot.hibernate.learning.fOne2Many.unidirectional;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by nitinon Thursday, January/23/2020 at 12:05 AM
 */
public interface PostRepository extends JpaRepository<Post,Long> {
}
