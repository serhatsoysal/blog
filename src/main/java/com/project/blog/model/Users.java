package com.project.blog.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
import java.util.Date;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
public class Users implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 25)
    private Integer id;

    @Column(name = "name", length = 60)
    private String name;
    @Column(name = "Surname", length = 60)
    private String surname;

    @Column(name = "createDate", columnDefinition = "TIMESTAMP")
    private Date createDate;
    @Column(name = "updateDate", columnDefinition = "TIMESTAMP")
    private Date updateDate;

    @Column(name = "userName", length = 60)
    private String userName;

    @Column(name = "password", length = 60)
    private String password;

    @Column(name = "status", columnDefinition = "boolean default false")
    private boolean status;

    @OneToOne
    @JoinColumn(name = "userTypeId", referencedColumnName = "id")
    private UserType userType;

    @Column(name = "firstLogin", columnDefinition = "boolean default false")
    private boolean firstLogin;

    @Column(name = "language", length = 60)
    private String language;

    @OneToOne
    @JoinColumn(name = "pictureId", referencedColumnName = "id")
    private Picture pictureId;

    @OneToOne
    @JoinColumn(name = "countryId", referencedColumnName = "id")
    private Country country;


    @OneToMany
    @JoinColumn(name = "commentId", referencedColumnName = "id")
    private List<Comment> comment;

    @OneToMany
    @JoinColumn(name = "textId", referencedColumnName = "id")
    private List<Text> text;

}
