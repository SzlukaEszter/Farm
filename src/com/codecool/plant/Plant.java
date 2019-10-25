package com.codecool.plant;

import com.codecool.RottenRiporter;

public abstract class Plant {
    protected RottenRiporter rottenRiporter;
    protected String name;
    protected int monthlyProduction;
    protected int actualProduction;

    public Plant(RottenRiporter rottenRiporter){
        this.rottenRiporter = rottenRiporter;
        this.name = "";
        this.monthlyProduction = 0;
    }
    protected void defaultSettingsForProduction(){
        monthlyProduction += 4;
        actualProduction = monthlyProduction;
    }

    protected void checkForRotten(){
        if(rottenRiporter.isThereRottenPlant()) actualProduction = 0;
    }

    public abstract void passMonth();

    public int getActualProduction() {
        return actualProduction;
    }
}
