package com.springboot.hibernate.learning.fOne2Many.unidirectional;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nitin on Thursday, January/23/2020 at 12:00 AM
 */

@Getter
@Setter
@Entity
@Table(name = "unidir_post")
public class Post {
    @Id
    @GeneratedValue
    private Long id;
    private String title;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    @JoinColumn(name = "post_id")
    ///JoinColumn avoids another table creation
    private List<PostComment> comments = new ArrayList<>();

    public Post(String title) {
        this.title = title;
    }
}