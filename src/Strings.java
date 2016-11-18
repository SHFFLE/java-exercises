import java.util.Arrays;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String message = "We don't need no education\nWe don't need no thought control";
        System.out.println(message);
        message = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(message);
        message = "In Windows, the main drive is usually C:\\";
        System.out.println(message);
        message = "I can do back slashes \\, and double back slashes \\\\, and the amazing triple-backslash \\\\\\!";
        System.out.println(message);

        System.out.println("Enter your choice of sentence:");
        Scanner sc = new Scanner(System.in);
        String userString = sc.next() + sc.nextLine();
        String translatedString = "";
        String[] stringArray = userString.split(" ");
        System.out.println(Arrays.toString(stringArray));
        for(int i = 0; i < stringArray.length; i++){
            String word = stringArray[i].toLowerCase();
            String consonants = "";

            char firstChar = word.charAt(0);

            int aIndex = word.indexOf('a');
            int eIndex = word.indexOf('e');
            int iIndex = word.indexOf('i');
            int oIndex = word.indexOf('o');
            int uIndex = word.indexOf('u');

            if(aIndex == -1){
                aIndex = 2147000000;
            }
            if(eIndex == -1){
                eIndex = 2147000000;
            }
            if(iIndex == -1){
                iIndex = 2147000000;
            }
            if(oIndex == -1){
                oIndex = 2147000000;
            }
            if(uIndex == -1){
                uIndex = 2147000000;
            }

            if(firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u'){
                translatedString += word + "way ";
            } else {
                if(aIndex != 2147000000 && aIndex < eIndex && aIndex < iIndex && aIndex < oIndex && aIndex < uIndex){
                    consonants = word.substring(0, aIndex);
                    word = word.substring(aIndex, word.length());
                    translatedString += word + consonants + "ay ";
                } else if(eIndex != 2147000000 && eIndex < aIndex && eIndex < iIndex && eIndex < oIndex && eIndex < uIndex){
                    consonants = word.substring(0, eIndex);
                    word = word.substring(eIndex, word.length());
                    translatedString += word + consonants + "ay ";
                } else if(iIndex != 2147000000 && iIndex < eIndex && iIndex < aIndex && iIndex < oIndex && iIndex < uIndex){
                    consonants = word.substring(0, iIndex);
                    word = word.substring(iIndex, word.length());
                    translatedString += word + consonants + "ay ";
                } else if(oIndex != 2147000000 && oIndex < eIndex && oIndex < iIndex && oIndex < aIndex && oIndex < uIndex){
                    consonants = word.substring(0, oIndex);
                    word = word.substring(oIndex, word.length());
                    translatedString += word + consonants + "ay ";
                } else if(uIndex != 2147000000 && uIndex < eIndex && uIndex < iIndex && uIndex < oIndex && uIndex < aIndex){
                    consonants = word.substring(0, uIndex);
                    word = word.substring(uIndex, word.length());
                    translatedString += word + consonants + "ay ";
                }
            }
        }
        System.out.println(translatedString);
    }
}
