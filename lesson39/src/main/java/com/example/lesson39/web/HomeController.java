package com.example.lesson39.web;

import com.example.lesson39.domain.FilmEntity;
import com.example.lesson39.repository.FilmRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
@RequiredArgsConstructor
public class HomeController {

    private final FilmRepository repository;

    @GetMapping("/home")
    public String homePage() {
        return "home";
    }

    @PostMapping("/save")
    public String save(FilmEntity film) {
        repository.save(film);

        return "home";
    }

}
