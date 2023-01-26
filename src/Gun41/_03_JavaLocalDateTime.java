package Gun41;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class _03_JavaLocalDateTime {
    public static void main(String[] args) {

        // LocalDateTime hem tarih , hemde saat bilgisini tutar.

        LocalDateTime dt=LocalDateTime.now();
        System.out.println("dt = " + dt);

        System.out.println("dt.getYear() = " + dt.getYear());
        System.out.println("dt.getMonth() = " + dt.getMonth());
        System.out.println("dt.getMonthValue() = " + dt.getMonthValue());
        System.out.println("dt.getDayOfYear() = " + dt.getDayOfYear());
        System.out.println("dt.getDayOfMonth() = " + dt.getDayOfMonth());
        System.out.println("dt.getDayOfWeek() = " + dt.getDayOfWeek());
        System.out.println("dt.getDayOfWeek().getValue() = " + dt.getDayOfWeek().getValue());
        System.out.println("dt.getHour() = " + dt.getHour());
        System.out.println("dt.getMinute() = " + dt.getMinute());
        System.out.println("dt.getSecond() = " + dt.getSecond());
        System.out.println("dt.getNano() = " + dt.getNano());

        System.out.println("dt.format(DateTimeFormatter.ISO_DATE_TIME) = " + dt.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println("dt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)) = " + dt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));
        System.out.println("dt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)) = " + dt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));




    }
}
