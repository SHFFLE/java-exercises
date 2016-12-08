package aoc2016;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

// It's ugly and it's proud!
// Visualizes using commas for blank spots, and @ for the actual path travelled. I could doll it up, if I wanted, but I was curious about
// displaying a grid pattern using input. As it turns out, of course, 2d arrays work quite nicely for this :P
// You'll want to zoom out on the visualization though and/or import it into a text editor with a monospace font and switch the font size
// to something significantly smaller, because it is massive. Also you have to change the input string manually, but it should work for any input.
// If you get an out of bounds exception, change the map size variable to something higher than it already is.

public class dayone {
    private static int crossoverX = 0;
    private static int crossoverY = 0;
    public static void main(String[] args) {
        int maxX = 0;
        int minX = 0;
        int maxY = 0;
        int minY = 0;
        String input = "R4, R3, R5, L3, L5, R2, L2, R5, L2, R5, R5, R5, R1, R3, L2, L2, L1, R5, L3, R1, L2, R1, L3, L5, L1, R3, L4, R2, R4, L3, L1, R4, L4, R3, L5, L3, R188, R4, L1, R48, L5, R4, R71, R3, L2, R188, L3, R2, L3, R3, L5, L1, R1, L2, L4, L2, R5, L3, R3, R3, R4, L3, L4, R5, L4, L4, R3, R4, L4, R1, L3, L1, L1, R4, R1, L4, R1, L1, L3, R2, L2, R2, L1, R5, R3, R4, L5, R2, R5, L5, R1, R2, L1, L3, R3, R1, R3, L4, R4, L4, L1, R1, L2, L2, L4, R1, L3, R4, L2, R3, L1, L5, R4, R5, R2, R5, R1, R5, R1, R3, L3, L2, L2, L5, R2, L2, R5, R5, L2, R3, L5, R5, L2, R4, R2, L1, R3, L5, R3, R2, R5, L1, R3, L2, R2, R1";
        String[] inputArray = input.split(", ");
        List<String> CoordArrayList = new ArrayList<>();
        char orientation = 'n';
        int xCoordinate = 0;
        int yCoordinate = 0;

        for(int i = 0; i < inputArray.length; i++) {
            if(inputArray[i].charAt(0) == 'R'){
                switch (orientation){
                    case 'n':
                        orientation = 'e';
                        for (int j = 0; j < parseInt(inputArray[i].substring(1, inputArray[i].length())); j++) {
                            xCoordinate ++;
                            checkForCrossover(CoordArrayList, xCoordinate, yCoordinate);
                        }
                        break;
                    case 'e':
                        orientation = 's';
                        for (int j = 0; j < parseInt(inputArray[i].substring(1, inputArray[i].length())); j++) {
                            yCoordinate --;
                            checkForCrossover(CoordArrayList, xCoordinate, yCoordinate);
                        }
                        break;
                    case 's':
                        orientation = 'w';
                        for (int j = 0; j < parseInt(inputArray[i].substring(1, inputArray[i].length())); j++) {
                            xCoordinate --;
                            checkForCrossover(CoordArrayList, xCoordinate, yCoordinate);
                        }
                        break;
                    case 'w':
                        orientation = 'n';
                        for (int j = 0; j < parseInt(inputArray[i].substring(1, inputArray[i].length())); j++) {
                            yCoordinate ++;
                            checkForCrossover(CoordArrayList, xCoordinate, yCoordinate);
                        }
                        break;
                }
            } else {
                switch (orientation){
                    case 'n':
                        orientation = 'w';
                        for (int j = 0; j < parseInt(inputArray[i].substring(1, inputArray[i].length())); j++) {
                            xCoordinate --;
                            checkForCrossover(CoordArrayList, xCoordinate, yCoordinate);
                        }
                        break;
                    case 'e':
                        orientation = 'n';
                        for (int j = 0; j < parseInt(inputArray[i].substring(1, inputArray[i].length())); j++) {
                            yCoordinate ++;
                            checkForCrossover(CoordArrayList, xCoordinate, yCoordinate);
                        }
                        break;
                    case 's':
                        orientation = 'e';
                        for (int j = 0; j < parseInt(inputArray[i].substring(1, inputArray[i].length())); j++) {
                            xCoordinate ++;
                            checkForCrossover(CoordArrayList, xCoordinate, yCoordinate);
                        }
                        break;
                    case 'w':
                        orientation = 's';
                        for (int j = 0; j < parseInt(inputArray[i].substring(1, inputArray[i].length())); j++) {
                            yCoordinate --;
                            checkForCrossover(CoordArrayList, xCoordinate, yCoordinate);
                        }
                        break;
                }
                if(xCoordinate > maxX){
                    maxX = xCoordinate;
                }
                if(xCoordinate < minX){
                    minX = xCoordinate;
                }
                if(yCoordinate > maxY){
                    maxY = yCoordinate;
                }
                if(yCoordinate < minY){
                    minY = yCoordinate;
                }
            }
        }
        prepVisualize(CoordArrayList, maxX, minX, maxY, minY);
        System.out.println(xCoordinate + " " + yCoordinate);
        int distance = Math.abs(0 - xCoordinate) + Math.abs(0 - yCoordinate);
        System.out.println(distance);
        System.out.println("Crossover is " + (Math.abs(0 - crossoverX) + Math.abs(0 - crossoverY)));
    }

    private static void checkForCrossover(List<String> coordArrayList, int xCoordinate, int yCoordinate) {
        if(coordArrayList.contains(xCoordinate + ", " + yCoordinate)){
            if(crossoverX == 0 && crossoverY == 0){
                crossoverX = xCoordinate;
                crossoverY = yCoordinate;
            }
        }
        coordArrayList.add(xCoordinate + ", " + yCoordinate);
    }

    private static void prepVisualize(List<String> coordArrayList, int maxX, int minX, int maxY, int minY){
        int mapsizeX = Math.abs(minX) + maxX + 10;
        int mapsizeY = Math.abs(minY) + maxY + 10;
        String[][] map = new String[mapsizeY][mapsizeX];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = ",";
            }
        }
        for (int i = 0; i < coordArrayList.size(); i++) {
            String[] currentCoord = coordArrayList.get(i).split(", ");
            int xCoord = (parseInt(currentCoord[0]) + Math.abs(minX)+5);
            int yCoord = (parseInt(currentCoord[1]) + Math.abs(minY)+5);
            map[yCoord][xCoord] = "@";
        }
        visualize(map);
    }

    private static void visualize(String[][] map){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
}
