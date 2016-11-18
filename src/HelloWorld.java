import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World!");
        String justAString = "I'm just a string, up on java hill. That didn't rhyme. I suck.";
        Character justAnL = 'L';
        int justAnInteger = 2100000000;
        long justALong =  2100000000000L;
        float justAFloat = (float) 2000000000000.5233222;
        double justADouble = 200000000.2222455555555555;
        System.out.println(justAString);
        System.out.println(justAnL);
        System.out.println(justAnInteger);
        System.out.println(justALong);
        System.out.println(justAFloat);
        System.out.println(justADouble);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer");
        int userInt = sc.nextInt();
        System.out.println(userInt);

        System.out.println("Enter a string");
        String userSentence = sc.next() + sc.nextLine();
        System.out.println(userSentence);

        System.out.println("Enter three words");
        String wordOne = sc.next();
        String wordTwo = sc.next();
        String wordThree = sc.next();
        System.out.println(wordOne);
        System.out.println(wordTwo);
        System.out.println(wordThree);

        boolean continueDo;
        do {
            System.out.println("Enter the length of the room");
            double roomLength = sc.nextDouble();
            System.out.println("Enter the width of the room");
            double roomWidth = sc.nextDouble();
            System.out.println("The perimeter of the room is " + (2*roomLength + 2*roomWidth) + ", the area of the room is " + (roomLength*roomWidth) + ", and the volume of the room, assuming 10 ft ceiling, is " + (roomLength*roomWidth*10.0));
            System.out.println("Do you wish to continue? (y or n)");
            if (sc.next().equals("y")) {
                continueDo = true;
                System.out.println("Continuing");
            } else {
                System.out.println("Stopping");
                continueDo = false;
            }

        } while (continueDo);
    }
}
