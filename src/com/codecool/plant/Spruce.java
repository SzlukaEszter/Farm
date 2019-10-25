package com.codecool.plant;

public class Spruce extends EverGreen implements Shroomable{

    public Spruce(){
        super();
        monthlyProduction = 26;
    }

    @Override
    public void shroom() {
        if (RandomGenerator.getRandomChanceByPercent(5)){
            monthlyProduction += 15;
        }
    }

    @Override
    public void rot() {
        //TODO: set isRotten to false after month spent, implement RottenRiporter and check
        if (RandomGenerator.getRandomChanceByPercent(4)) {
            monthlyProduction -=20;
            isRotten = true;
        }
    }
}
