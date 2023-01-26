package Gun43;

import java.util.Scanner;

public class _06_ThrowExample {
    public static void main(String[] args) {


        Scanner oku = new Scanner(System.in);
        System.out.println("Yeni Şifre oluşturma bölümü");

        System.out.print("Yeni şifreniz = ");
        String newPassword = oku.nextLine();

//        if (newPassword.length() < 8){
//            System.out.println("Lütfen dikkat");
//            System.out.println("Şifre en az 8 karakterden oluşmalı");
//        }
//        if (newPassword.length() > 15){
//            System.out.println("Lütfen dikkat ! ");
//            System.out.println("Şifre en fazla 15 karakterden oluşmalı");
//            // Log tutma
//        } // BÖYLEDE YAPILABİLİR FAKAT TEMİZ KOD OLMAZ HATALARDA EN İYİSİ THROW NEW KULLANMAK ÖRNEK AŞAĞIDAKİ GİBİ

        try {

            if (newPassword.length() < 8) {
                throw new Exception("Şifre en az 8 karakterden oluşmalı"); // Bu mesaj ile suni mesaj oluşturduk.
            }
            if (newPassword.length() > 15) {
                throw new Exception("Şifre en fazla 15 karakterden oluşmalı");
            }

        }catch (Exception ex){
            // hatalar bir yere toplanıp , hepsi için yapılması gereken işlemler
            // bir arada burada yapılabilir.Mesela log tutma gibi.
            System.out.println("Lütfen dikkat");
            System.out.println(ex.getMessage());
        }
    }
}