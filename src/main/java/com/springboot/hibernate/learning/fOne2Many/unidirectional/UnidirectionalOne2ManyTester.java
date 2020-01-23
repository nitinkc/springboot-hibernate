package com.springboot.hibernate.learning.fOne2Many.unidirectional;

import org.springframework.boot.CommandLineRunner;

/**
 * Created by nitin on Thursday, January/23/2020 at 12:05 AM
 */
public class UnidirectionalOne2ManyTester implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Post post = new Post("First post");

        post.getComments().add(new PostComment("My first review"));
        post.getComments().add(new PostComment("My second review"));
        post.getComments().add(new PostComment("My third review"));
    }
}
