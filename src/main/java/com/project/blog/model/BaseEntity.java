package com.project.blog.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@MappedSuperclass
@Data
@SuperBuilder
@NoArgsConstructor
public abstract class BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 25)
    private Integer id;

    @Column(name = "name", length = 150)
    private String name;

}
