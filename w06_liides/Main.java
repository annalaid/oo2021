import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        EstonianID est = new EstonianID("49912011513");
        FinnishID fin = new FinnishID("110353-695L");
        Cat cat = new Cat("Loki");
        Dog dog = new Dog("Simba");
        Salad salad = new Salad("Goat cheese");
        Pizza pizza = new Pizza("Sea food");
        Pastry pastry = new Pastry("Almond croissant");


        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);

        ArrayList<Food> foods = new ArrayList<>();
        foods.add(salad);
        foods.add(pizza);
        foods.add(pastry);

        System.out.println("\nEesti ID:");
        System.out.println(est.getGender());
        System.out.println(est.getFullYear());
        System.out.println(est.getDOB());
        System.out.println(est.getAge());

        System.out.println("\nSoome ID:");
        System.out.println(fin.getGender());
        System.out.println(fin.getFullYear());
        System.out.println(fin.getDOB());
        System.out.println(fin.getAge());

        System.out.println("\nAnimals:\n");
        for(Animal i : animals) {
            System.out.println(i.speak());
            i.eat("cereal");
            i.beSneaky();
            i.attack("Alex");
            i.defend();
            i.lookAround();
            System.out.println();
        }

        System.out.println("\nFoods:\n");
        for(Food i : foods) {
            System.out.println(i.name());
            System.out.println(i.contains());
            i.contains();
            i.calories();
            i.nutrition();
            System.out.println();
        }

    }
}
