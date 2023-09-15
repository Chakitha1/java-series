package day3;
public class CommonFactors {
    public static void comFactors(int[] numbers) {
        int num1 = numbers[0];
        for (int factor = 1; factor <= num1; factor++) {
            boolean isCommonFactor = true;
            for (int num : numbers) {
                if (num % factor != 0) {
                    isCommonFactor = false;
                    break; 
                }
            }
            if (isCommonFactor) {
                System.out.print(" " + factor);
            }
        }
    }
    public static void main(String[] args) {
        int[] numbers1 = {12, 36};
        comFactors(numbers1);
    }
}
