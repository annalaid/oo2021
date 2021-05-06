public class Bottle{
    double capacity;
    double container;
    double mass;
    String bottleType;
    Drink drink;


    public Bottle(double capacity, double container, String bottleType, Drink drink){
        this.capacity = capacity;
        this.container = container;
        this.bottleType = bottleType;
        this.drink = drink;
        this.mass = bottleWeight();
    }

    public Bottle(double capacity, double container, String bottleType){
        this.capacity = capacity;
        this.container = container;
        this.bottleType = bottleType;
        this.mass = bottleWeight();
    }

    public Drink getDrink(){
        return drink;
    }

    public double bottleWeight(){
        double mass = capacity * 0.5;
        if(drink != null){
            mass += (capacity * drink.specialWeight);
        }
        return mass;
    }

    public double bottleSpecialPrice(){
        double netCost = container;
        if(drink != null){
            netCost = (drink.literNetCost * (capacity / 1000)) + container;
        }
        return netCost;
    }

    public void addDrink(Drink drink) {
        this.drink = drink;
    }

    //automaattestid??
}