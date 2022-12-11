package com.spring.firstapi.api.controllers;


import com.spring.firstapi.api.dto.UserDTO;
import com.spring.firstapi.api.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    @Autowired
    private UserServices service;
    @GetMapping(value = "/{id}")
    public UserDTO getById(@PathVariable Long id){
        return service.getById(id);
    }


}
