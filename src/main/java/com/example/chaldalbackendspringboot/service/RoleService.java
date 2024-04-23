package com.example.chaldalbackendspringboot.service;

import com.example.chaldalbackendspringboot.model.Role;
import com.example.chaldalbackendspringboot.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class RoleService {
//    @Autowired
//    private RoleRepository roleRepository;
//
//    public Role addNewRole(String roleName) {
//        Role role = new Role();
//        role.setName(roleName);
//        return roleRepository.save(role);
//    }
//
//    public Role getRoleByName(String roleName){
//        Role role = roleRepository
//                .findByName(roleName)
//                .orElseThrow(NoSuchElementException::new);//()-> new NoSuchEleementException()
//        return role;
//    }
}
