package org.lesson26.abstractFactory;

public class AudiFactory implements CarsFactory{

    @Override
    public Sedan createSedan() {
        return new AudiSedan();
    }

    @Override
    public Minivan createMinivan() {
        return new AudiMinivan();
    }
}
