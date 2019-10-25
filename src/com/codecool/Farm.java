package com.codecool;

import com.codecool.plant.*;

import java.util.ArrayList;
import java.util.List;

public class Farm implements RottenRiporter {
    private int numberOfPlants;
    private int totalProduction = 0;
    private List<Plant> plants = new ArrayList<>();
    private List<EverGreen> everGreens = new ArrayList<>();
    private List<Shroomable> shroomables = new ArrayList<>();


    public Farm(int numberOfPlants) {
        this.numberOfPlants = numberOfPlants;
        initPlants();
    }

    public void spendMonths(int months) {
        for (int i = 0; i < months; i++) {
            for (Plant plant : plants) {
                plant.passMonth();
                totalProduction += plant.getActualProduction();
            }
        }
    }

    public int getTotalProduction() {
        return totalProduction;
    }

    private void initPlants() {
        for (int i = 0; i < numberOfPlants; i++) {

            Spruce spruce = new Spruce(this);
            Juniper juniper = new Juniper(this);
            Almond almond = new Almond(this);

            plants.add(spruce);
            plants.add(juniper);
            plants.add(almond);
            everGreens.add(spruce);
            everGreens.add(juniper);
            shroomables.add(spruce);
            shroomables.add(almond);
        }
    }

    public boolean isThereRottenPlant() {
        for (Shroomable shroomable : shroomables) {
            if (shroomable.isRotten()) {
                return true;
            }
        }
        return false;
    }
}

