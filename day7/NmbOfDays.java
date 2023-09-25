package day7;
//Accept starting date and ending date in DD-MM-YYYY format and display no of days between those two.
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class NmbOfDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String startDateStr = scanner.nextLine();
        String endDateStr = scanner.nextLine();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate startDate = LocalDate.parse(startDateStr, dateFormat);
            LocalDate endDate = LocalDate.parse(endDateStr, dateFormat);
            long daysBetween = Math.abs(startDate.toEpochDay() - endDate.toEpochDay());
            System.out.println(daysBetween);
        scanner.close();
    }
}