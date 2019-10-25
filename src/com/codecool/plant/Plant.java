package com.codecool.plant;

public abstract class Plant {
    protected String name;
    protected int monthlyProduction = 0;
    protected int actualProduction = 0;
    protected int monthsPassed = 0;

    public void passMonth()
    {
        monthlyProduction += 4;
        actualProduction = monthlyProduction;
    }
}
