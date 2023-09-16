package exercise;
public class Palindromes {
    public static void main(String[] args) {
        int start = 1000;
        int end = 2000;
        for (int number = start; number <= end; number++) {
            if (isPalindrome(number)) {
                System.out.print(number + " ");
            }
        }
    }
    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return originalNum == reversedNum;
    }
}