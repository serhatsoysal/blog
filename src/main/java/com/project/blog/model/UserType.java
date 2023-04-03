package com.project.blog.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "usertype")
@Data
@NoArgsConstructor
@SuperBuilder
public class UserType extends BaseEntity{

}
