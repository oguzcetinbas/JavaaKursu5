package Gun05;

import java.util.Scanner;

public class _01_JavaScanner {
    public static void main(String[] args) {
        // tipi  adı    ilk degeri      işlem tamam bu adımı çalıştır.
        int      sayi = 0               ;


           Scanner okuyucu = new Scanner(System.in);
        // tipi     adı     yeni okuyucu (klavyeden - konsoldan)

        System.out.print("Bir sayı giriniz = ");
        sayi = okuyucu.nextInt(); // kursor sayı girişi için bekliyor.
        // rakam girilip enter a basıldıgımda değeri alıp sayı ya atıyor.

        System.out.println("sayi = " + sayi);




    }
}
