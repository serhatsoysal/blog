package com.project.blog.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "text")
@Getter
@Setter
public class Text  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 25)
    private Long id;

    @Column(name = "description", length = 1000)
    private String description;

    @ManyToOne
    @JoinColumn(name = "userId", referencedColumnName = "id")
    private Users users;

    @OneToOne
    @JoinColumn(name = "tag", referencedColumnName = "id")
    private Tag tag;

    @OneToOne
    @JoinColumn(name = "commentId", referencedColumnName = "id")
    private Comment comment;

    @Column(name = "createDate", columnDefinition = "TIMESTAMP")
    private Date createDate;

    @Column(name = "updateDate", columnDefinition = "TIMESTAMP")
    private Date updateDate;

    @Column(name = "status", columnDefinition = "boolean default false")
    private boolean status;

}
