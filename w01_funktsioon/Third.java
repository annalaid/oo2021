import java.util.Scanner;

public class Third {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); //saan sisestada liikmed

        System.out.println("Arvutame ruutvõrrandi väärtused!"); 
        
        System.out.println("Sisesta ruutliige:");
        double ruut = input.nextDouble();

        System.out.println("Sisesta lineaarliige:");
        double lineaar = input.nextDouble();

        System.out.println("Sisesta vabaliige:");
        double vaba = input.nextDouble();

        input.close();
        
        //Lahendan ruutvõrrandi

        double lahend3 = Math.pow(lineaar, 2) - (4 * ruut * vaba);

        double lahend1 = (-lineaar + lahend3) / 2 * ruut;

        double lahend2 = (-lineaar - lahend3) / 2 * ruut;

        
        if (ruut == 0) {
            System.out.println("Viga, tegu ei ole ruutvõrrandiga!");
        } else if (0 > lahend3) {
            System.out.println("Ruutvõrrandil puuduvad reaalarvulised lahendid!");
        } else {
            System.out.println("Ruutvõrrandi lahendid on " + lahend1 + " ja " + lahend2);
        }
    
    }
}