package org.lesson28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RaceImpl implements Race {
    private Wallet wallet;
    private final List<Crew> list;
    private Integer betNumber;
    private static Integer winNumber;
    private int bet;
    private String betS = "";
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public RaceImpl(Wallet wallet, List<Crew> list) {
        this.wallet = wallet;
        this.list = list;
    }

    @Override
    public void doBet() {
        System.out.println("Please, enter your bet: ");
            try {
                betS = reader.readLine();
                bet = Integer.parseInt(betS);
            } catch (IOException e) {
                System.out.println("Invalid bet input!");
            }

            System.out.println("Which team number are you betting on?");
            try {
                betNumber = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                System.out.println("Invalid number input!");
            }

        if ((bet > 0) && (bet < wallet.getCount()) && (betNumber >= 1) && (betNumber <= list.size())) {
            wallet.setCount(wallet.getCount() - bet);
        }
    }
    public void showInfo() {
        System.out.println("Your current count is: " + wallet.getCount());
        for (Crew crew : list) {
            System.out.println(crew.getCrewName());
        }
    }

    @Override
    public void startRace() throws InterruptedException {
        showInfo();
        doBet();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
            for (Crew crew : list) {
                Thread thread = new Thread(crew);
                executorService.execute(thread);
            }
            executorService.shutdown();
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
            getResult();
        }

    @Override
    public void getResult() {
        if ((betNumber == null)||(winNumber == null)) {
            System.out.println("error");
        } else if (betNumber == winNumber) {
            wallet.setCount(wallet.getCount() + (bet * 2));
            System.out.println("You win!");
            System.out.println("Your count is: " + wallet.getCount());
        } else {
            System.out.println("You lose!");
            System.out.println("Your count is: " + wallet.getCount());
        }
        betNumber = 0;
    }
    public static void setWinNumber(int winNumber) {
        RaceImpl.winNumber = winNumber;
    }

}
