public class Main {
    public static void main(String[] args) {
        
        Drink drink = new Drink("Red wine", 10.0, 0.75);
        Bottle bottle = new Bottle(0.7, 0.0, "Wine bottle", drink);
        Bottle noDrinkBottle = new Bottle(0.7, 0.0, "Wine bottle");
        BottleBox firstBox = new BottleBox("Paper box", 2.0, 4.0, 6);
        Barrel firstBarrel = new Barrel(10.0, 100.0, drink);
        Barrel secondBarrel = new Barrel(10, 100, drink);

        noDrinkBottle.addDrink(drink);
        System.out.println("Before any movements made: ");
        System.out.println("\n Drink: " + drink.name);
        System.out.println("\n Bottle mass: " + bottle.bottleWeight());
        System.out.println("\n Drinks net price: " + bottle.bottleSpecialPrice());
        System.out.println("\n Drink amount in barrel: " + firstBarrel.drinkInLiters + " l");

        System.out.println("\n Now we will fill the bottles with the drink!");
        firstBarrel.fillTheBottle(bottle);

        System.out.println("\n When we have filled the bottles: ");
        System.out.println("\n We have " + firstBarrel.barrelToBottles(bottle).size() + " bottles!");
        System.out.println("\n New drink amount in barrel: " + firstBarrel.drinkInLiters);
        System.out.println("\n We have " + firstBox.placesInBox + " places in the box");

        System.out.println("\n Last but not least we will fill the boxes with the bottles!");
        firstBox.boxesWithBottles(secondBarrel, bottle);

        System.out.println("\n We have filled " + firstBox.placesInBox + " places now in the box");
        System.out.println("\n The boxes full mass: " + firstBox.boxMass(bottle));
        System.out.println("\n The box will cost: " + firstBox.boxNetPrice(bottle));
        
    }
}
