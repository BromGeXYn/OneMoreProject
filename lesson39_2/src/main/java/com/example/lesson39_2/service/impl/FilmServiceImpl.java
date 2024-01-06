package com.example.lesson39_2.service.impl;

import com.example.lesson39_2.domain.FilmEntity;
import com.example.lesson39_2.repository.FilmRepository;
import com.example.lesson39_2.service.FilmService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FilmServiceImpl implements FilmService {
    private final FilmRepository repository;
    @Override
    public List<FilmEntity> findAll() {
        return repository.findAll();
    }
    @Override
    public Optional<FilmEntity> findById(Integer id) {

        return repository.findById(id);
    }
    @Override
    public void save(FilmEntity film) {
        repository.save(film);
    }
}
