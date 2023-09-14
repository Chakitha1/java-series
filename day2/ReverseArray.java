package day2;
import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 4; i >= 0; i--) {
            System.out.println(array[i]);
        }
        scanner.close();
    }
}