package com.springboot.hibernate.learning.compositeKey;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@EqualsAndHashCode
@AllArgsConstructor
@Getter
@Setter
@Component
public class PersonIdentity implements Serializable {
    @Column(name = "fName")
    private String fName;
    @Column(name = "lName")
    private String lName;
}
