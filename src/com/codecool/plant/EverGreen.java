package com.codecool.plant;

public abstract class EverGreen extends Plant{

    protected int maxProduction = 70;
    protected boolean isRotten = false;

    public void growLeaves(){
        actualProduction += 8;
    }

    public void speak(){
        System.out.println(name + " at full production");
    }

    @Override
    public void passMonth() {
        monthsPassed++;
        actualProduction += 4;

        if (monthsPassed % 5 == 0){
            growLeaves();
        }
        if (actualProduction >= maxProduction){
            actualProduction = maxProduction;
            speak();
        }
    }

}
