package org.lesson31.exception;

import lombok.Getter;
import lombok.Setter;
import org.lesson31.domain.Car;
@Getter
@Setter
public class EmptyException extends RuntimeException{

    private Car car;

    public EmptyException(Car car) {
        this.car = car;
    }
}
