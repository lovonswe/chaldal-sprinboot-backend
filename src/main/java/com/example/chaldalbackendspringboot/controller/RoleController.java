package com.example.chaldalbackendspringboot.controller;

import com.example.chaldalbackendspringboot.model.Role;
import com.example.chaldalbackendspringboot.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @PostMapping("/add-new/{role}")
    public ResponseEntity<Role> addNewRole(@PathVariable String role){
       return new ResponseEntity<>(roleService.addNewRole(role), HttpStatus.OK);
    }


}
