package day7;
import java.util.Scanner;
public class InvertedCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder invertedString = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isUpperCase(currentChar)) {
                invertedString.append(Character.toLowerCase(currentChar));
            }
            else {
                invertedString.append(Character.toUpperCase(currentChar));
            }
        }
        System.out.println(invertedString.toString());
        scanner.close();
    }
}