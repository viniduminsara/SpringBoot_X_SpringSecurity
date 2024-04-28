package com.example.helloSpringBoot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name = "customer")
public class CustomerEntity implements SuperEntity{

    @Id
    private String customerId;
    private String firstName;
    private String lastName;
    private String email;

}
