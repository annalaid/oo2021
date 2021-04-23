import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        TTT game = new TTT();
        game.initializeBoard();
        
        System.out.println("Trips-Traps-Trull!");
        do
        {
            System.out.println("Mängulaud:");
            game.printBoard();
            int row;
            int column;
            do
            {
                System.out.println("Mängija " + game.getCurrentPlayerMark() + ", sisesta tühi rida ja veerg, kuhu soovid oma nupu asetada!");
                row = scanner.nextInt()-1;
                column = scanner.nextInt()-1;
            }
            while (!game.placeMark(row, column));
            game.changePlayer();
        }
        while(!game.checkForWin() && !game.isBoardFull());
        if (game.isBoardFull() && !game.checkForWin()) {
            System.out.println("Jäite viiki!");
        } else {
            System.out.println("Mängulaud:");
            game.printBoard();
            game.changePlayer();
            System.out.println(Character.toUpperCase(game.getCurrentPlayerMark()) + " Võidab!");
        }
        scanner.close();
    }
}
