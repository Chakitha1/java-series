package day10;
import java.util.Scanner;
public class SumOfPositives {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break; 
            } else if (number > 0) {
                sum += number;
            }
        }
        System.out.println("Sum of positive numbers: " + sum);
        scanner.close();
    }
}
