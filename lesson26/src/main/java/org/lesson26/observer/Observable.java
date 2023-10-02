package org.lesson26.observer;

public interface Observable {
    void addObserver(Observer observer);
    void delObserver(Observer observer);
    void notifyObservers();
}
