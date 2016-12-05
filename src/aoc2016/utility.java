package aoc2016;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class utility {
    public static List<String> readFromInput(String directory, String file) throws IOException {
        List<String> listOfLines = new ArrayList<>();
        String dirString = directory;
        Path dirPath = Paths.get(dirString);
        if (Files.notExists(dirPath)) {
            Files.createDirectories(dirPath);
        }
        String fileString = file;
        Path filePath = Paths.get(dirString, fileString);
        if (Files.notExists(filePath)) {
            Files.createFile(filePath);
        }
        File filetoread = filePath.toFile();
        FileReader reader = new FileReader(filetoread);
        BufferedReader read = new BufferedReader(reader);

        String line = read.readLine();
        while (line != null) {
            listOfLines.add(line);
            line = read.readLine();
        }
        return listOfLines;
    }
}
