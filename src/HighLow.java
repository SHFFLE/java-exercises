import java.util.InputMismatchException;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        int random = (int) Math.ceil(Math.random() * 100);
        boolean continueDo = false;
        boolean isValid;
        int guess = -1;
        Scanner sc = new Scanner(System.in);
        do{
            int guesses = 0;
            do{
                do {
                    System.out.println("Enter a number");
                    try{
                        guess = sc.nextInt();
                        isValid = true;
                        if(guess <= 0 || guess > 100){
                            throw new InputMismatchException();
                        }
                    } catch (InputMismatchException e){
                        sc.next();
                        System.err.println("Enter a valid number between 1 and 100");
                        isValid = false;
                    }
                }while(!isValid);
                if(guess > random){
                    System.out.println("LOWER");
                    guesses ++;
                    if(guesses > 15){
                        System.out.println("Too many guesses. You lose.");
                        break;
                    }
                } else if (guess < random){
                    System.out.println("HIGHER");
                    guesses ++;
                    if(guesses > 15){
                        System.out.println("Too many guesses. You lose.");
                        break;
                    }
                } else if (guess == random){
                    guesses ++;
                    System.out.println("GOOD GUESS. It took you " + guesses + " guess(es).");
                }
            }while(guess != random);
        }while(continueDo);
    }
}
