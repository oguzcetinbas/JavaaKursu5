package Gun11;

import java.util.Scanner;

public class _07_JavaMath {
    public static void main(String[] args) {

        //  Math.max yöntemi ile girilen 3 sayıdan büyük olanını bulunuz


        Scanner oku=new Scanner(System.in);
        System.out.print("1. Sayıyı giriniz = ");
        int sayi1= oku.nextInt();

        System.out.print("2. Sayıyı giriniz = ");
        int sayi2= oku.nextInt();

        System.out.print("3. Sayıyı giriniz = ");
        int sayi3= oku.nextInt();


        // 1. Yöntem
        int enBuyuk1=Math.max(sayi1,sayi2);
        enBuyuk1=Math.max(enBuyuk1,sayi3);

        System.out.println("enBuyuk1 = " + enBuyuk1);


        // 2. Yöntem
        int enBuyuk=Math.max(sayi1,Math.max(sayi2,sayi3));

        System.out.println("enBuyuk = " + enBuyuk);








    }
}
