package com.codecool.plant;

import com.codecool.RottenRiporter;

public class Juniper extends EverGreen{

    public Juniper(RottenRiporter rottenRiporter){
        super(rottenRiporter);
        monthlyProduction = 14;
    }

    @Override
    public void passMonth() {
        defaultSettingsForProduction();
        checkMaxProduction();
        checkForRotten();
    }

    @Override protected void defaultSettingsForProduction(){
        monthlyProduction += 4;
        actualProduction = monthlyProduction;
        growLeaves();
    }
}
