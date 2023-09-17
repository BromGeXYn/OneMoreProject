package org.lesson23.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    private UUID id;
    private String model;
    private String brandName;
    private String color;
    private int year;

}
