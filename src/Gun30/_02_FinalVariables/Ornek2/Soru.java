package Gun30._02_FinalVariables.Ornek2;

import java.util.Scanner;

public class Soru {
    public static void main(String[] args) {

        // Sabitler isimli bir Class da sabit bir şekilde
        // bir gündeki saat sayısı, bir saatdaki dakika sayısı ve
        // bir dakikadaki saniye sayısını tanımlayınız.
        // mainde kullanıcıdan gun, saat, dakika alarak toplam
        // saniyeyi bulunuz.



        Scanner oku = new Scanner(System.in);

        System.out.print("Gün sayısını giriniz = ");
        int gunSayisi = oku.nextInt();
        System.out.print("Saat sayisini giriniz = ");
        int saatSayisi = oku.nextInt();
        System.out.print("Dakika sayısını giriniz = ");
        int dakikaSayisi = oku.nextInt();

        int toplamSaniye = (gunSayisi * Sabitler.gun + saatSayisi)
                * Sabitler.saat + dakikaSayisi * Sabitler.dakika;
        System.out.println("Toplam Saniye : " + toplamSaniye);

    }
}
