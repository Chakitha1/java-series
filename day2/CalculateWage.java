package day2;
import java.util.Scanner;
public class CalculateWage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int hoursWorked = scanner.nextInt();
        int wage = 0;     
        switch (day) {
            case 1, 2, 3:
                wage = hoursWorked * 200;
                break;
            case 4, 5:
                wage = hoursWorked * 400;
                break;
            case 6:
                wage = hoursWorked * 600;
                break;
            case 7:
                wage = hoursWorked * 800;
                break;
            default:
                System.out.println("Invalid day");
        }     
        if (wage > 2000) {
            int bonus = wage * 1/10;
            wage += bonus;
        }
        System.out.println(wage);
    }
}
