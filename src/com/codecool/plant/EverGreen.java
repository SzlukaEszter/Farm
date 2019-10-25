package com.codecool.plant;

public abstract class EverGreen extends Plant{

    private int maxProduction;

    public abstract void growLeaves();

    public void speak(){
        System.out.println(name + " at max production");
    }
}
