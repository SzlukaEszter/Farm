package com.codecool.plant;

public class Almond extends Plant implements Shroomable {

    private boolean isRotten = false;
    private int minProduction;

    public Almond() {
        super();
        actualProduction = 50;
        minProduction = 40;
    }

    @Override
    public void shroom() {
        if (RandomGenerator.getRandomChanceByPercent(8)) {
            actualProduction += 10;
        }
    }

    @Override
    public void rot() {
        //TODO: set isRotten to false after month spent, implement RottenRiporter and check
        if (RandomGenerator.getRandomChanceByPercent(13)) {
            actualProduction -= 18;
            isRotten = true;
        }
    }

    public void passMonth() {
        //TODO: refactor - extract into multiple methods
        isRotten = false;
        actualProduction += 4;
        shroom();
        rot();
        if (actualProduction < minProduction) {
            actualProduction *= 2;
        }
    }
}
