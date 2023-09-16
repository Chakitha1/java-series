package exercise;
public class FibonacciNumbers {
    public static void main(String[] args) {
        int n = 10; 
        int[] fibonacciNum = new int[n];
        fibonacciNum[0] = 0;
        fibonacciNum[1] = 1;
        for (int i = 2; i < n; i++) {
            fibonacciNum[i] = fibonacciNum[i - 1] + fibonacciNum[i - 2];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciNum[i] + " ");
        }
    }
}
