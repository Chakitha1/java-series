package day9;
import java.util.Scanner;
public class FiveStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        for (int i=1; i<= 5; i++) {
            String input = sc.nextLine();
            try {
                int number = Integer.parseInt(input);
                total += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
                i--;
            }
        }
        System.out.println("Total: " + total);
        sc.close();
    }
}