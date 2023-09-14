package day2;
import java.util.Scanner;
public class LargestFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);     
        int number = scanner.nextInt();    
        int largestFactor = 1;
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                largestFactor = i;
            }
        }
        System.out.println(largestFactor);
    }
}
