package exercise;
import java.util.Scanner;
public class InterchangeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            int temp = arr[i];
            arr[i] = arr[i + 5];
            arr[i + 5] = temp;
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}