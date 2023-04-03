package com.project.blog.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Entity
@Table(name = "usertype")
@Data
@NoArgsConstructor
@SuperBuilder
public class UserType extends BaseEntity{

}
