package com.example.chaldalbackendspringboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDetailsDto {
    String name;
    String phone;
    String email;
    Date createdAt;
    String country;
    String district;
    String thana;
    String area;
    List<String> roles;
}
