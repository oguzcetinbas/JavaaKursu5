package Gun14;

import java.util.Scanner;

public class _01_Break {

    public static void main(String[] args) {

        // Girilen bir sayının,2 aynı sayının çarpımına eşit olup olmadığını kontrol ediniz.


        Scanner oku = new Scanner(System.in);
        System.out.print("Sayı giriniz = ");
        int sayi = oku.nextInt();

        // 5 girildi , 5 e kadar sayıları 1,2,3,4
        // 9 girildi , 9 a kadar sayıları 1,2,3,4,5,6,7,8

        int sayac = 0;
        boolean tamKare = false;
        while (sayac < sayi) {

            if (sayac * sayac == sayi) {

                System.out.println("Tam karedir");
                tamKare = true;
                break; // sonucu bulduğunda döngüden çıkar

            }

            sayac++;
        }
        if (tamKare == false)
            System.out.println("Tam kare değildir");


    }
}
