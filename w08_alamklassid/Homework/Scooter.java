package Homework;

public abstract class Scooter {
    
    String model;
    String type;
    String color;
    Integer price;

    public Scooter(String model, String type, String color, Integer price) {
        this.model = model;
        this.type = type;
        this.color = color;
        this.price = price;
    }

    public void ScooterDetails(String color2, Integer price2) {
        System.out.println("Andmed:\n" + "Mudel: " + model + "\n Tüüp: " + type + "\n Värv: " + color + "\n Hind: " + price + " EUR");
    }

}
