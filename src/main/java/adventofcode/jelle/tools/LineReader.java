package adventofcode.jelle.tools;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class LineReader {
    public static List<String> readLinesForDay(int dayNumber) {
        var filePath = Path.of("inputfiles/" + dayNumber + ".txt");

        try {
            return Files.readAllLines(filePath);
        } catch (IOException e) {
            System.err.println("Could not read file " + dayNumber);
            e.printStackTrace();
        }
        return null;
    }
}
