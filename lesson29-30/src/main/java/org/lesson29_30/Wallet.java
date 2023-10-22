package org.lesson29_30;

import org.springframework.stereotype.Service;

@Service
public class Wallet {

    private int count;
    public Wallet() {
        this.count = 1000;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
