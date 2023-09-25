package day6;
import java.util.Scanner;
public class SpaceIndexing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isWhitespace(currentChar)) {
                System.out.println("Space at index " + (i));
            }
        }
        scanner.close();
    }
}
