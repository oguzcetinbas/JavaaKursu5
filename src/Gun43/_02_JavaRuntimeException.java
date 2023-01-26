package Gun43;

import java.util.Scanner;

public class _02_JavaRuntimeException {
    public static void main(String[] args) {

        System.out.println("Program başladı");

        for (int i = 0 ; i<3; i++) {
            try {
                Scanner oku = new Scanner(System.in);

                System.out.print("Sayi1 = ");
                int sayi1 = oku.nextInt();

                System.out.print("Sayi2 = ");
                int sayi2 = oku.nextInt();
                int bolum = sayi1 / sayi2;
                System.out.println("Bölüm = " + bolum);

            } catch (Exception hata) {
                System.out.println("Hata = " + hata.getMessage());
                System.out.println("Lütfen tekrar deneyiniz.");
                i--;
            }
        }
    }
}
