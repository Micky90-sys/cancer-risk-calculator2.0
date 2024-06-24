package com.example.cancer_risk_calculator.service;

import com.example.cancer_risk_calculator.model.UserInput;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String registerUser(UserInput input) {
        // Simulate user registration logic
        return "User registered successfully!";
    }
}
