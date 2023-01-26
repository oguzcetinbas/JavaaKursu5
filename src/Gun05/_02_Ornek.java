package Gun05;

import java.util.Scanner;

public class _02_Ornek {
    public static void main(String[] args) {

        // Girilen bir adı ekrana yazdırınız.

        Scanner okuyucu=new Scanner(System.in);

        System.out.print("Adinizi giriniz = ");
        String ad=okuyucu.next(); // next() bir kelime okuyor.

        System.out.println("ad = " + ad);

        /*

        okuyucu.next() -> bir kelime okur
        okuyucu.nextLine() -> satırın tümünü okur.
        okuyucu.nextInt() -> int degeri okumak için
        okuyucu.nextShort() -> short degeri okumak için
        okuyucu.nextByte() -> byte degerleri okumak için
        okuyucu.nextFloat() -> float degeri okumak için
        okuyucu.nextDouble() - > double degeri okumak için
        okuyuc.nextLong() - > long degerleri okumak için
        okuyucu.nextBoolean() - > true veya false girişi için

        */


    }
}
