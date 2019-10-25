package com.codecool.plant;

import java.util.Random;

public interface Shroomable {

    public void shroom();
    public void rot();

    private boolean getRandomChanceByPercent(int percent) {
        int chance =  new Random().nextInt(100);
        if (chance < percent) return true;
        return false;
    }
}
