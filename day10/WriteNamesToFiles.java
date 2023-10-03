//Accept names from user until 'END' is given and write them into names.txt as one name for line.
package day10;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class WriteNamesToFiles {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileWriter writer = new FileWriter("names.txt");
        while (true) {
          String name = scanner.nextLine();
          if (name.equals("end")) {
              break; 
          }
          writer.write(name+ "\n");
      }
        writer.close();
        scanner.close();
        System.out.println("Names have been written to names.txt file.");
    }
}