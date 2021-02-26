package Independant;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Sisesta kolm numbrit mille artimeetilist keskmist soovid leida!");
        System.out.println("Esimene number: ");
        double nr1 = input.nextInt();
        System.out.println("Ja teine number: ");
        double nr2 = input.nextInt();
        System.out.println("Ning ka kolmas: ");
        double nr3 = input.nextInt();

        input.close();

        
		System.out.println("Aritmeetiline keskmine on: " + average(nr1, nr2, nr3));
    }

    private static double average(double nr1, double nr2, double nr3){
        return (nr1 + nr2 + nr3) / 3;
    }
}
