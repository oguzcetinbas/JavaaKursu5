package Gun10;

import java.util.Scanner;

public class _07_IfElse {

    public static void main(String[] args) {

        // yan yana aralarında bir boslukla girilen 2 int sayının
        // birbirine eşit olup olmadığını bulunuz
        // Örn: -> 45 67 gibi.


        Scanner oku=new Scanner(System.in);
        System.out.print("Sayilari bir bosluk olarak giriniz = ");
        String sayi= oku.nextLine();

        int boslukIndex=sayi.indexOf(" ");
        String strSayi1=sayi.substring(0,boslukIndex);
        String strSayi2=sayi.substring(boslukIndex+1);

        int sayi1=Integer.parseInt(strSayi1);
        int sayi2=Integer.parseInt(strSayi2);

        if (sayi1==sayi2){
            System.out.println("Sayilar Eşittir");
        }
        else{
            System.out.println("Değil");
        }





    }
}
