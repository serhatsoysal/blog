package com.project.blog.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
@Entity
@Table(name = "country")
@Data
@NoArgsConstructor
@SuperBuilder
public class Country  extends BaseEntity implements Serializable {

    @Column(name = "code")
    private String code;

}

