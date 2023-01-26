package Gun21;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_ArrayList {

    public static void main(String[] args) {

        // Bir öğretmenden girmek istediği kadar notu alınız,
        // Öğretmene devam etmek istiyormusunuz (E/H) şeklinde sorunuz
        // ve ortalamayı geçen öğrenci sayısını bulunuz.

        ArrayList<Integer> notlar = new ArrayList<>();

        Scanner intOku = new Scanner(System.in);
        Scanner strOku = new Scanner(System.in);

        String devam = "";
        int toplam = 0;

        do {
            // notu girecek
            System.out.print("Notlar = ");
            int not = intOku.nextInt();
            // notları arraylist e atıcak
            notlar.add(not);
            // girlen notları topla
            toplam = toplam + not;

            // devam etmek istiyormu diye sor
            System.out.print("Devam etmek istiyorsanız E   İstemiyorsanız   H yazınız = ");
            devam = strOku.next();

        } while (devam.equalsIgnoreCase("E"));

        // ortalamayı bul
        int ortalama = toplam / notlar.size();
        // gecenlerin sayısını bul
        int gecenler = 0;
        for (int i = 0; i < notlar.size(); i++) {
            if (notlar.get(i) > ortalama) {
                gecenler++;

                System.out.println("gecenler = " + gecenler);

            }

        }


    }
}
