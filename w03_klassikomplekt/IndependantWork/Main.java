package IndependantWork;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fridge samsung = new Fridge("Samsung");
        Fridge lg = new Fridge("LG", "Torpedo");
        Fridge ups = new Fridge("UPS", "Turbo 200");
        Fridge omo = new Fridge("OMO", "Red");

        Storage storage = new Storage();
        storage.addFridge(samsung);
        storage.addFridge(lg);
        storage.addFridge(ups);
        storage.addFridge(omo);

        samsung.setModel("Lite 200");

        System.out.println(storage.toString());

        storage.newModelName("Lite 200", "Lite 600");
        System.out.println(storage);

        storage.removeFridges("Torpedo");
        System.out.println(storage);

        Scanner input = new Scanner(System.in);
        
        System.out.println("Sisesta lause, mida soovid muuta: ");
        String lause = input.nextLine();

        System.out.println(formatInputString(lause));
        input.close();

        /*String lause = "Do you even lift?";*/
    }

    private static String formatInputString(String input) {
        Random rnd = new Random();
        StringBuilder altString = new StringBuilder(input);
        for (int x = 0; x < input.length(); x++) {
            char ch = input.charAt(x);
            if (Character.isLetter(ch)) {
                altString.setCharAt(x, rnd.nextBoolean() ? Character.toLowerCase(ch) : Character.toUpperCase(ch));
            }
        }
        return altString.toString();
    }
}