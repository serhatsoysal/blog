package com.project.blog.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

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