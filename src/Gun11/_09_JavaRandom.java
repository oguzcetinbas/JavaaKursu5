package Gun11;

import java.util.Scanner;

public class _09_JavaRandom {

    public static void main(String[] args) {

        // Girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışnız
        // kullanıcı bilirse tebrikler yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi siniri = ");
        int sinir= oku.nextInt();

        int tutSayi= (int)(Math.random()*(sinir+1));

        System.out.print("tahmin = ");
        int tahmin= oku.nextInt();

        if (tutSayi==tahmin){
            System.out.println("Tebrikler");
        }
        else {
            System.out.println("Bilemediniz");
        }

        System.out.println((tutSayi==tahmin) ? "tekbrikler" : "bilemediniz");
        System.out.println("tutSayi = " + tutSayi);






    }
}
