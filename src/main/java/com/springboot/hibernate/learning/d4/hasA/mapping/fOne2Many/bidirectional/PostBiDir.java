package com.springboot.hibernate.learning.d4.hasA.mapping.fOne2Many.bidirectional;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nitin on Thursday, January/23/2020 at 12:31 AM
 */

@Getter
@Setter
@Entity
@Table(name = "BiDir_Post")
public class PostBiDir {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    @OneToMany(
            mappedBy = "post",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<PostCommentBiDir> comments = new ArrayList<>();

}
