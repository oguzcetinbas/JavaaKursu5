package Gun06;

import java.util.Scanner;

public class _06_Soru {

    public static void main(String[] args) {

        // Girilen bir ad soyadı "Ismet Temur" I.T şeklinde yazdırınız.


        Scanner oku = new Scanner(System.in);
        System.out.print("Ad soyad giriniz = ");
        String adSoyad = oku.nextLine();

        //Ismet Temur - > I.T -> I = charAt(0) I.
        //indexOf(" ") -> boşluğın indexini veriyor,bunun 1 fazlası charAt() -> T yi verir.


       char ilkHarf=adSoyad.charAt(0);
       int bosluk=adSoyad.indexOf(" ");
       char ikinciHarf=adSoyad.charAt(bosluk+1);

        System.out.println(ilkHarf+"."+ikinciHarf);



    }
}
