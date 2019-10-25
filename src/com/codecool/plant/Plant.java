package com.codecool.plant;

public abstract class Plant {
    protected String name;
    protected int monthlyProduction;
    protected int actualProduction;
    protected int monthsPassed;

    public abstract void passMonth();
       // sets production Values

}
