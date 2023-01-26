package Gun05;

import java.util.Scanner;

public class _04_Ornek {

    public static void main(String[] args) {

        // kullanıcıdan adını ve soyadını ayrı ayrı okutarak alıp birlikte ekrana yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("Adınız = ");
        String ad= oku.nextLine();

        System.out.print("Soyadınız = ");
        String soyad= oku.nextLine();

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
        System.out.println("Ad ve Soyad = " + ad+ " " + soyad);







    }
}
