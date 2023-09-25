package day6;
import java.util.Scanner;
public class TotalMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] marksArray = input.split(",");
        int total = 0;
        for (String mark : marksArray) {
            int intMark = Integer.parseInt(mark);
            total += intMark; 
        }
        System.out.println("Total marks: " + total);
        scanner.close();
    }
}