//File Marks.txt, which have marks separated by comma in different lines.Find the total marks of each line and display them.(Use fault tolerance)
package day10;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class TotalMarks {
    public static void main(String[] args) throws IOException {
        String filename = "Marks.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader("/home/chakitha/Marks.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] marks = line.split(",");
                int totalMarks = 0;
                for (String mark : marks) {
                    try {
                        totalMarks += Integer.parseInt(mark);
                    } catch (NumberFormatException e) {
                        // Ignore invalid marks.
                    }
                }
                System.out.println("Total marks: " + totalMarks);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}