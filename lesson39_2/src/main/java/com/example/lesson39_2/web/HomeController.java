package com.example.lesson39_2.web;

import com.example.lesson39_2.domain.FilmEntity;
import com.example.lesson39_2.service.FilmService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final FilmService service;

    @GetMapping(value = "/home")
    public String homePage() {
        return "home";
    }


    @PostMapping("/save")
    public String save(FilmEntity film) {
        service.save(film);

        return "home";
    }
    @GetMapping("/get")
    public ModelAndView getById (@RequestParam(name = "id", required = false) Integer id) {
        ModelAndView view = new ModelAndView("home");


        if(id == null) {
            view.addObject("films", service.findAll());
        } else {
            service.findById(id)
                    .ifPresent(film -> view.addObject("film", film));
        }

        return view;
    }

}
