package Gun05;

import java.util.Scanner;

public class _05_Ornek {

    public static void main(String[] args) {

        // Kullanıcıdan alacağınız 2 tam sayının toplamını ekrana yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("1.Sayi = ");
        int sayi= oku.nextInt();

        System.out.print("2.Sayi = ");
        int sayi2= oku.nextInt();

        int toplam=sayi+sayi2;

        System.out.println("toplam = " + toplam);






    }
}
