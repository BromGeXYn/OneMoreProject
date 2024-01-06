package com.example.lesson39_2.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "films")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FilmEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String genre;
    private Integer year;
    private Integer rate;

}
