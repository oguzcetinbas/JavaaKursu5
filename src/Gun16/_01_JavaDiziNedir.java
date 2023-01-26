package Gun16;

import java.util.Scanner;

public class _01_JavaDiziNedir {

    public static void main(String[] args) {

        int ogrNot; // 1 tane not saklar

        // 50 kişi var
        int ogr1Not;
        int ogr2Not;
        int ogr3Not;
        //.....
        //.....
        //.....
        int ogr50Not;

        // bana bir tanımlamada BİRDEN FAZLA değer tutabilen bir değişkene ihtiyacım var;
        // ÇÖZÜM :

        int[] notlar = new int[50]; // 50 tane int saklayabilen isimli değişken

        notlar[0] = 75;
        notlar[1] = 88;
        //...
        //...
        notlar[49] = 95; // en son eleman toplam eleman sayısı -1 böylece 0-49 arası yani 50.

        System.out.println("notlar[0] = " + notlar[0]);

        System.out.println("notlar.length = " + notlar.length); // 50 yani toplam eleman sayısı

        // Dizi nasıl okutulur.

        Scanner oku = new Scanner(System.in);
        for (int i = 0; i < notlar.length; i++) {
            System.out.print("Notu giriniz = ");
            notlar[i] = oku.nextInt();
        }

        for (int i = 0; i < notlar.length; i++){
            System.out.println(notlar[i]);
        }


    }
}
