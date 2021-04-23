package Homework;

public class Vehicle extends Scooter {

    public Vehicle(String model, String type, String color, int price) {
        super(model, type, color, price);
    }

    public void ScooterDetails() {

        super.ScooterDetails(color, price);
    }
}
