package org.lesson28;

import java.util.ArrayList;
import java.util.List;

public class Crew extends Thread {
    private String name;
    private Rider rider;
    private Horse horse;

    public static List<Crew> winList = new ArrayList<>();

    public Crew(String name, Rider rider, Horse horse) {
        this.name = name;
        this.rider = rider;
        this.horse = horse;
    }

    @Override
    public void run() {
        int lap;
        System.out.println("Crew " + getCrewName() + " begins race!");
        for (lap = 1; lap <= 5; lap++) {
            try {
                sleep((long) (1000 * Math.random()));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(getCrewName() + " has finished " + lap + " lap!");
        }
        winList.add(this);
        System.out.println("Crew " + getCrewName() + " finished race!");
        Crew crew = Crew.winList.get(0);
        char[] charArray = crew.getCrewName().toCharArray();
        RaceImpl.setWinNumber(Integer.parseInt(String.valueOf(charArray[4])));

    }
    public String getCrewName() {
        return name;
    }

    @Override
    public String toString() {
        return "Crew{" +
                "name='" + name + '\'' +
                ", rider=" + rider +
                ", horse=" + horse +
                '}';
    }
}
