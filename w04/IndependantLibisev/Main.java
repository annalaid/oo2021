package IndependantLibisev;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        System.out.println("Sisesta kolm numbrit mille artimeetilist keskmist soovid leida!");
        System.out.println("Esimene number: ");
        int nr1 = input.nextInt();
        System.out.println("Ja teine number: ");
        int nr2 = input.nextInt();
        System.out.println("Ning ka kolmas: ");
        int nr3 = input.nextInt();

        input.close();

		System.out.println("Aritmeetiline keskmine on: " + Average.getAverage(nr1, nr2, nr3));

        List<Integer> movingAverages = Average.getLibisev();
    
        System.out.println("Massiivi libisevad keskmised on: " + movingAverages);
    
        Average.moveIntoFile(movingAverages);
    }
}
