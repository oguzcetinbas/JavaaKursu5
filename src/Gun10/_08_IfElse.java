package Gun10;

import java.util.Scanner;

public class _08_IfElse {

    public static void main(String[] args) {


        // yan yana aralarında bir boslukla girilen 3 int sayının
        // toplamlarının sonucunun tek mi çift mi olduğunu bulunuz
        // 45 67 123

        Scanner oku=new Scanner(System.in);
        System.out.print("Yan yana girilen 3 adet sayı giriniz = ");
        String sayi= oku.nextLine();

        int boslukIndex=sayi.indexOf(" ");
        int bosluk2=sayi.lastIndexOf(" ");
        String strSayi=sayi.substring(0,boslukIndex);
        String strSayi2=sayi.substring(boslukIndex+1,bosluk2);
        String strSayi3=sayi.substring(bosluk2+1);

        int sayi1=Integer.parseInt(strSayi);
        int sayi2=Integer.parseInt(strSayi2);
        int sayi3=Integer.parseInt(strSayi3);

        if ((sayi1+sayi2+sayi3)%2==0){
            System.out.println("Çift");
        }
        else {
            System.out.println("Tek");
        }






    }
}
