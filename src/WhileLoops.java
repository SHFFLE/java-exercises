public class WhileLoops {
    public static void main(String[] args) {
        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i++;
        }

        i = 0;

        do {
            if(i % 2 == 0){
                System.out.println(i);
            }
            i++;
        } while (i <= 100);

        i = 100;

        do {
            if(i % 5 == 0){
                System.out.println(i);
            }
            i -= 5;
        } while (i >= -10);

        i = 2;
        int num = 0;

        do {
            num = i*i;
            System.out.println(num);
            i++;
        }while (num < 1000000);
    }
}
