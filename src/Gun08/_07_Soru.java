package Gun08;

import java.util.Scanner;

public class _07_Soru {

    public static void main(String[] args) {

        // kullanıcının gireceği 2 sayının birbirine
        // eşit mi olup olmadığını yazdırınız

        Scanner oku=new Scanner(System.in);

        System.out.print("Lütfen birinci sayı giriniz = ");
        int sayi= oku.nextInt();

        System.out.print("Lütfen ikinci sayıyı giriniz = ");
        int sayi2= oku.nextInt();

        System.out.println(" sayi 1 eşit mi sayi 2 ye ? " + (sayi == sayi2));


        // 2.yöntem

        boolean esitMi= (sayi==sayi2);
        System.out.println("esitMi = " + esitMi);



    }
}
