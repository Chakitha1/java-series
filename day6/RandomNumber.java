package day6;
import java.util.Random;
import java.util.Scanner;
public class RandomNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int min = 1;
        int max = 25;
        int nmbOfAttempts = 3;
        int targetNmb = random.nextInt(max - min + 1) + min;
        for (int attempt = 1; attempt <= nmbOfAttempts; attempt++) {
            int guessNmb = scanner.nextInt();
            if (guessNmb == targetNmb) {
                System.out.println("Correct answer");
                break;
            } else if (attempt < nmbOfAttempts) {
                System.out.println("Wrong guess, try again.");
            } else {
                System.out.println("Attempts are over, the correct no. is " + targetNmb);
            }
        }
        scanner.close();
    }
}