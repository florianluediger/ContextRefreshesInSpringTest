package de.adesso.example.junitinsights.domain;

import org.springframework.stereotype.Component;

@Component
public interface FruitManager {
    String getCurrentSeasonalFruit();

    void setCurrentSeasonalFruit(String currentSeasonalFruit);
}
