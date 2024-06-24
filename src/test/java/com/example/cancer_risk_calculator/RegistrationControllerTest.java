package com.example.cancer_risk_calculator;

import com.example.cancer_risk_calculator.controller.RegistrationController;
import com.example.cancer_risk_calculator.model.UserInput;
import com.example.cancer_risk_calculator.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
public class RegistrationControllerTest {

    @Autowired
    private RegistrationController registrationController;

    @MockBean
    private UserService userService;

    private MockMvc mockMvc;

    @Test
    public void testRegisterUser() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(registrationController).build();

        UserInput input = new UserInput();
        input.setAge(25);
        input.setGender("Female");
        input.setSmoker(false);
        input.setDrinker(false);
        input.setFamilyHistory("None");

        when(userService.registerUser(input)).thenReturn("User registered successfully!");

        mockMvc.perform(post("/api/register")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"age\":25,\"gender\":\"Female\",\"smoker\":false,\"drinker\":false,\"familyHistory\":\"None\"}"))
                .andExpect(status().isOk());
    }
}
