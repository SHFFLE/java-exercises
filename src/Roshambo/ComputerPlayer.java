package Roshambo;

import static Roshambo.Player.ROSHAMBO.*;

public class ComputerPlayer extends Player {
    ComputerPlayer(){}
    @Override
    ROSHAMBO generateRoshambo() {
        int random = (int) Math.ceil(Math.random() * 3);
        if(random == 1){
            return ROCK;
        } else if (random == 2){
            return PAPER;
        } else {
            return SCISSORS;
        }
    }
}
