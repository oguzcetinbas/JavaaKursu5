package Gun20;

import java.util.Scanner;

public class _02_JavaMethod {

    public static void main(String[] args) {

        // Kullanıcının gireceği 2 sayıdan büyük olanını bulma işlemini bir metodda
        // yaptıktan sonra main de yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("1.Sayiyi giriniz = ");
        int sayi1= oku.nextInt();
        System.out.print("2.Sayiyi giriniz = ");
        int sayi2= oku.nextInt();

        int enb=enbBul(sayi1,sayi2);
        System.out.println("enb = " + enb);


    }

    public static int enbBul(int sayi1,int sayi2){
        // 1. Yöntem

//        int donecek=0;
//
//        if (sayi1>sayi2)
//            donecek=sayi1;
//        else
//            donecek=sayi2;
//
//        return donecek;

        // 2.Yöntem

       // return sayi1>sayi2 ? sayi1 : sayi2;

        // 3.Yöntem

        if (sayi1>sayi2)
            return sayi1;
        else
            return sayi2;


    }




}
