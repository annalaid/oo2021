package Homework;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println("Array integerArray contains:");
        Generics.printArray(intArray);   // pass an Integer array

        System.out.println("\nArray doubleArray contains:");
        Generics.printArray(doubleArray);   // pass a Double array

        System.out.println("\nArray characterArray contains:");
        Generics.printArray(charArray);   // pass a Character array

    }

}
