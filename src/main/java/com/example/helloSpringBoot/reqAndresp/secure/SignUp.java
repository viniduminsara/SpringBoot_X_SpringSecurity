package com.example.helloSpringBoot.reqAndresp.secure;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class SignUp {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String role;

}
