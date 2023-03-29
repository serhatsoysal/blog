package com.project.blog.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Entity
@Table(name = "country")
@Getter
@Setter
public class Country implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 25)
    private Integer id;

    @Column(name = "name", length = 100)
    private String name;

    @OneToOne
    @JoinColumn(name = "cityId", referencedColumnName = "id")
    private City city;

}

