package Gun16;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {

        // 50 kişilik bir sınıfın notlarını giriniz ve ortalamadan büyük
        // kaç not olduğunu bulunuz ve bunları yazdırnız.

        int[] notlar = new int[5];

        int toplam = 0;

        Scanner oku = new Scanner(System.in);

        for (int i = 0; i < notlar.length; i++) {
            System.out.print("Notları giriniz = ");
            notlar[i] = oku.nextInt();
            toplam = toplam + notlar[i];

        }

        int gecenlerinSayisi = 0;
        int ortalama = toplam / notlar.length;

        for (int i = 0; i < notlar.length; i++){

            if (notlar[i]>ortalama){
                System.out.println("ortalamadan büyük notlar"+notlar[i]);
                gecenlerinSayisi++;
            }

        }
        System.out.println("ortalama = " + ortalama);
        System.out.println("Geçenlerin Sayisi = " + gecenlerinSayisi);


    }
}
