import java.util.Scanner;
import java.util.stream.IntStream;

public class StreamArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //küsin kasutaja inputi
        System.out.println("Sisesta massiivi suurus: ");
        int arraySize = scanner.nextInt();
        int newArray[] = new int[arraySize];

        for(int j = 0; j < newArray.length; j++){
            System.out.println("Sisesta number ");
            newArray[j] = scanner.nextInt();
        }

        System.out.println("Numbrid, mis endaga kokku liites ei jagu kolmega: ");
        
        IntStream.of(newArray)
            .map(e -> e + e)
            .filter(e -> e % 3 != 0)
            .forEach(e -> System.out.print("" + e + " / "));

        scanner.close();
    }

}