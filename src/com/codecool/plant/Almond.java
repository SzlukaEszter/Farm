package com.codecool.plant;

public class Almond extends Plant implements Shroomable{

    private boolean isRotten = false;

    public Almond(){
        super();
        actualProduction = 50;
    }
    @Override
    public void shroom() {
        if (RandomGenerator.getRandomChanceByPercent(8)){
            actualProduction += 10;
        }
    }

    @Override
    public void rot() {
        //TODO: set isRotten to false after month spent, implement RottenRiporter and check
        if (RandomGenerator.getRandomChanceByPercent(13)) {
            actualProduction -=18;
            isRotten = true;
        }
    }

}
