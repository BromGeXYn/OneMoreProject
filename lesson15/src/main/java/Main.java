import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ///Задание №1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year, then number of month, and number of day: ");
        LocalDate ld = LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println("It's " + ld.getDayOfWeek());
        scanner.close();

        ///Задание №2
        LocalDate ld2 = LocalDate.now();
        System.out.println("Today : " + ld2);
        LocalDate nextThursday = ld2.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        System.out.println("Date of next tuesday is: " + nextThursday);
    }
}
