package com.springboot.hibernate.learning.d4.hasA.mapping.fOne2Many.unidirectional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;

/**
 * Created by nitin on Thursday, January/23/2020 at 12:05 AM
 */
//@Order(value = 2)
@ConditionalOnExpression("${UnidirectionalOne2ManyTester:false}")
public class UnidirectionalOne2ManyTester implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Post post = new Post("First post");

        post.getComments().add(new PostComment("My first review"));
        post.getComments().add(new PostComment("My second review"));
        post.getComments().add(new PostComment("My third review"));
    }
}
