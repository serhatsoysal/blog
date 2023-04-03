package com.project.blog.dto;

import com.project.blog.model.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Builder
public class CreateUserResponse {

    @NotBlank
    private long id;

    @NotBlank
    private String name;

    @NotBlank
    private String surname;

    @NotBlank
    private Date createDate;

    private Date updateDate;

    @NotBlank
    private String userName;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private boolean status;

    @NotBlank
    private UserType userType;

    //TODO
    @NotBlank
    private boolean firstLogin;

    @NotBlank
    private String language;

    private Picture picture;

    @NotBlank
    private City city;

    private List<Comment> comment;

    private List<Text> text;
}
