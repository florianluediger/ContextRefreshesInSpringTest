package de.adesso.example.junitinsights.profiles;

import de.adesso.example.junitinsights.domain.FruitManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@ActiveProfiles("dev")
class FruitManagerDevTest {

    @Autowired
    FruitManager fruitManager;

    @Test
    void changeDefaultToBananaTest() {
        Assertions.assertEquals("Melon", fruitManager.getCurrentSeasonalFruit());
    }
}
