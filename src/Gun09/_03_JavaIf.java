package Gun09;

import java.util.Scanner;

public class _03_JavaIf {

    public static void main(String[] args) {

        // Girilen iki sayıdan büyük olanının değerini ekrana yazdırınız,
        // eşit ise eşit yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("Birinci sayı = ");
        int sayi1= oku.nextInt();

        System.out.print("İkicni sayı = ");
        int sayi2= oku.nextInt();

        if (sayi1 > sayi2){

            System.out.println("Sayi 1 büyüktür " + sayi1);
        }

        if (sayi2 > sayi1){

            System.out.println("Sayi 2 büyüktür " + sayi2);
        }

        if (sayi1 == sayi2){

            System.out.println("Sayılar eşittir");
        }






    }
}
