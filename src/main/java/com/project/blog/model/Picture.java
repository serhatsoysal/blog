package com.project.blog.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Entity
@Table(name = "picture")
@Data
@NoArgsConstructor
@SuperBuilder
public class Picture extends BaseEntity implements Serializable {

    @Lob
    @Column(name = "imagedata", length = 1000)
    private byte[] imageData;

    @Column(name = "status", columnDefinition = "boolean default false")
    private boolean status;

}
