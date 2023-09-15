package day3;
public class Largest {
    public static int findLargest(int... numbers) {     
        int largest = numbers[0]; 
        for (int num : numbers) {
            if (num > largest) {
                largest = num;
            }
        }   
        return largest;
    }
    public static void main(String[] args) {
        int largest = findLargest(10, 5, 23, 7, 42, 1, 58, 99);
        System.out.println(largest);    
    }
}