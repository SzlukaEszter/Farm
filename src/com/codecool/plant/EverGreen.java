package com.codecool.plant;

public abstract class EverGreen extends Plant{

    protected int maxProduction = 70;
    protected boolean isRotten = false;
    protected int monthsPassed = 0;

    public void growLeaves(){
        if (monthsPassed % 5 == 0){
            actualProduction += 8;
        }
    }

    public void speak(){
        System.out.println(name + " at full production");
    }

    @Override
    public void passMonth() {
        monthsPassed++;
        actualProduction += 4;
        growLeaves();
        if (actualProduction >= maxProduction){
            actualProduction = maxProduction;
            speak();
        }
    }

}
