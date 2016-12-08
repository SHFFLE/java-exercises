package aoc2016;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class dayfive {
    public static void main(String[] args) throws NoSuchAlgorithmException{
        String input = "wtnhxymk";
        int count = 0;
        int i=0;
        String positions = "";
        String characters = "";
        while(count < 30) {
            String inputString = input + i;
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(StandardCharsets.UTF_8.encode(inputString));
            System.out.println(i);
            i++;
            String hashed = String.format("%032x", new BigInteger(1, md5.digest()));
            if(hashed.startsWith("00000")){
                positions += hashed.charAt(5);
                characters += hashed.charAt(6);
                count ++;
                System.out.println(positions);
                System.out.println(characters);
            }

        }
        System.out.println(positions);
        System.out.println(characters);
    }

}
