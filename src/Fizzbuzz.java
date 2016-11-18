import java.util.Scanner;

public class Fizzbuzz {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            if((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        Scanner sc = new Scanner(System.in);
        boolean userContinue;
        do{
            System.out.println("Please enter an integer:");
            int userInt = sc.nextInt();
            for (int i = 1; i <= userInt; i++){
                int square = i * i;
                int cube = i * i * i;
                System.out.println(square + " || " + cube);
            }
            System.out.println("Would you like to continue? (y or n)");
            if (sc.next().equals("y")) {
                System.out.println("Continuing");
                userContinue = true;
            } else {
                System.out.println("Stopping");
                userContinue = false;
            }
        } while (userContinue);

        boolean gradeContinue;
        do{
            int grade;
            do {
                System.out.println("Please enter a grade 0-100, integers only:");
                grade = sc.nextInt();
            } while (grade > 100 || grade < 0);
            if (grade >= 88) {
                System.out.println("A");
            } else if (grade >= 80) {
                System.out.println("B");
            } else if (grade >= 67) {
                System.out.println("C");
            } else if (grade >= 60){
                System.out.println("D");
            } else {
                System.out.println("F");
            }
            System.out.println("Would you like to continue? (y or n)");
            if (sc.next().equals("y")) {
                System.out.println("Continuing");
                gradeContinue = true;
            } else {
                System.out.println("Stopping");
                gradeContinue = false;
            }
            System.out.println();
        } while (gradeContinue);
    }
}
