//Accept a filename from user and display how many uppercase, lowercase and digits the file has.
package day10;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class CountChars {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();
        File file = new File(filename);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int digitCount = 0;
        String line;
        while ((line = reader.readLine()) != null) {
            for (int i = 0; i < line.length(); i++) {
                char ch = line.charAt(i);
                if (Character.isUpperCase(ch)) {
                    uppercaseCount++;
                } else if (Character.isLowerCase(ch)) {
                    lowercaseCount++;
                } else if (Character.isDigit(ch)) {
                    digitCount++;
                }
            }
        }
        reader.close();
        System.out.println("Uppercase letters: " + uppercaseCount);
        System.out.println("Lowercase letters: " + lowercaseCount);
        System.out.println("Digits: " + digitCount);
    }
}