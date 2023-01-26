package Gun08;

import java.util.Scanner;

public class _08_Soru {

    public static void main(String[] args) {

        // girilen bir sayının tek sayı olup olmadığını yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("Lütfen sayı giriniz = ");
        int sayi= oku.nextInt();

        System.out.println("Sayi tek mi ? " + ((sayi % 2) == 1));

        // 2. yöntem

        int kalan = sayi % 2; // bu 1 eşitse tekdir.
        System.out.println("kalan = " + (kalan==1));










    }
}
