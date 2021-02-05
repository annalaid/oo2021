public class First{
    public static void main(String[] args){
        //System.out.println(args.length);
        int[] numberArray = new int[5];
    
        string[] stringArray = new String[5];
        string[] greetingsArray = new String[]{ "Hello", "world", "!" };

        String name = "Anna-Stiina";
        int year = 2021;

        int myInt = Integer.MAX_VALUE;
        long myLong = Long.MAX_VALUE;
        byte myBait = Byte.MIN_VALUE; //127
        short myShort = Short.MAX_VALUE; 
        double myDouble = 3.4;
        float myFloat = 3.4f;
        boolean flag = true; // false
        char character = 'F';


        // fori tsükkel
        for (int i = 0; i < greetingsArray.length; i++){
            System.out.println(greetingsArray[i]);
        }

        // foreach tsükkel
        for (String text : greetingsArray){
            System.out.println(text);
        }

        // while tsükkel
        int length = greetingsArray.length;
        while (length > 0){
            length--;
            System.out.println("Inside while");
        }

        if (year == 2021){
            System.out.println(year + " is equal to 2021"); 
        } else if (year > 2021){
            System.out.println(year + " is larger than 2021");
        } else {
            System.out.println(year + " is not equal or larger than 2021");
        }

        System.out.println("Hello world");
        System.out.println("Test one");
        System.out.println("Test two");
        System.out.print("\n");

        String hello = "Hello world!";
    }
}

// javac First.java
// java First
// java First 1 2 3 4 5 6