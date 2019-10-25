package com.codecool.plant;

public abstract class Plant {
    protected String name;
    protected int actualProduction = 0;
    protected int monthsPassed = 0;

    public void passMonth()
            // Todo override where needed
    {
        actualProduction += 4;

    }

    public int getActualProduction() {
        return actualProduction;
    }
}
