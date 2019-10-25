package com.codecool;

public class Main {

    public static void main(String[] args) {
        Farm myFarm = new Farm(3);
        int months = 80;
        myFarm.spendMonths(months);
        System.out.println("Total production after " +  months + ": " + myFarm.getTotalProduction());
    }
}
