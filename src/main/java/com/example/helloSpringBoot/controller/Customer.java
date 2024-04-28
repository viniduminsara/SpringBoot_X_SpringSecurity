package com.example.helloSpringBoot.controller;

import com.example.helloSpringBoot.dto.CustomerDTO;
import com.example.helloSpringBoot.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customer")
@RequiredArgsConstructor
public class Customer {

    private final CustomerService customerService;

    @GetMapping("/health")
    public String customerHealth(){
        return "Customer Health";
    }

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public void saveCustomer(@RequestBody CustomerDTO customerDTO){
        customerService.saveCustomer(customerDTO);
    }
}
