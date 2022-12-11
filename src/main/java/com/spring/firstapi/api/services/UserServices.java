package com.spring.firstapi.api.services;

import com.spring.firstapi.api.dto.UserDTO;
import com.spring.firstapi.api.entities.User;
import com.spring.firstapi.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {
    @Autowired
    private UserRepository repository;
    public UserDTO getById(Long id){
        User entity = repository.findById(id).get();
        UserDTO dto = new UserDTO(entity);
        return dto;
    }


}
