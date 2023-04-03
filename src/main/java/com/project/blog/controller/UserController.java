package com.project.blog.controller;

import com.project.blog.dto.CreateUserRequest;
import com.project.blog.dto.CreateUserResponse;
import com.project.blog.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/user")
@RestController
@RequiredArgsConstructor
public class UserController {

    private final UsersService usersService;

    @PostMapping("/createUser")
    public ResponseEntity<CreateUserResponse> createUser(@RequestBody CreateUserRequest createUserRequest) {
        return ResponseEntity.status(HttpStatus.OK).body(usersService.createUser(createUserRequest));
    }

//    //TODO
//    @PostMapping("/updateUser")
//    public ResponseEntity<Users> updateUser(@RequestBody UpdateUserRequest updateUserRequest) {
//        return ResponseEntity.status(HttpStatus.OK).body(usersService.updateUser(updateUserRequest));
//    }
//
//    //TODO
//    @PutMapping("/updateUserPassword")
//    public ResponseEntity<Users> updatePassword(@RequestBody UpdateUserPasswordRequest updateUserPasswordRequest) {
//        return ResponseEntity.status(HttpStatus.OK).body(usersService.updatePassword());
//    }
//
//    //TODO
//    @GetMapping("/getAllUsers")
//    public ResponseEntity<List<Users>> getUsers() {
//        return ResponseEntity.status(HttpStatus.OK).body(usersService.getAllUsers());
//    }

}
