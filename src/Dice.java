import java.util.InputMismatchException;
import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueDo;
        double dieOne = 0;
        double dieTwo = 0;
        do{
            boolean inputIsValid = false;
            do {
                System.out.println("Enter sides on die 1:");
                try {
                    dieOne = sc.nextDouble();
                    if (dieOne <= 0){
                        throw new InputMismatchException();
                    }else if (dieOne == 1){
                        System.out.println("What, are you rolling a ball?");
                        throw new InputMismatchException();
                    }
                    inputIsValid = true;
                } catch (InputMismatchException e){
                    sc.nextLine();
                    System.err.println("Please enter only whole numbers.");
                    inputIsValid = false;
                }
            } while(!inputIsValid);
            do {
                System.out.println("Enter sides on die 2:");
                try {
                    dieTwo = sc.nextDouble();
                    if (dieTwo <= 0){
                        throw new InputMismatchException();
                    }else if (dieTwo == 1){
                        System.out.println("What, are you rolling a ball?");
                        throw new InputMismatchException();
                    }
                    inputIsValid = true;
                } catch (InputMismatchException e){
                    sc.nextLine();
                    System.err.println("Please enter only whole numbers.");
                    inputIsValid = false;
                }
            } while(!inputIsValid);
            System.out.println("Die 1: " + random(dieOne));
            System.out.println("Die 2: " + random(dieTwo));
            System.out.println("Would you like to continue? (y or n)");
            if (sc.next().equalsIgnoreCase("y")) {
                System.out.println("Continuing");
                continueDo = true;
            } else {
                System.out.println("Stopping");
                continueDo = false;
            }
        } while (continueDo);
    }
    public static int random(double max){
        double randomNumber = Math.ceil(Math.random() * max);
        return (int) randomNumber;
    }
}
