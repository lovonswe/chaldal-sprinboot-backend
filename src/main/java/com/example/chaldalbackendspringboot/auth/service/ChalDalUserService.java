package com.example.chaldalbackendspringboot.auth.service;

import com.example.chaldalbackendspringboot.auth.model.ChalDalUser;
import com.example.chaldalbackendspringboot.model.User;
import com.example.chaldalbackendspringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ChalDalUserService implements UserDetailsService {

    @Autowired
    private UserRepository repository;
    private ChalDalUser chalDalUser;

    @Override
    public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = Optional.ofNullable(repository.findByName(username));
        return user.map(ChalDalUser::new)
                .orElseThrow(() -> new UsernameNotFoundException("user not found " + username));

    }

    public org.springframework.security.core.userdetails.UserDetails loadUserByEmail(String email) {
        Optional<User> user = Optional.ofNullable(repository.findByEmail(email));
        return user.map(ChalDalUser::new)
                .orElseThrow(() -> new UsernameNotFoundException("user not found " + email));
    }
}