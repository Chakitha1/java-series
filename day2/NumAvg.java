package day2;
import java.util.Scanner;
public class NumAvg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            sum += num;
        }
        double average = sum / 5;
        System.out.println(average);
    }
}
