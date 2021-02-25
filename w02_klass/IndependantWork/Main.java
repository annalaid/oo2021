package IndependantWork;

public class Main {
    public static void main(String[] args) {
        Dessert dessert1 = new Dessert("Cake", DessertType.Cake);

        System.out.println(
            dessert1.name + " " + dessert1.many + " pieces");

        Dessert dessert2 = new Dessert("Candy", DessertType.Candy);

        System.out.println(
            dessert2.name + " " + dessert2.many + " pieces");

            Dessert dessert3 = new Dessert("Donuts", DessertType.Candy);

        System.out.println(
            dessert3.name + " " + dessert3.many + " pieces");

        System.out.println("Cart includes " + dessert1.name + " and " + dessert2.name + " and " + dessert3.name);

        dessert1 = new Dessert("Donuts", DessertType.Cake);
        System.out.println(dessert1.name);
    }
}
