package Gun41;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class _07_ZonedDateTime {
    public static void main(String[] args) {

        // Başka Zaman Bölgelerinin (Time Zone) zaman bilgisini alma

        ZonedDateTime zdt = ZonedDateTime.now();
        // şu anda benim bulunduğum default zamanı verir.
        System.out.println("zdt = " + zdt);

        Set<String> zamanBolgeleri = ZoneId.getAvailableZoneIds();

        for (String z : zamanBolgeleri) {
            if (z.toLowerCase().contains("ıst"))
                System.out.println("z = " + z);
        }

        ZoneId zoneIdIstanbul=ZoneId.of("Europe/Istanbul");
        ZonedDateTime zoneIstanbul=ZonedDateTime.now(zoneIdIstanbul);
        System.out.println("zoneIstanbul = " + zoneIstanbul);

    }
}
