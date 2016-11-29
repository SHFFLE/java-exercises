import utilities.OOValidator;

import java.util.Scanner;

public class Enumeration {
    public enum TrafficLightColor {
        RED, YELLOW, GREEN
    }

    public static void makeDrivingDecision(TrafficLightColor color){
        if(color == TrafficLightColor.RED){
            System.err.println("STOP!");
        }else if (color == TrafficLightColor.GREEN){
            System.out.println("Go!");
        } else if (color == TrafficLightColor.YELLOW){
            System.out.println("HIT THE GAS! Unless you're too far away :/");
        }
    }

    public enum Discount {
        RED(0),
        BLUE(.1),
        YELLOW(.25),
        GREEN(.35),
        PURPLE(.5),
        PINK(1);

        private final double discount;

        Discount(double discount){ this.discount = discount;}

        public double getDiscount(){
            return discount;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Colored Discounts Exercise");
        double userInput = OOValidator.getDouble("Enter subtotal:");
        double total = userInput - (getDiscount()*userInput);
        if(total != userInput){
            System.out.println("You got a discount! Your total is: $" + total);
        } else {
            System.out.println("Your total is: $" + total);
        }

    }
    public static double getDiscount(){
        double random = Math.random();
        Discount discount;
        if(random < .1){
            discount = Discount.PINK;
        } else if (random < .2){
            discount = Discount.PURPLE;
        } else if (random < .3){
            discount = Discount.GREEN;
        } else if (random < .4){
            discount = Discount.YELLOW;
        } else if (random < .5){
            discount = Discount.BLUE;
        } else {
            discount = Discount.RED;
        }
        return discount.getDiscount();
    }
}
