package com.codecool.plant;

public class Spruce extends EverGreen implements Shroomable {

    public Spruce() {
        super();
        actualProduction = 26;
    }

    @Override
    public void shroom() {
        if (RandomGenerator.getRandomChanceByPercent(5)) {
            actualProduction += 15;
        }
    }

    @Override
    public void rot() {
        //TODO: set isRotten to false after month spent, implement RottenRiporter and check
        if (RandomGenerator.getRandomChanceByPercent(4)) {
            actualProduction -= 20;
            isRotten = true;
        }
    }

    @Override
    public void passMonth() {
        //TODO: refactor - extract into multiple methods
        isRotten = false;
        monthsPassed++;
        actualProduction += 4;
        growLeaves();
        shroom();
        rot();
        if (actualProduction >= maxProduction) {
            actualProduction = maxProduction;
            speak();
        }
    }
}
