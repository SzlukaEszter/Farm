package com.codecool.plant;

import com.codecool.RottenRiporter;

public class Almond extends Plant implements Shroomable {

    private boolean isRotten = false;
    private int minProduction;

    public Almond(RottenRiporter rottenRiporter) {
        super(rottenRiporter);
        monthlyProduction = 50;
        minProduction = 40;
    }

    @Override
    public void shroom() {
        if (RandomGenerator.getRandomChanceByPercent(8)) {
            monthlyProduction += 10;
        }
    }

    @Override
    public void rot() {
        if (RandomGenerator.getRandomChanceByPercent(13)) {
            monthlyProduction -= 18;
            isRotten = true;
        }
    }

    @Override
    public boolean isRotten() {
        return isRotten;
    }
    @Override
    protected void defaultSettingsForProduction(){
        monthlyProduction += 4;
        actualProduction = monthlyProduction;
        isRotten = false;
    }


    public void passMonth() {
        defaultSettingsForProduction();
        shroom();
        rot();
        checkMinProduction();
        checkForRotten();
    }

    private void checkMinProduction(){
        if (monthlyProduction < minProduction) {
            monthlyProduction *= 2;
        }
    }
}
