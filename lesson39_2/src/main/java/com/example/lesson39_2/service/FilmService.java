package com.example.lesson39_2.service;

import com.example.lesson39_2.domain.FilmEntity;

import java.util.List;
import java.util.Optional;

public interface FilmService {
    List<FilmEntity> findAll();
    Optional<FilmEntity> findById(Integer id);
    void save (FilmEntity film);

}
