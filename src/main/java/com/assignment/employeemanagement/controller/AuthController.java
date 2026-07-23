package com.assignment.employeemanagement.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.assignment.employeemanagement.dto.LoginRequest;
import com.assignment.employeemanagement.dto.RegisterRequest;
import com.assignment.employeemanagement.entity.User;
import com.assignment.employeemanagement.service.UserService;


@RestController
@RequestMapping("/auth")
public class AuthController {


    @Autowired
    private UserService userService;



    @PostMapping("/register")
    public String register(
            @RequestBody RegisterRequest request) {


        User user = new User();

        user.setUsername(request.getUsername());

        user.setEmail(request.getEmail());

        user.setPassword(request.getPassword());

        user.setRole(request.getRole());


        return userService.registerUser(user);
    }



    @PostMapping("/login")
    public String login(
            @RequestBody LoginRequest request) {


        return userService.loginUser(request);
    }

}