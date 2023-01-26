package Gun10;

import java.util.Scanner;

public class _04_MantiksalIfadeler {

    public static void main(String[] args) {

        // Mantıksal ifadeler
        // && ve işaretimizdir
        // || veya işaretimizdir.

        // girilen sayı pozitif ve tek ise ekrana uygun değilse
        // uygun sayı girilmedi yazınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi = ");
        int sayi= oku.nextInt();

        if (sayi%2==1 && sayi>0){
            System.out.println("uygun sayi girildi");
        }
        else {
            System.out.println("Uygun sayi GİRİLMEDİ");
        }






    }
}
