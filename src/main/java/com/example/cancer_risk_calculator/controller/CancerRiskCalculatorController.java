package com.example.cancer_risk_calculator.controller;

import com.example.cancer_risk_calculator.model.UserInput;
import com.example.cancer_risk_calculator.service.CancerRiskCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calculate")
public class CancerRiskCalculatorController {

    @Autowired
    private CancerRiskCalculatorService service;

    @PostMapping
    public String calculateRisk(@RequestBody UserInput input) {
        return service.calculateRisk(input);
    }
}
