package org.lesson26.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsChannel implements Observable{
    List<String> news = new ArrayList<>();
    List<Observer> subscribers = new ArrayList<>();
    public void addNews(String someNews) {
        this.news.add(someNews);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void delObserver(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : subscribers){
            observer.update(this.news);
        }
    }
}
