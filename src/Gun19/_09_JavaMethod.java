package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _09_JavaMethod {

    public static void main(String[] args) {

        // Kullanıcıdan 5 elemanlı bir diziyi doldurduktan sonra,
        // dizinin en küçük, en büyük elemanını ve
        // ortalamasını ayrı fonksiyonlarda bulup yazdırınız

        int[] dizi = new int[5];

        Scanner oku = new Scanner(System.in);

        for (int i = 0; i < dizi.length; i++) {
            System.out.print("Sayi Giriniz = ");
            dizi[i] = oku.nextInt();

        }

        enKucukElaman(dizi);
        enBuyukEleman(dizi);
        ortalamaBul(dizi);

    }

    public static void enKucukElaman(int[] sayilar) {

        Arrays.sort(sayilar);
        System.out.println("En küçük sayi = " + sayilar[0]);

    }

    public static void enBuyukEleman(int[] buyuk) {
        int enb = 0;

        for (int i = 0; i < buyuk.length; i++) {
            if (buyuk[i] > enb)
                enb = buyuk[i];
        }
        System.out.println("En büyük sayı = " + enb);

        //2.Yöntem

        // Arrays.sort(buyuk);
        // System.out.println("enBüyük = " + buyuk[buyuk.length-1]);


    }

    public static void ortalamaBul(int[] ortalama) {

        int toplam = 0;
        for (int i = 0; i < ortalama.length; i++) {
            toplam=toplam+ortalama[i];

        }
        System.out.println("Ortalama = " + toplam / ortalama.length);
    }

}
