package org.lesson31.web;

import lombok.RequiredArgsConstructor;
import org.lesson31.domain.Car;
import org.lesson31.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@RequiredArgsConstructor
@Controller
@RequestMapping("/home")
public class HomeController {

    private final CarService carService;
    @GetMapping
    public String homePage() {
        return "home";
    }
    @PostMapping
    public String addCar(Car car) {
        carService.save(car);
        return "home";
    }


}
