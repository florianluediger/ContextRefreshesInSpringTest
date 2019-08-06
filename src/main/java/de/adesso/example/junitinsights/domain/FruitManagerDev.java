package de.adesso.example.junitinsights.domain;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class FruitManagerDev implements FruitManager {

    private String currentSeasonalFruit = "Melon";

    public String getCurrentSeasonalFruit() {
        return currentSeasonalFruit;
    }

    public void setCurrentSeasonalFruit(String currentSeasonalFruit) {
        this.currentSeasonalFruit = currentSeasonalFruit;
    }

}
