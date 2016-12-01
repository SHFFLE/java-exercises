package circles;

import utilities.OOValidator;

public class CircleApp {
    public static void main(String[] args) {
        do{
            Circle newCircle = new Circle(OOValidator.getDouble("Enter the radius for the circle:"));
            System.out.println("Radius: " + newCircle.radius);
            System.out.println("Circumference: " + newCircle.getFormattedCircumference());
            System.out.println("Area: " + newCircle.getFormattedArea());
        }while(OOValidator.continueDoing("Would you like to continue?"));
        System.out.println("You built " + Circle.getObjectCount() + " circle(s)!");
    }
}
