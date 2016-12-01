package aoc2016;

import java.util.ArrayList;
import java.util.List;

// It's ugly and it's proud!
// Seriously though this solution is absolutely terrible, but functional. Because I'm able to actively manipulate the code, it works for my purposes
// And gives the correct answer. It's just really ugly - I actually had to grab the first crossover manually because this setup lists all of them (in order)
public class dayone {
    public static void main(String[] args) {
        String input = "R4, R3, R5, L3, L5, R2, L2, R5, L2, R5, R5, R5, R1, R3, L2, L2, L1, R5, L3, R1, L2, R1, L3, L5, L1, R3, L4, R2, R4, L3, L1, R4, L4, R3, L5, L3, R188, R4, L1, R48, L5, R4, R71, R3, L2, R188, L3, R2, L3, R3, L5, L1, R1, L2, L4, L2, R5, L3, R3, R3, R4, L3, L4, R5, L4, L4, R3, R4, L4, R1, L3, L1, L1, R4, R1, L4, R1, L1, L3, R2, L2, R2, L1, R5, R3, R4, L5, R2, R5, L5, R1, R2, L1, L3, R3, R1, R3, L4, R4, L4, L1, R1, L2, L2, L4, R1, L3, R4, L2, R3, L1, L5, R4, R5, R2, R5, R1, R5, R1, R3, L3, L2, L2, L5, R2, L2, R5, R5, L2, R3, L5, R5, L2, R4, R2, L1, R3, L5, R3, R2, R5, L1, R3, L2, R2, R1";
        String[] inputArray = input.split(", ");
        List<String> CoordArrayList = new ArrayList<>();
        char orientation = 'n';
        int xCoordinate = 0;
        int yCoordinate = 0;
        int crossoverX = 0;
        int crossoverY = 0;
        for(int i = 0; i < inputArray.length; i++) {
            if(inputArray[i].charAt(0) == 'R'){
                switch (orientation){
                    case 'n':
                        orientation = 'e';
                        for (int j = 0; j < Integer.parseInt(inputArray[i].substring(1, inputArray[i].length())); j++) {
                            xCoordinate ++;
                            if(CoordArrayList.contains(xCoordinate + ", " + yCoordinate)){
                                System.out.println("Crossover at " + xCoordinate + ", " + yCoordinate);
                                crossoverX = xCoordinate;
                                crossoverY = yCoordinate;
                            }
                            CoordArrayList.add(xCoordinate + ", " + yCoordinate);
                        }
                        continue;
                    case 'e':
                        orientation = 's';
                        for (int j = 0; j < Integer.parseInt(inputArray[i].substring(1, inputArray[i].length())); j++) {
                            yCoordinate --;
                            if(CoordArrayList.contains(xCoordinate + ", " + yCoordinate)){
                                System.out.println("Crossover at " + xCoordinate + ", " + yCoordinate);
                                crossoverX = xCoordinate;
                                crossoverY = yCoordinate;
                            }
                            CoordArrayList.add(xCoordinate + ", " + yCoordinate);
                        }
                        continue;
                    case 's':
                        orientation = 'w';
                        for (int j = 0; j < Integer.parseInt(inputArray[i].substring(1, inputArray[i].length())); j++) {
                            xCoordinate --;
                            if(CoordArrayList.contains(xCoordinate + ", " + yCoordinate)){
                                System.out.println("Crossover at " + xCoordinate + ", " + yCoordinate);
                                crossoverX = xCoordinate;
                                crossoverY = yCoordinate;
                            }
                            CoordArrayList.add(xCoordinate + ", " + yCoordinate);
                        }
                        continue;
                    case 'w':
                        orientation = 'n';
                        for (int j = 0; j < Integer.parseInt(inputArray[i].substring(1, inputArray[i].length())); j++) {
                            yCoordinate ++;
                            if(CoordArrayList.contains(xCoordinate + ", " + yCoordinate)){
                                System.out.println("Crossover at " + xCoordinate + ", " + yCoordinate);
                                crossoverX = xCoordinate;
                                crossoverY = yCoordinate;
                            }
                            CoordArrayList.add(xCoordinate + ", " + yCoordinate);
                        }
                        continue;
                }
            } else {
                switch (orientation){
                    case 'n':
                        orientation = 'w';
                        for (int j = 0; j < Integer.parseInt(inputArray[i].substring(1, inputArray[i].length())); j++) {
                            xCoordinate --;
                            if(CoordArrayList.contains(xCoordinate + ", " + yCoordinate)){
                                System.out.println("Crossover at " + xCoordinate + ", " + yCoordinate);
                                crossoverX = xCoordinate;
                                crossoverY = yCoordinate;
                            }
                            CoordArrayList.add(xCoordinate + ", " + yCoordinate);
                        }
                        continue;
                    case 'e':
                        orientation = 'n';
                        for (int j = 0; j < Integer.parseInt(inputArray[i].substring(1, inputArray[i].length())); j++) {
                            yCoordinate ++;
                            if(CoordArrayList.contains(xCoordinate + ", " + yCoordinate)){
                                System.out.println("Crossover at " + xCoordinate + ", " + yCoordinate);
                                crossoverX = xCoordinate;
                                crossoverY = yCoordinate;
                            }
                            CoordArrayList.add(xCoordinate + ", " + yCoordinate);
                        }
                        continue;
                    case 's':
                        orientation = 'e';
                        for (int j = 0; j < Integer.parseInt(inputArray[i].substring(1, inputArray[i].length())); j++) {
                            xCoordinate ++;
                            if(CoordArrayList.contains(xCoordinate + ", " + yCoordinate)){
                                System.out.println("Crossover at " + xCoordinate + ", " + yCoordinate);
                                crossoverX = xCoordinate;
                                crossoverY = yCoordinate;
                            }
                            CoordArrayList.add(xCoordinate + ", " + yCoordinate);
                        }
                        continue;
                    case 'w':
                        orientation = 's';
                        for (int j = 0; j < Integer.parseInt(inputArray[i].substring(1, inputArray[i].length())); j++) {
                            yCoordinate --;
                            if(CoordArrayList.contains(xCoordinate + ", " + yCoordinate)){
                                System.out.println("Crossover at " + xCoordinate + ", " + yCoordinate);
                                crossoverX = xCoordinate;
                                crossoverY = yCoordinate;
                            }
                            CoordArrayList.add(xCoordinate + ", " + yCoordinate);
                        }
                        continue;
                }
            }
        }
        System.out.println(xCoordinate + " " + yCoordinate);
        int distance = Math.abs(0 - xCoordinate) + Math.abs(0 - yCoordinate);
        System.out.println(distance);
        System.out.println("Crossover is " + (Math.abs(0 - 129) + Math.abs(0 - -24)));
    }
}
