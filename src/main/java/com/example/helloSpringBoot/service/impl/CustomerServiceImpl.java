package com.example.helloSpringBoot.service.impl;

import com.example.helloSpringBoot.dao.CustomerRepo;
import com.example.helloSpringBoot.dto.CustomerDTO;
import com.example.helloSpringBoot.service.CustomerService;
import com.example.helloSpringBoot.util.Mapping;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepo customerRepo;
    private final Mapping mapping;

    @Override
    public CustomerDTO saveCustomer(CustomerDTO customerDTO) {
        customerDTO.setCustomerId(UUID.randomUUID().toString());
        return mapping.convertToCustomerDTO(customerRepo.save(mapping.convertToCustomerEntity(customerDTO)));
    }

    @Override
    public CustomerDTO getSelectedCustomer(String id) {
        return null;
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return null;
    }

    @Override
    public void deleteCustomer(String id) {

    }

    @Override
    public void updateCustomer(String id, CustomerDTO customerDTO) {

    }
}
