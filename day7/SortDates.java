package day7;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;
public class SortDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate[] dateArray = new LocalDate[5];
        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            dateArray[i] = LocalDate.parse(input, dateFormat);
        }
        Arrays.sort(dateArray);
        for (LocalDate date : dateArray) {
            System.out.println(date.format(dateFormat));
        }
        scanner.close();
    }
}