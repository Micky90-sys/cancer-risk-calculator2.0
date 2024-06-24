package com.example.cancer_risk_calculator.controller;

import com.example.cancer_risk_calculator.model.UserInput;
import com.example.cancer_risk_calculator.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/register")
public class RegistrationController {

    @Autowired
    private UserService userService;

    @PostMapping
    public String registerUser(@RequestBody UserInput input) {
        return userService.registerUser(input);
    }
}
