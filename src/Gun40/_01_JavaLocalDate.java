package Gun40;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class _01_JavaLocalDate {
    public static void main(String[] args) {

        // LocalDate sadece gün ay yıl bilgisini tutar.

        LocalDate tarih=LocalDate.now(); // şu andaki zamanı verdi

        System.out.println("tarih = " + tarih);
        System.out.println("tarih.getYear() = " + tarih.getYear());
        System.out.println("tarih.getMonth() = " + tarih.getMonth());
        System.out.println("tarih.getMonthValue() = " + tarih.getMonthValue());
        System.out.println("tarih.getDayOfMonth() = " + tarih.getDayOfMonth());
        System.out.println("tarih.getDayOfWeek() = " + tarih.getDayOfWeek());
        System.out.println("tarih.getDayOfYear() = " + tarih.getDayOfYear());
        System.out.println("tarih.getDayOfWeek().getValue() = " + tarih.getDayOfWeek().getValue());

        // kendisindeki hazır formatlara bakalım.

        System.out.println("ISO_DATE = "+tarih.format(DateTimeFormatter.ISO_DATE));
        System.out.println("SHORT  = " +tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("MEDIUM  = " +tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("LONG   = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("FULL   = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));


        System.out.println("\n*****************");
        // Localde aldıgım tarihi istediğim ülkenin formatına göre diline göre nasıl gösteririm?
        // örneğin localdeki saati Almanya ya nasıl gösteririz.

        System.out.println("FULL Almanya gösterimi = "+
                tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMAN)));
        // Lokalizasyon tanımlaması.
        // en-US : birincisi DİLİ , ikincisi ise ÜLKEYİ temsil eder.Amerikan ingilizcesi manasında.
        // en-uk : UK ingilizcesi birleşik krallık.
        // fr-CA : kanada fransızcası

        Locale[] kullanilabilirLokaller=Locale.getAvailableLocales();
        for (Locale l :kullanilabilirLokaller ){
            if (l.getDisplayCountry().toLowerCase().contains("chi")){

                System.out.print(", Ülke = " + l.getDisplayCountry());
                System.out.print(", Dil = " + l.getDisplayLanguage());
                System.out.print(",  = " + l.getCountry());
                System.out.println(", - = " + l.getLanguage());

            }
        }
        Locale lokalCince=new Locale("zh","CN");
        System.out.println("FULL çince gösterimi = \n ");
        tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(lokalCince));


        System.out.println("\n**************İstediğim formatta gösterim*******************");
        // istediğim formatta gösterim.
        System.out.println("tarih = "+tarih);

        DateTimeFormatter ozelFormat1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("tarih dd/MM/yyy = " + tarih.format(ozelFormat1));

        DateTimeFormatter ozelFormat2=DateTimeFormatter.ofPattern("d.M.yy");
        System.out.println("tarih d.M.yy = " + tarih.format(ozelFormat2));

        DateTimeFormatter ozelFormat3=DateTimeFormatter.ofPattern(" dd.MM.yyyy EEEE");
        System.out.println("tarih EEEE dd.MM.yyyy = " + tarih.format(ozelFormat3.withLocale(Locale.UK)));

        DateTimeFormatter ozelFormat4=DateTimeFormatter.ofPattern(" dd.MM.yyyy EEEE");
        System.out.println("tarih EEEE dd.MM.yyyy = " + tarih.format(ozelFormat4));

        DateTimeFormatter ozelFormat5=DateTimeFormatter.ofPattern("MMMM dd.MM.yyyy");
        System.out.println("tarih MMMM dd.MM.yyyy = " + tarih.format(ozelFormat5));

        System.out.println("\n*********************");
        // kendimiz bir tarihi nasıl set edebiliriz , oluşturabiliriz,int sayi=5;

        LocalDate tarih1=LocalDate.of(2000,5,20);
        LocalDate tarih2=LocalDate.of(1999, Month.JUNE,19);
        System.out.println("tarih2 = " + tarih2.format(ozelFormat1));
        System.out.println("tarih1 = " + tarih1.format(ozelFormat1));

    }
}
