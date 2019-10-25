package com.codecool.plant;

import com.codecool.RottenRiporter;

public class Spruce extends EverGreen implements Shroomable {
    protected boolean isRotten;

    public Spruce(RottenRiporter rottenRiporter) {
        super(rottenRiporter);
        monthlyProduction = 26;
        isRotten = false;
    }

    @Override
    public void shroom() {
        if (RandomGenerator.getRandomChanceByPercent(5)) {
            monthlyProduction += 15;
        }
    }

    @Override
    public void rot() {
        //TODO: set isRotten to false after month spent, implement RottenRiporter and check
        if (RandomGenerator.getRandomChanceByPercent(4)) {
            monthlyProduction -= 20;
            isRotten = true;
        }
    }

    @Override
    public boolean isRotten() {
        return isRotten;
    }

    @Override protected void defaultSettingsForProduction(){
        monthlyProduction += 4;
        actualProduction = monthlyProduction;
        isRotten = false;
        growLeaves();
    }

    @Override
    public void passMonth() {
        //TODO: refactor - extract into multiple methods
        defaultSettingsForProduction();
        shroom();
        rot();
        checkMaxProduction();
        checkForRotten();
    }


}
