package com.project.blog.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Entity
@Table(name = "tag")
@Data
@NoArgsConstructor
@SuperBuilder
public class Tag  extends BaseEntity  implements Serializable {

    @Column(name = "frequency", length = 500)
    private String frequency;
}
