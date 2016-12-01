package Roshambo;

import utilities.OOValidator;

import java.util.Scanner;

import static Roshambo.Player.ROSHAMBO.*;


public class HumanPlayer extends Player {
    HumanPlayer(){}
    ROSHAMBO generateRoshambo() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < ROSHAMBO.values().length; i++) {
            System.out.println("[" + (i+1) + "] " + ROSHAMBO.values()[i]);
        }
        int input = OOValidator.getIntWithinRange("Enter your choice:", 1, ROSHAMBO.values().length) - 1;
        if(input == 1){
            return ROCK;
        } else if (input == 2){
            return PAPER;
        } else {
            return SCISSORS;
        }
    }

}
