package Gun12;

import java.util.Scanner;

public class _05_Switch {

    public static void main(String[] args) {

        // daha önce çözdüğünüz hesap makinesi sorusunuz
        // switch ile çözünüz.

        Scanner oku=new Scanner(System.in);
        System.out.print("1.Sayı = ");
        int sayi1= oku.nextInt();

        System.out.print("2.Sayı = ");
        int sayi2= oku.nextInt();

        System.out.println("Toplama için T");
        System.out.println("Çıkarma için Ç");
        System.out.println("Çarpma için P");
        System.out.println("Bölme için B");

        System.out.print("Lütfen seçiniz = ");

        Scanner str=new Scanner(System.in);
        String strOku= str.nextLine();

        switch (strOku.toUpperCase()){
            case "T": System.out.println("Toplama işlemi = " + (sayi1+sayi2));break;
            case "Ç": System.out.println("Çıkarma İşlemi = "+ (sayi1-sayi2));break;
            case "P": System.out.println("Çarpma İşlemi = "+ (sayi1*sayi2));break;
            case "B": System.out.println("Bölme İşlemi = "+ ((double)sayi1/sayi2));break;
            default: System.out.println("Hatalı seçlim");
        }






    }
}
