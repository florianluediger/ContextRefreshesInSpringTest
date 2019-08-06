package de.adesso.example.junitinsights.web;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(VegetableController.class)
@ExtendWith(SpringExtension.class)
class VegetableControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void getSeasonalVegetableTest() throws Exception {

        String result = mockMvc.perform(get("/vegetable/seasonal"))
                .andExpect(status().isOk())
                .andReturn()
                .getResponse()
                .getContentAsString();

        Assertions.assertEquals("Potato", result);
    }
}
