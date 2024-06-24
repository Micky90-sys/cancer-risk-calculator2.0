package com.example.cancer_risk_calculator.service;

import com.example.cancer_risk_calculator.model.UserInput;
import org.springframework.stereotype.Service;

@Service
public class CancerRiskCalculatorService {

    public String calculateRisk(UserInput input) {
        int riskScore = 0;

        if (input.getAge() > 50) riskScore += 2;
        if (input.isSmoker()) riskScore += 3;
        if (input.isDrinker()) riskScore += 2;
        if (!input.getFamilyHistory().equalsIgnoreCase("None")) riskScore += 3;

        if (riskScore > 5) return "High";
        else if (riskScore > 3) return "Medium";
        else return "Low";
    }
}
