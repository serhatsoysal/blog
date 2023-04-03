package com.project.blog.service;

import com.project.blog.controller.UserController;
import com.project.blog.dto.CreateUserResponse;
import com.project.blog.model.*;
import jakarta.transaction.Transactional;
import com.project.blog.dto.CreateUserRequest;
import com.project.blog.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class UsersService {


    private final UsersRepository usersRepository;

    private final CityService cityService;

    private final UserTypeService userTypeService;

    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Transactional
    public CreateUserResponse createUser(CreateUserRequest createUserRequest) {
        City city = cityService.getObjectById(createUserRequest.getCityId());
        UserType userType = userTypeService.getObjectById(createUserRequest.getUserTypeId());

        final Users user = Users.builder()
                .name(createUserRequest.getName())
                .surname(createUserRequest.getSurname())
                .userName(createUserRequest.getUserName())
                .language(createUserRequest.getLanguage())
                .createDate(new Date())
                .city(city)
                .password(createUserRequest.getPassword())
                .email(createUserRequest.getEmail())
                .userType(userType)
                .build();

        final Users createdUser = usersRepository.save(user);

        return CreateUserResponse.builder()
                .id(createdUser.getId())
                .email(user.getEmail())
                .name(user.getName())
                .surname(user.getSurname())
                .userName(user.getUserName())
                .language(user.getLanguage())
                .createDate(user.getCreateDate())
                .email(user.getEmail())
                .city(user.getCity())
                .userType(user.getUserType())
                .build();
    }
}
