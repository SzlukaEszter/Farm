package com.codecool.plant;

import java.util.Random;

public class RandomGenerator {
    public static Random random = new Random();

    public static boolean getRandomChanceByPercent(int percent) {
        int chance =  random.nextInt(100);
        return (chance < percent);
    }
}
