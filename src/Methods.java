import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        System.out.println(addition(2, 5));
        System.out.println(addition(2.52, 2.0));
        System.out.println(subtraction(2, 5));
        System.out.println(subtraction(2.2, 5.0));
        System.out.println(multiplication(22, 53));
        System.out.println(multiplication(2.25, 8.32));
        System.out.println(division(2, 5));
        System.out.println(division(2.25, 8.34));
        System.out.println(modulus(2.25, 2.25));
        System.out.println(modulus(2, 5));

        Scanner sc = new Scanner(System.in);
        boolean isValid;
        do {
            System.out.println("Enter an integer from 1-20");
            int userInput = sc.nextInt();
            if((userInput >= 1) & (userInput <= 20)){
                isValid = true;
                long previous = 1L;
                for (int i = 1; i <= userInput; i++){
                    previous = i * previous;
                    if(i == userInput){
                        System.out.println(userInput + "! is " + previous);
                    }
                }
            } else {
                System.out.println("Invalid entry");
                isValid = false;
            }
        } while (!isValid);
    }
    public static int addition(int x, int y){
        return x + y;
    }
    public static double addition(double x, double y){
        return x + y;
    }
    public static int subtraction(int x, int y){
        return x - y;
    }
    public static double subtraction(double x, double y){
        return x - y;
    }
    public static int multiplication(int x, int y){
        return x * y;
    }
    public static double multiplication(double x, double y){
        return x * y;
    }
    public static int division(int x, int y){
        return x / y;
    }
    public static double division(double x, double y){
        return x / y;
    }
    public static int modulus(int x, int y){
        return x % y;
    }
    public static double modulus(double x, double y){
        return x % y;
    }
}
