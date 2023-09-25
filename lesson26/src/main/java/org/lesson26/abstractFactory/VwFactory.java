package org.lesson26.abstractFactory;

public class VwFactory implements CarsFactory{

    @Override
    public Sedan createSedan() {
        return new VwSedan();
    }

    @Override
    public Minivan createMinivan() {
        return new VwMinivan();
    }
}
