package com.school;

import java.util.List;

public class BottleBox {
    String boxType;
    double boxPrice;
    double boxWeight;
    int placesInBox;

    public BottleBox(String boxType, double boxPrice, double boxWeight, int placesInBox){
        this.boxType = boxType;
        this.boxPrice = boxPrice;
        this.boxWeight = boxWeight;
        this.placesInBox = placesInBox;
    }

    public int boxesWithBottles(Barrel barrel, Bottle bottle){
        List<Bottle> filledBottles = barrel.barrelToBottles(bottle);
        return placesInBox / filledBottles.size();
    }

    public double boxMass(Bottle bottle){
        double boxWeight = this.boxWeight + (placesInBox * bottle.bottleWeight());
    
        return boxWeight;
    }

    public double boxNetPrice(Bottle bottle){
        double boxPrice = this.boxPrice + (placesInBox * bottle.bottleSpecialPrice());

        return boxPrice;
    }

    //automaattestid??

}
