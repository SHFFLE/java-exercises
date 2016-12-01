package utilities;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OOValidator {
    public static int getInt(String prompt){
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        int value;
        try {
            value = sc.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Please enter a valid Integer");
            value = getInt(prompt);
        }
        return value;
    }
    public static int getIntWithinRange(String prompt, int min, int max ){
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        int value;
        try{
            value = sc.nextInt();
            if(value < min || value > max){
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e){
            System.err.println("Please enter a valid Integer between " + min + " and " + max +".");
            value = getIntWithinRange(prompt, min, max);
        }
        return value;
    }
    public static double getDouble(String prompt){
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        double value;
        try {
            value = sc.nextDouble();
        } catch (InputMismatchException e) {
            System.err.println("Please enter a valid Double");
            value = getDouble(prompt);
        }
        return value;
    }
    public static double getDoubleWithinRange(String prompt, double min, double max){
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        double value;
        try{
            value = sc.nextDouble();
            if(value < min || value > max){
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e){
            System.err.println("Please enter a valid double between " + min + " and " + max +".");
            value = getDoubleWithinRange(prompt, min, max);
        }
        return value;
    }
    public static boolean continueDoing(String prompt){
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        String input;
        try{
            input = sc.next();
        } catch (InputMismatchException e){
            System.err.println("Please enter a valid choice.");
            return continueDoing(prompt);
        }
        if (input.equalsIgnoreCase("y")) {
            return true;
        } else if(input.equalsIgnoreCase("n")){
            return false;
        } else {
            return continueDoing(prompt);
        }
    }
    public static void sleep(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static String getString(String prompt){
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        String input;
        try{
            input = sc.next() + sc.nextLine();
            if(input.equalsIgnoreCase("")){
                throw new InputMismatchException();
            } else {
                return input;
            }
        } catch (InputMismatchException e){
            System.err.println("Please enter a valid string.");
            return getString(prompt);
        }
    }
//    public String getRequiredString(String prompt)
//    public String getChoiceString(String prompt, String s1, String s2)
}
