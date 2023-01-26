package Gun06;

import java.util.Scanner;

public class _01_Ornek {

    public static void main(String[] args) {

        // Kullanıcıdan Cadde, Sokak , PostaKodu(int) ve ülke şeklinde
        // adres bilgisi alarak yazdırınız.

        Scanner okuStr=new Scanner(System.in); // String okumaları için
        Scanner okuInt=new Scanner(System.in); // int okumaları için

        System.out.print("Cadde = ");
        String cadde=okuStr.nextLine();

        System.out.print("Sokak = ");
        String sokak=okuStr.nextLine();

        System.out.print("Posta Kodu = ");
        int postaKodu=okuInt.nextInt();

        System.out.print("Ülke = ");
        String ulke=okuStr.nextLine();

        System.out.println("Adres = " + cadde+","+sokak+","+postaKodu+","+ulke);






    }
}
