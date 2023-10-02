package org.lesson26.observer;

import java.util.List;

public class Subscriber implements Observer{
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(List<String> news) {
        System.out.println(name + " , we have some news:\n" + news);
    }
}
