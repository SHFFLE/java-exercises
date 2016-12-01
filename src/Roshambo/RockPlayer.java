package Roshambo;

import static Roshambo.Player.ROSHAMBO.*;

public class RockPlayer extends Player {
    RockPlayer(){}

    @Override
    ROSHAMBO generateRoshambo() {
        return ROCK;
    }
}
