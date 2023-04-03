package com.project.blog.model;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Entity
@Table(name = "city")
@NoArgsConstructor
@SuperBuilder
public class City extends BaseEntity {

    @Column(name = "code")
    private String code;

    @ManyToOne
    private Country country;
}