package org.lesson31.service.impl;

import org.lesson31.domain.Car;
import org.lesson31.exception.EmptyException;
import org.lesson31.service.CarService;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService {
    @Override
    public void getCar() {

    }

    @Override
    public void save(Car car) {
        String brand = car.getBrand();
        String model = car.getModel();

        if (brand == null || brand.isBlank()) {
            throw new EmptyException(car);
        }
        if (model == null || model.isBlank()) {
            throw new EmptyException(car);
        }
        System.out.println("Save car");
    }
}
