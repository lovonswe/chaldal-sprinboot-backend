package com.example.chaldalbackendspringboot.service;

import com.example.chaldalbackendspringboot.auth.config.SecurityConfig;
import com.example.chaldalbackendspringboot.dto.UserDetailsDto;
import com.example.chaldalbackendspringboot.model.Address;
import com.example.chaldalbackendspringboot.model.User;
import com.example.chaldalbackendspringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private SecurityConfig securityConfig;

    public ResponseEntity<User> addNewUser(@RequestBody UserDetailsDto userDetails) {
        User user = mapUserDetailsDtoToUser(userDetails);
        user.setPassword(securityConfig.passwordEncoder().encode(user.getPassword()));
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    public User mapUserDetailsDtoToUser(UserDetailsDto userDetails) {
        Address address = new Address();

        User user = new User();

        return user;

    }
//    @Autowired
//    private UserRepository userRepository;
//    @Autowired
//    private RoleService roleService;
//
//    public User addNewUser(@RequestBody UserDetailsDto userDetails) {
//        User user = mapUserDetailsDtoToUser(userDetails);
//        return userRepository.save(user);
//    }
//
//    public User mapUserDetailsDtoToUser(UserDetailsDto userDetails) {
//        Address address = new Address();
//        address.setCountry(userDetails.getCountry());
//        address.setDistrict(userDetails.getDistrict());
//        address.setThana(userDetails.getThana());
//        address.setArea(userDetails.getArea());
//
//        List<Role> roles = userDetails.getRoles().stream().map(
//                (roleName)->{
//                    Role role = roleService.getRoleByName(roleName);
//                    if (role == null) {
//                        // If role doesn't exist, create a new one
//                        role = new Role();
//                        role.setName(roleName);
//                    }
//                    return role;
//
//                    // if u directly return roleService.getRoleByName(roleName) then duplicate entries are being created in role table
//                }
//        ).toList();
//
//        User user = new User();
//        user.setName(userDetails.getName());
//        user.setPhone(userDetails.getPhone());
//        user.setEmail(userDetails.getEmail());
//        user.setCreatedAt(new Date());
////        user.setAddress(address);
////        user.setRoles(roles);
//
//        return user;
//    }
}
