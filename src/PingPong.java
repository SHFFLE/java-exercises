import java.util.InputMismatchException;
import java.util.Scanner;

public class PingPong {
    public static void main(String[] args) {
        int playerScore = 0;
        int cpuScore = 0;
        Taunts taunt = new Taunts();
        taunt.start();
        boolean previousScore = false;
        do{
            if(!previousScore) {
                sleep(1000);
                if(playerHit()){
                    sleep(1000);
                    if(!cpuHit()){
                        playerScore++;
                        previousScore = false;
                    };
                } else{
                    cpuScore ++;
                    previousScore = true;
                }
            } else {
                sleep(1000);
                if(cpuHit()){
                    sleep(1000);
                    if(!playerHit()){
                        cpuScore ++;
                        previousScore = true;
                    };
                } else {
                    playerScore ++;
                    previousScore = false;
                }
            }
            sleep(1000);
            System.out.println("Player Score: " + playerScore + " || CPU Score: " + cpuScore);
        } while((playerScore < 15) & (cpuScore < 15));
        sleep(1000);
        if(playerScore >= 15){
            System.out.println("YOU WIN!");
        } else if (cpuScore >= 15){
            System.err.println("YOU LOSE!");
        }
    }
    public static String randomSide(){
        int randomNumber = (int) Math.floor(Math.random()*2);
        if(randomNumber == 0){
            return "L";
        } else{
            return "R";
        }
    }
    public static boolean randomCPU(){
        double randomNumber = Math.random();
        if(randomNumber < 0.45){
            return true;
        } else {
            return false;
        }
    }
    public static void sleep(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static boolean playerHit(){
        boolean isValid;
        Scanner sc = new Scanner(System.in);
        String playerChoice = "";
        do {
            System.out.println("Which side do you want to hit? L or R?");
            try {
                playerChoice = sc.next();
                sc.nextLine();
                isValid = true;
                if (!playerChoice.equalsIgnoreCase("l") && !playerChoice.equalsIgnoreCase("r")) {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.err.println("Please enter a valid side.");
                isValid = false;
            }
        } while (!isValid);
        String random = randomSide();
        if (playerChoice.equalsIgnoreCase(random)) {
            System.out.println("You hit!");
            sleep(1000);
            return true;
        } else {
            System.err.println("You missed!");
            sleep(1000);
            return false;
        }
    }
    public static boolean cpuHit(){
        if (randomCPU()) {
            System.out.println("CPU hits!");
            return true;
        } else {
            System.err.println("CPU missed!");
            return false;
        }
    }
}
