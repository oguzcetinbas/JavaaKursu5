package Gun07;

import java.util.Scanner;

public class _06_Soru {

    public static void main(String[] args) {


        // tek seferde girilen bir ad soyadın (tam ad ) adını ve soyadını ayırıp
        // ayrı ayrı yazdırınız.(sadece ad ve soyad).

        Scanner oku=new Scanner(System.in);

        System.out.print("Ad Soyad = ");
        String adSoyad=oku.nextLine();

        int boslukIndex=adSoyad.indexOf(" ");
        String ad=adSoyad.substring(0,boslukIndex);
        String soyad=adSoyad.substring(boslukIndex+1);//2. indexi vermessen sonuna kadar alır.



        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);







    }
}
