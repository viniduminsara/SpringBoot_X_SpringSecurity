package com.example.helloSpringBoot.service;

import com.example.helloSpringBoot.reqAndresp.response.JwtAuthResponse;
import com.example.helloSpringBoot.reqAndresp.secure.SignIn;
import com.example.helloSpringBoot.reqAndresp.secure.SignUp;

public interface AuthenticationService {
    JwtAuthResponse signIn(SignIn signIn);
    JwtAuthResponse signUp(SignUp signUp);
    JwtAuthResponse refreshToken(String accessToken);
}
