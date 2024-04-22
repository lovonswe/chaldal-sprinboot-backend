package com.example.chaldalbackendspringboot.controller;

import com.example.chaldalbackendspringboot.dto.UserDetailsDto;
import com.example.chaldalbackendspringboot.model.User;
import com.example.chaldalbackendspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> addNewUser(@RequestBody UserDetailsDto userDetailsDto) {
        return new ResponseEntity<>(userService.addNewUser(userDetailsDto), HttpStatus.CREATED);
    }
}
