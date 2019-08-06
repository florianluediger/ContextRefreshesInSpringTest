package de.adesso.example.junitinsights.web;

import de.adesso.example.junitinsights.domain.FruitManager;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class FruitController {

    private final FruitManager fruitManager;

    public FruitController(FruitManager fruitManager) {
        this.fruitManager = fruitManager;
    }

    @GetMapping("/seasonal")
    public String getSeasonalFruit() {
        return fruitManager.getCurrentSeasonalFruit();
    }

    @PostMapping(path = "/seasonal", consumes = "text/plain", produces = "text/plain")
    public String setSeasonalFruit(@RequestBody String fruit) {
        fruitManager.setCurrentSeasonalFruit(fruit);
        return fruitManager.getCurrentSeasonalFruit();
    }
}
