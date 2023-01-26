package Gun12;

import java.util.Scanner;

public class _02_IfElseIf {

    public static void main(String[] args) {

        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("1.Sayi =");
        int sayi1= oku.nextInt();

        System.out.print("2.Sayi = ");
        int sayi2= oku.nextInt();

        System.out.println("Toplama için T");
        System.out.println("Çıkarma için Ç");
        System.out.println("Çarpma için P");
        System.out.println("Bölme için B");

        System.out.print("Lütfen seçiniz = ");

        Scanner str=new Scanner(System.in);
        String strOku= str.nextLine();

        if (strOku.equalsIgnoreCase("T")){
            System.out.println("Toplama İşlemi = " + (sayi1+sayi2));
        }else {
            if (strOku.equalsIgnoreCase("Ç")){
                System.out.println("Çıkarma İşlemi = " + (sayi1-sayi2));
            }else {
                if (strOku.equalsIgnoreCase("P")){
                    System.out.println("Çarpma İşlemi = " + (sayi1*sayi2));
                }else {
                    if (strOku.equalsIgnoreCase("B")){
                        System.out.println("Bölme işlemi = " + (sayi1/sayi2));
                    }
                }
            }
        }







    }
}
