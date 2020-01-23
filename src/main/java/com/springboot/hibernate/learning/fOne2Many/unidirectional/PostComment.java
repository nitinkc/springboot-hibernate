package com.springboot.hibernate.learning.fOne2Many.unidirectional;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by nitin on Thursday, January/23/2020 at 12:00 AM
 */
@Getter
@Setter
@Entity
@Table(name = "unidirectional_postcomment")
public class PostComment {
    @Id
    @GeneratedValue
    private Long id;
    private String review;

    public PostComment(String review) {
        this.review = review;
    }
}
