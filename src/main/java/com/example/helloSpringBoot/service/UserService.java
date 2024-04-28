package com.example.helloSpringBoot.service;

import com.example.helloSpringBoot.dto.UserDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService {
    UserDetailsService userDetailsService();
    void save(UserDTO userDTO);
}
