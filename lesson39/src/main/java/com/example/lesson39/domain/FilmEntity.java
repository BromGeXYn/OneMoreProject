package com.example.lesson39.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "films")
public class FilmEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String genre;
    private Integer year;
    private Integer rate;

}
