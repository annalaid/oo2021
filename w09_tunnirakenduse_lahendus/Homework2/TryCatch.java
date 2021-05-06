import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kalkulaator jagamiseks:");
        System.out.println("Sisesta jagatav: ");
        int firstNumber = input.nextInt();
        System.out.println("Sisesta jagaja: ");
        int secondNumber = input.nextInt();     
            
            try {
                int division = firstNumber / secondNumber;
                System.out.println("Vastus: " + division);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                System.out.println("Jagamine pole võimalik!");
            }

            System.out.println("Protsess läbi!");

        input.close();
    }
}