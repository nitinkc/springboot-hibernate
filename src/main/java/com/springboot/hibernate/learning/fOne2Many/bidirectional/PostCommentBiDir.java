package com.springboot.hibernate.learning.fOne2Many.bidirectional;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by nitin on Thursday, January/23/2020 at 12:32 AM
 */
public class PostCommentBiDir {
    @Id
    @GeneratedValue
    private Long id;
    private String review;

    @ManyToOne(fetch = FetchType.LAZY)
    private PostBiDir post;
}
