package Gun42;

import java.util.Arrays;

public class _03_VeriTipleriMetodda {
    public static void main(String[] args) {

        // İlkel tip

        int sayi = 5;
        sayiArtir(sayi);
        System.out.println("sayi = " + sayi);

        //  Referans tip
        int[] dizi = {1, 2, 3};
        diziSifirla(dizi);
        System.out.println("Arrays.toString(dizi) = " + Arrays.toString(dizi));

        // Nesne tipler
        String kelime = "ismet";
        kelimeSifirla(kelime);
        System.out.println("kelime = " + kelime);

        // Özet: Temel fark:
        // 1- İlkel tipler sadece 1 değer saklarlar, bu yüzden metodlara sadece değeri gider.Eşitlendiğinde sadece değer aktarılır.
        // 2- Nesne tipler İlkel tipten tek farkı NULL değeri alabilmeleri, bu yüzden ilkel tip gibi davranırlar
        // 3- Referans tipler metoda gönderildiklerinde kendileri giderler. Eşitlemelerde referanslar eşitlenir.
    }

    public static void sayiArtir(int sayi) { // ilkel tiplerde değerlerin değeri gelir.
        sayi++;
    }
    public static void diziSifirla(int[] dizi) { // referans değerlerin metodlarda kendisi gelir
        dizi[0] = 0;
        dizi[1] = 0;
        dizi[2] = 0;
    }
    public static void kelimeSifirla(String kelime) { // değeri gelir.
        kelime = "";
    }


}
