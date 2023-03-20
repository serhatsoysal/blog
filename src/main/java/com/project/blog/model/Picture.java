package com.project.blog.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "picture")
@Getter
@Setter
public class Picture  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 25)
    private Integer id;

    @Lob
    @Column(name = "imagedata", length = 1000)
    private byte[] imageData;

    @Column(name = "status", columnDefinition = "boolean default false")
    private boolean status;

}
