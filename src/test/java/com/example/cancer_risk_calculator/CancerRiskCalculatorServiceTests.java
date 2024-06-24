package com.example.cancer_risk_calculator;

import com.example.cancer_risk_calculator.model.UserInput;
import com.example.cancer_risk_calculator.service.CancerRiskCalculatorService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CancerRiskCalculatorServiceTests {

    @Test
    public void testCalculateRisk() {
        CancerRiskCalculatorService service = new CancerRiskCalculatorService();

        UserInput input = new UserInput();
        input.setAge(55);
        input.setGender("Male");
        input.setSmoker(true);
        input.setDrinker(true);
        input.setFamilyHistory("None");

        String riskLevel = service.calculateRisk(input);

        assertEquals("High", riskLevel);
    }
}
