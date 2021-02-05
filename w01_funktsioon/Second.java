public class Second {
    public static void name(String[] args) {
       System.out.println(myName()); 
       System.out.println(add(5, 10));
       System.out.println(fullName("Anna-Stiina", "Laidna"));
       System.out.println(checkEqual(5, 5));
       System.out.println(notEqual(4, 4));

    }


    public static String myName(){
        return "Anna-Stiina";
    }

    public statuc int add(int number1, int number2){
        return number1 + number2;
    }

    public static String fullName(String firstName, String lastname){
        return firstName + " " + lastName + " !";
    }

    public static boolean checkEqual(int number1, int number2){
        return number1 = number2;
    }
    
    public static boolean notEqual(int number1, int number2){
        return number1 != number2;
    }

    public static void myMath(){
        System.out.println(Math.pow(5, 2));

        int number = Math.pow(5, 2);
    }

    public static void myLogical() {
        System.out.println();
    }
}