package exercise;
import java.util.Scanner;
public class LargestNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largest = scanner.nextInt(); 
        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();
            if (number > largest) {
                largest = number;
            }
        }
        System.out.println(largest);
    }
}