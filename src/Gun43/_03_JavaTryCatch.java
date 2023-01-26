package Gun43;

import java.time.LocalDate;
import java.time.Month;

public class _03_JavaTryCatch {
    public static void main(String[] args) {

        System.out.println("Program çalışmaya başladı");

        try { // dene , hatanın başladığı yerin üstüne konur
            LocalDate tarih = LocalDate.of(2023, Month.FEBRUARY, 30);

        } // hata olduğu zaman programı kırma
        catch (Exception ex){
            // ex isimli değişkene oluşan hataların bilgisi atanıyor
            // hata olduğunda yapılması istenenler buraya yazılıyor
            System.out.println("hata oluştu lütfen tekrar deneyiniz.");
            System.out.println("Tüm hata mesajı = " +ex);
            System.out.println("Hatanın açıklaması = " + ex.getMessage());
            // Hata mesajını kendine mail atabilirsin.
            // log tutma : program nasıl çalışıyor, hata loglarını DB yazdırabilirsin

        }
        System.out.println("Program bitti");



    }
}
