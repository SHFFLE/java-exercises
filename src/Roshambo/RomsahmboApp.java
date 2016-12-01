package Roshambo;

import utilities.OOValidator;

public class RomsahmboApp {
    public static String[] optionsArray = {"Rock Player", "Computer Player", "Human Player"};
    public static void main(String[] args) {
        listOptions();
        int playerOne = OOValidator.getIntWithinRange("Pick player one: ", 1, (optionsArray.length + 1)) - 1;
        listOptions();
        int playerTwo = OOValidator.getIntWithinRange("Pick player two: ", 1, (optionsArray.length + 1)) - 1;
        Player readyPlayerOne = turnPlayerIntIntoPlayer(playerOne);
        Player readyPlayerTwo = turnPlayerIntIntoPlayer(playerTwo);
        do{
            getResults(readyPlayerOne, readyPlayerTwo);
        }while(OOValidator.continueDoing("Do you wish to continue?"));
    }

    private static void getResults(Player readyPlayerOne, Player readyPlayerTwo) {
        Player.ROSHAMBO playerOneChoice = readyPlayerOne.generateRoshambo();
        Player.ROSHAMBO playerTwoChoice = readyPlayerTwo.generateRoshambo();
        System.out.println("Player one chose: " + playerOneChoice);
        System.out.println("Player two chose: " + playerTwoChoice);
        switch (playerOneChoice) {
            case ROCK:
                switch (playerTwoChoice){
                    case ROCK:
                        System.out.println("It's a tie!");
                        break;
                    case PAPER:
                        System.out.println("Player two wins!");
                        break;
                    case SCISSORS:
                        System.out.println("Player one wins!");
                        break;
                }
                break;
            case PAPER:
                switch (playerTwoChoice){
                    case ROCK:
                        System.out.println("Player one wins!");
                        break;
                    case PAPER:
                        System.out.println("It's a tie!");
                        break;
                    case SCISSORS:
                        System.out.println("Player two wins!");
                        break;
                }
                break;
            case SCISSORS:
                switch (playerTwoChoice){
                    case ROCK:
                        System.out.println("Player two wins!");
                        break;
                    case PAPER:
                        System.out.println("Player one wins!");
                        break;
                    case SCISSORS:
                        System.out.println("It's a tie!");
                        break;
                }
                break;
        }
    }

    private static Player turnPlayerIntIntoPlayer(int player){
        switch (player) {
            case 0:
                return new RockPlayer();
            case 1:
                return new ComputerPlayer();
            case 2:
                return new HumanPlayer();
            default:
                return null;
        }
    }
    private static void listOptions() {
        System.out.println("Options:");
        for (int i = 0; i < optionsArray.length; i++) {
            System.out.println("[" + (i+1) + "] " + optionsArray[i]);
        }
    }
}
