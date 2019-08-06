package de.adesso.example.junitinsights.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("!dev")
public class FruitManagerProd implements FruitManager {

    @Value("${fruit.name:Apple}")
    private String currentSeasonalFruit;

    public String getCurrentSeasonalFruit() {
        return currentSeasonalFruit;
    }

    public void setCurrentSeasonalFruit(String currentSeasonalFruit) {
        this.currentSeasonalFruit = currentSeasonalFruit;
    }

}
