package com.example.chaldalbackendspringboot.auth.model;

import com.example.chaldalbackendspringboot.model.Role;
import com.example.chaldalbackendspringboot.model.User;
import org.springframework.security.core.userdetails.UserDetails;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ChalDalUser  implements UserDetails {


    private String name;
    private String password;
    private List<GrantedAuthority> authorities;

    public ChalDalUser(User user) {
        name=user.getEmail();
        password=user.getPassword();
        authorities = (List<GrantedAuthority>) getAuthorities(user.getRoles());
    }

    private static Collection<GrantedAuthority> getAuthorities(List<Role> roles) {
        List<GrantedAuthority> authorities = new ArrayList<>();
        for (Role role : roles) {
            authorities.add(new SimpleGrantedAuthority("ROLE_" + role.getName()));
        }
        return authorities;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return name;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}