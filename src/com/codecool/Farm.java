package com.codecool;

import com.codecool.plant.EverGreen;
import com.codecool.plant.Plant;
import com.codecool.plant.Shroomable;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    private int numberOfPlants;
    private int totalProduction = 0;
    private List<Plant> plants= new ArrayList<>();
    private List<EverGreen> everGreens = new ArrayList<>();
    private List<Shroomable> shroomables = new ArrayList<>();





    public Farm(int numberOfPlants){
        this.numberOfPlants = numberOfPlants;
    }

    public void spendMonths(int months) {
        //TODO logic: set actualProduction of plants, get actualProduction for each month, encrease totalProduction with the value;
    }

    public int getTotalProduction() {
        return totalProduction;
    }

    private void initPlants(){
        //TODO implement factory methods
        for (int i = 0; i < numberOfPlants; i++) {
        }
    }
}
