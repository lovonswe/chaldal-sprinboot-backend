package com.example.chaldalbackendspringboot.service;

import com.example.chaldalbackendspringboot.dto.UserDetailsDto;
import com.example.chaldalbackendspringboot.model.Address;
import com.example.chaldalbackendspringboot.model.User;
import com.example.chaldalbackendspringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public ResponseEntity<User> addNewUser(@RequestBody UserDetailsDto userDetails) {
        User user = mapUserDetailsDtoToUser(userDetails);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    public User mapUserDetailsDtoToUser(UserDetailsDto userDetails) {
        Address address = new Address();

        User user = new User();
        user.setName(userDetails.getName());
        user.setPhone(userDetails.getPhone());
        user.setEmail(userDetails.getEmail());
        user.setCreatedAt(new Date());

    }
}
