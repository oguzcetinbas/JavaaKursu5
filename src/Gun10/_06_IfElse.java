package Gun10;

import java.util.Scanner;

public class _06_IfElse {

    public static void main(String[] args) {

        // Girilen yeni bir password un kurallara uygunluğunu kontrol ediniz.
        // kurallar :
        // 1) en az 8 karakter olmalı
        // 2) içinde pass kelimesi olmamalı
        // 3) en fazla 12 karakter olmalı.

        Scanner oku=new Scanner(System.in);
        System.out.print("Şifre giriniz = ");
        String sifre= oku.nextLine();

        int uzunlukk=sifre.length();
        boolean varMi=sifre.contains("pass");

        if (uzunlukk >=8 && uzunlukk <= 12 && !varMi){
            System.out.println("Sifre uygundur");
        }
        else {
            System.out.println("Sifre geçersiz");
        }

        // İKİNCİ YÖNTEM

        if (sifre.length() >=8 && sifre.length() <=12 && !sifre.contains("pass")){
            System.out.println("uygun");
        }
        else {
            System.out.println("Uygun değil");
        }








    }
}
