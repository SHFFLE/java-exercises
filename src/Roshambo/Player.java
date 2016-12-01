package Roshambo;

abstract public class Player {
    public enum ROSHAMBO {
        ROCK, PAPER, SCISSORS
    }
    Player(){}
    abstract ROSHAMBO generateRoshambo();
}
