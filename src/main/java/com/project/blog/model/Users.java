package com.project.blog.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;
import java.util.Date;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@SuperBuilder
public class Users  extends BaseEntity  implements Serializable {

    @Column(name = "Surname", length = 60)
    private String surname;

    @Column(name = "createDate", columnDefinition = "TIMESTAMP")
    private Date createDate;
    @Column(name = "updateDate", columnDefinition = "TIMESTAMP")
    private Date updateDate;

    @Column(name = "userName", length = 60)
    private String userName;

    @Column(name = "email", length = 100)
    private String email;

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
    private Picture picture;

    @OneToOne
    @JoinColumn(name = "cityId", referencedColumnName = "id")
    private City city;

    @OneToMany
    @JoinColumn(name = "commentId", referencedColumnName = "id")
    private List<Comment> comment;

    @OneToMany
    @JoinColumn(name = "textId", referencedColumnName = "id")
    private List<Text> text;

}
