package day4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeTest {

    public static void main(String[] args) {
//        localDateTime();
        long start = System.currentTimeMillis();
        System.out.println(nwd(1, 40));
        long stop = System.currentTimeMillis();
        System.out.println("Dzialalo tyle - " + (stop - start));
    }

    private static int nwd(int a, int b) {
        if (a == 0) {
            return 0;
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    private static void localDateTime() {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd:MM:yyyy");
        System.out.println(date.format(formatter));

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        DateTimeFormatter timeFormatter =
                DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss");
        System.out.println(dateTime.format(timeFormatter));
        System.out.println(dateTime.plusHours(5));
    }
}
