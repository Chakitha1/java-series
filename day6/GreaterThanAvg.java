package day6;
import java.util.Random;
import java.util.Arrays;
public class GreaterThanAvg {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            sum += array[i];
        }
        System.out.println(Arrays.toString(array));
        int average = (int) sum / array.length;
        System.out.println("Array elements greater than the average:");
        for (int value : array) {
            if (value > average) {
                System.out.print(value + " ");
            }
        }
        System.out.println();
        System.out.println("Average of the array: " + average);
    }
}
