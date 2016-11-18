import java.util.InputMismatchException;
import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "Merk";
        int age = 0;
        boolean isValid = false;
        boolean continueDo = false;
        String origin = "To-kyoto";
        String catchphrase = "Have you seen my daughter?";
        do{
            do{
                System.out.println("Please enter the new student's name:");
                try {
                    name = sc.next() + sc.nextLine();
                    isValid = true;
                } catch (InputMismatchException e){
                    sc.nextLine();
                    System.out.println("Invalid entry: Please try again.");
                    isValid = false;
                }
            }while (!isValid);
            do{
                System.out.println("Please enter the new student's age:");
                try {
                    age = sc.nextInt();
                    isValid = true;
                } catch (InputMismatchException e){
                    sc.nextLine();
                    System.out.println("Invalid entry: Please try again.");
                    isValid = false;
                }
            }while (!isValid);
            do{
                System.out.println("Please enter the new student's origin:");
                try {
                    origin = sc.next() + sc.nextLine();
                    isValid = true;
                } catch (InputMismatchException e){
                    sc.nextLine();
                    System.out.println("Invalid entry: Please try again.");
                    isValid = false;
                }
            }while (!isValid);
            do{
                System.out.println("Please enter the new student's catchphrase:");
                try {
                    catchphrase = sc.next() + sc.nextLine();
                    isValid = true;
                } catch (InputMismatchException e){
                    sc.nextLine();
                    System.out.println("Invalid entry: Please try again.");
                    isValid = false;
                }
            }while (!isValid);
            System.out.println(name + " is " + age + " years old, hails from " + origin + ", and loves to say " + catchphrase);
        }while(continueDo);
    }
}
