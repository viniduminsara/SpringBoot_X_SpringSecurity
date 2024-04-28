package com.example.helloSpringBoot.service.impl;

import com.example.helloSpringBoot.dao.UserRepo;
import com.example.helloSpringBoot.dto.UserDTO;
import com.example.helloSpringBoot.service.UserService;
import com.example.helloSpringBoot.util.Mapping;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;
    private final Mapping map;

    @Override
    public UserDetailsService userDetailsService() {
        return username ->
                userRepo.findByEmail(username)
                        .orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }

    @Override
    public void save(UserDTO userDTO) {
        map.toUserDTO(userRepo.save(map.toUserEntity(userDTO)));
    }
}
