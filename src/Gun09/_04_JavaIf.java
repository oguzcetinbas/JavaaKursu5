package Gun09;

import java.util.Scanner;

public class _04_JavaIf {

    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);

        System.out.print("Bir sayı giriniz = ");
        int sayi= oku.nextInt();

        int kalan=sayi % 2;

        if (sayi != 0 ){

            System.out.println("Sayı Tek");
        }

        if ( sayi == 0 ){

            System.out.println("Sayı çift");
        }






    }
}
