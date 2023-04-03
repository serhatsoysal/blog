package com.project.blog.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "text")
@Data
@NoArgsConstructor
@SuperBuilder
public class Text  extends BaseEntity  implements Serializable {
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
