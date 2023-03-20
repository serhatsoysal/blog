package com.project.blog.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "tag")
@Getter
@Setter
public class Tag  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 25)
    private Integer id;

    @Column(name = "name", length = 60)
    private String name;

    @Column(name = "frequency", length = 500)
    private String frequency;

}
