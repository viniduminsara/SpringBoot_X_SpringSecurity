package com.example.helloSpringBoot.dto;

import com.example.helloSpringBoot.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class UserDTO {

    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Role role;

}
