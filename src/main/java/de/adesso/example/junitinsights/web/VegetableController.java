package de.adesso.example.junitinsights.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vegetable")
public class VegetableController {

    @GetMapping("/seasonal")
    public String getSeasonalVegetable() {
        return "Potato";
    }
}
