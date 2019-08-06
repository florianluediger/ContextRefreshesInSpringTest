package de.adesso.example.junitinsights.dirtiescontext;

import de.adesso.example.junitinsights.domain.FruitManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class FruitManagerTest {

    @Autowired
    FruitManager fruitManager;

    @Test
    @DirtiesContext
    void changeDefaultToBananaTest() {
        Assertions.assertEquals("Apple", fruitManager.getCurrentSeasonalFruit());
        fruitManager.setCurrentSeasonalFruit("Banana");
        Assertions.assertEquals("Banana", fruitManager.getCurrentSeasonalFruit());
    }

    @Test
    @DirtiesContext
    void changeDefaultToMelonTest() {
        Assertions.assertEquals("Apple", fruitManager.getCurrentSeasonalFruit());
        fruitManager.setCurrentSeasonalFruit("Melon");
        Assertions.assertEquals("Melon", fruitManager.getCurrentSeasonalFruit());
    }
}
