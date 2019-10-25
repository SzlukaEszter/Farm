package com.codecool.plant;

import com.codecool.RottenRiporter;

public abstract class EverGreen extends Plant{

    protected int maxProduction;

    protected int monthsPassed;

    EverGreen(RottenRiporter rottenRiporter){
        super(rottenRiporter);
        maxProduction = 70;
        monthsPassed = 0;
    }

    protected void growLeaves(){
        if (monthsPassed % 5 == 0){
            monthlyProduction += 8;
        }
    }

    protected void speak(){
        System.out.println(name + " at full production");
    }

    protected void checkMaxProduction() {
        if (monthlyProduction >= maxProduction) {
            monthlyProduction = maxProduction;
            speak();
        }
    }

}
