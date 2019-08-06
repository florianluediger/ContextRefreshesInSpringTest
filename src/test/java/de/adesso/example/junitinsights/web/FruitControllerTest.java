package de.adesso.example.junitinsights.web;

import de.adesso.example.junitinsights.domain.FruitManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(FruitController.class)
@ExtendWith(SpringExtension.class)
class FruitControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    FruitManager fruitManager;

    @Test
    void getSeasonalFruitTest() throws Exception {
        Mockito.when(fruitManager.getCurrentSeasonalFruit()).thenReturn("Melon");

        String result = mockMvc.perform(get("/seasonal"))
                .andExpect(status().isOk())
                .andReturn()
                .getResponse()
                .getContentAsString();

        Assertions.assertEquals("Melon", result);
    }
}
