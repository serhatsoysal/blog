package com.project.blog.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public final class CreateUserRequest {

    @NotBlank
    private String name;

    @NotBlank
    private String surname;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String userName;

    @NotBlank
    private String password;

    @NotBlank
    @NotEmpty
    private Integer userTypeId;

    @NotBlank
    private String language;

    @NotBlank
    @NotEmpty
    private Integer cityId;
}
