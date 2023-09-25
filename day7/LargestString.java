package day7;
//Accept Strings until empty string is given and display the largest String.
import java.util.Scanner;
public class LargestString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String largestString = "";
        String input;
        while (true) {
            input = scanner.nextLine();
            if (input.isEmpty()) {
                break; 
            }
            if (input.length() > largestString.length()) {
                largestString = input;
            }
        }
        System.out.println(largestString);
        scanner.close();
    }
}