import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ArrayExercises {

    public static void main(String[] args) {
        serverNameGenerator();
        battingAverage();
    }

    public static void serverNameGenerator(){
        String[] adjectives = {"Red ", "Char's ", "Amuro's ", "Reptilian ", "Poor ", "Angelic ", "Pink ", "Rusted ", "Nilfgardian ", "Devilish "};
        String[] nouns = {"Zaku", "Gelgoog", "Shinjuku", "RX-0 Unicorn", "RX-78-2 Gundam", "Guntank", "Guncannon", "Rick Dom", "Graze", "Hamster"};
        System.out.println(adjectives[randomizer(adjectives.length)]+nouns[randomizer(nouns.length)]);
    }
    public static int randomizer(int range){
        return (int) Math.floor(Math.random()*range);
    }


    public static void battingAverage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of batters: ");
        int batters = sc.nextInt();
        float[][] arrayOfBatters = new float[batters][2];
        for (int i = 0; i < batters; i++) {
            System.out.println("This is for player number " + (i + 1));
            int atbats = OOValidator.getIntWithinRange("Enter the number of at-bats for this player: ", 1, 50);
            int[] atBatArray = new int[atbats];
            for (int b = 0; b < atbats; b++) {
                int atBatResult = OOValidator.getIntWithinRange("Enter at-bat result #" + (b + 1) + " (0-4): ", 0, 4);
                atBatArray[b] = atBatResult;
            }
            float totalPreAtBat = 0;
            for (int f = 0; f < atbats; f++) {
                totalPreAtBat += (float) atBatArray[f];
            }
            float totalHits = 0;
            for (int h = 0; h < atbats; h++) {
                if (atBatArray[h] > 0) {
                    totalHits++;
                }
            }
            arrayOfBatters[i][0] = totalPreAtBat / atbats;
            arrayOfBatters[i][1] = totalHits / atbats;
            if (i == (batters - 1)) {
                System.out.println("Final results:");
                for (int l = 0; l < batters; l++) {
                    System.out.println("Batter " + (l + 1) + " || Slugging Percentage: " + format(arrayOfBatters[l][0]) + " || Batting Percentage: " + format(arrayOfBatters[l][1]));
                }
            }
        }
    }
    public static float format(float input){
        NumberFormat formatter = NumberFormat.getInstance(Locale.US);
        formatter.setMaximumFractionDigits(3);
        formatter.setMinimumFractionDigits(3);
        formatter.setRoundingMode(RoundingMode.HALF_UP);
        Float formattedFloat = new Float(formatter.format(input));
        return formattedFloat;
    }
}
