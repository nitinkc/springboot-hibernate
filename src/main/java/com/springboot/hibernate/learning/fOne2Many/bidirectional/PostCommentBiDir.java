package com.springboot.hibernate.learning.fOne2Many.bidirectional;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by nitin on Thursday, January/23/2020 at 12:32 AM
 */

@Setter
@Getter
@Entity
@Table(name = "BiDir_PostComments")
public class PostCommentBiDir {
    @Id
    @GeneratedValue
    private Long id;
    private String review;

    @ManyToOne(fetch = FetchType.LAZY)
    private PostBiDir post;
}
