package day7;
import java.util.Scanner;
public class SeparatedNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter names one by one (enter 'end' to finish):");
        String input;
        StringBuilder nameList = new StringBuilder();
        while (true) {
            input = scanner.nextLine();
            if (input.equals("end")) {
                break; 
            }
            nameList.append(input);
            if (!input.equals("end")) {
                nameList.append("-");
            }
        }
        System.out.println("Names separated by '-': " + nameList.toString());
        scanner.close();
    }
}
