package com.example.helloSpringBoot.util;

import com.example.helloSpringBoot.dto.CustomerDTO;
import com.example.helloSpringBoot.dto.UserDTO;
import com.example.helloSpringBoot.entity.CustomerEntity;
import com.example.helloSpringBoot.entity.UserEntity;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class Mapping {

    private final ModelMapper mapper;

    public CustomerDTO convertToCustomerDTO(CustomerEntity customerEntity){
        return mapper.map(customerEntity, CustomerDTO.class);
    }

    public CustomerEntity convertToCustomerEntity(CustomerDTO customerDTO){
        return mapper.map(customerDTO, CustomerEntity.class);
    }

    public List<CustomerDTO> convertToCustomerDTOList(List<CustomerEntity> customerEntities){
        return mapper.map(customerEntities, List.class);
    }

    //UserMapping
    public UserEntity toUserEntity(UserDTO userDTO) {
        return mapper.map(userDTO, UserEntity.class);
    }

    public UserDTO toUserDTO(UserEntity userEntity) {
        return mapper.map(userEntity, UserDTO.class);
    }

}
