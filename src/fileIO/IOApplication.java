package fileIO;

import utilities.OOValidator;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class IOApplication {
    public static void main(String[] args) throws IOException {
        List<String> listOfStrings = new ArrayList<>();
        String dirString = "fileIO";
        Path dirPath = Paths.get(dirString);
        if(Files.notExists(dirPath)){
            Files.createDirectories(dirPath);
        }
        String fileString = "countries.txt";
        Path filePath = Paths.get(dirString, fileString);
        if(Files.notExists(filePath)){
            Files.createFile(filePath);
        }
        File countryFile = filePath.toFile();
        FileReader reader = new FileReader(countryFile);
        BufferedReader read = new BufferedReader(reader);

        String line = read.readLine();
        while (line != null){
            listOfStrings.add(line);
            line = read.readLine();
        }
        do{
            System.out.println("[1] Add a new country.");
            System.out.println("[2] Read current countries.");
            System.out.println("[3] Delete a country.");
            System.out.println("[4] Quit application.");
            int userInput = OOValidator.getIntWithinRange("Please pick an option", 1, 4);

            if(userInput == 1){
                String userCountry = OOValidator.getString("What country would you like to add?");
                PrintWriter out = new PrintWriter(countryFile);
                listOfStrings.add(userCountry);
                String output = "";
                for (int i = 0; i < listOfStrings.size(); i++) {
                    if(i < listOfStrings.size()-1) {
                        output += (listOfStrings.get(i) + "\n");
                    } else {
                        output += listOfStrings.get(i);
                    }
                }
                out.println(output);
                out.close();
            } else if(userInput == 2){
                for (int i = 0; i < listOfStrings.size(); i++) {
                    System.out.println("[" + (i+1)+ "] " + listOfStrings.get(i));
                }
            } else if(userInput == 3){
                for (int i = 0; i < listOfStrings.size(); i++) {
                    System.out.println("[" + (i+1)+ "] " + listOfStrings.get(i));
                }
                userInput = (OOValidator.getIntWithinRange("Select a country to delete: ", 1, listOfStrings.size()) - 1);
                listOfStrings.remove(userInput);
                PrintWriter out = new PrintWriter(countryFile);
                String output = "";
                for (int i = 0; i < listOfStrings.size(); i++) {
                    if(i < listOfStrings.size()-1) {
                        output += (listOfStrings.get(i) + "\n");
                    } else {
                        output += listOfStrings.get(i);
                    }
                }
                out.println(output);
                out.close();
                System.err.println("Removed!");
            }
        } while (OOValidator.continueDoing("Continue?"));

    }
}
