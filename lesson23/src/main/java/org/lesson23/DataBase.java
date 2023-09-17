package org.lesson23;

import org.lesson23.domain.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

public class DataBase {

    private static List<Car> cars = new ArrayList<>();

    public void createCar(Car car) {
        car.setId(UUID.randomUUID());
        cars.add(car);

    }
    public void deleteCar(UUID id) {

        Optional<Car> first = cars.stream()
                .filter(car -> car.getId().equals(id))
                .findFirst();
        first.ifPresent(car -> cars.remove(car));
    }

    public List<Car> getByBrand(String brandName) {
        if(brandName == null || brandName.isBlank()){
            return cars;
        }
        List<Car> collect = cars.stream().filter(car -> brandName.equals(car.getBrandName()))
                .collect(Collectors.toList());
        return collect;
    }

}
