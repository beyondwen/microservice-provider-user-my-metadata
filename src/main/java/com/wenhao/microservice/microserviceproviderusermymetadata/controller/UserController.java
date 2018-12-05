package com.wenhao.microservice.microserviceproviderusermymetadata.controller;


import com.wenhao.microservice.microserviceproviderusermymetadata.dao.UserRepository;
import com.wenhao.microservice.microserviceproviderusermymetadata.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        User user = this.userRepository.findOne(id);
        return user;
    }
}
