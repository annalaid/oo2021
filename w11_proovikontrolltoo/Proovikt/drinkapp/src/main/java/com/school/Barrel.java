package com.school;

import java.util.ArrayList;
import java.util.List;

public class Barrel {
    double cubage;
    double drinkInLiters;
    Drink drink;

    public Barrel(double cubage, double drinkInLiters, Drink drink){
        this.cubage = cubage;
        this.drinkInLiters = drinkInLiters;
        this.drink = drink;
    }

    public void fillTheBottle(Bottle bottle){
        if(drinkInLiters > bottle.capacity){
            drinkInLiters = drinkInLiters - bottle.capacity;
        } else {
            System.out.println("We are sorry, not enough beverage!");
        }
    }

    /*public int barrelToBottle(Bottle bottle){
        int a = 0;
        while(drinkInLiters >= bottle.capacity){
            a += 1;
            drinkInLiters -= bottle.capacity;
        }
        return a;
    }*/

    //uus õigem variant
    public List<Bottle> barrelToBottles(Bottle bottle){
        List<Bottle> filledBottles = new ArrayList<>();
        if(bottle.drink == null){
            bottle.addDrink(drink);
        }
        while (drinkInLiters >= bottle.capacity) {
            filledBottles.add(bottle);
            drinkInLiters -= bottle.capacity;
        }
        return filledBottles;
    }

    //automaattestid??
}
