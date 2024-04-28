package com.example.helloSpringBoot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class CustomerDTO {

    private String customerId;
    private String firstName;
    private String lastName;
    private String email;

}
