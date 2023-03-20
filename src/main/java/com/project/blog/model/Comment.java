package com.project.blog.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "comment")
@Getter
@Setter
public class Comment  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 25)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "userId", referencedColumnName = "id")
    private Users users;

    @Column(name = "name", length = 10000)
    private String description;

    @Column(name = "createDate", columnDefinition = "TIMESTAMP")
    private Date createDate;

    @Column(name = "createDate", columnDefinition = "TIMESTAMP")
    private Date updateDate;

    @Column(name = "status", columnDefinition = "boolean default false")
    private boolean status;

}
