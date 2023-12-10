package com.example.lesson39.repository;

import com.example.lesson39.domain.FilmEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<FilmEntity, Integer> {



}
