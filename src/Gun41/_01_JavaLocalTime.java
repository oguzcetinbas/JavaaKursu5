package Gun41;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _01_JavaLocalTime {
    public static void main(String[] args) {

        // LocalTime : Tarih bilgisi içermez, sadece saat , dakika , saniye ve nano saniye içerir.

        LocalTime saat=LocalTime.now();
        System.out.println("saat = " + saat);

        System.out.println("saat.getHour() = " + saat.getHour());
        System.out.println("saat.getMinute() = " + saat.getMinute());
        System.out.println("saat.getSecond() = " + saat.getSecond());
        System.out.println("saat.getNano() = " + saat.getNano());

        // kendimize özel format

        DateTimeFormatter of1=DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println("of1.format(of1) = " + saat.format(of1));

        DateTimeFormatter of2=DateTimeFormatter.ofPattern("kk:mm");
        System.out.println("of1.format(of1) = " + saat.format(of2));

        DateTimeFormatter of3=DateTimeFormatter.ofPattern("k:mm a");
        System.out.println("of1.format(of1) = " + saat.format(of3));


        LocalTime saat1=LocalTime.of(18,34,45);
        System.out.println("saat = " + saat1.format(of3));




    }
}
