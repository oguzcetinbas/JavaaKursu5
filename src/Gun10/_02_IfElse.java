package Gun10;

import java.util.Scanner;

public class _02_IfElse {

    public static void main(String[] args) {

        // Girilen vize(%50) ve final(%50) notunu okuyarak ortalamayı bulunuz
        // ortalama 60 dan büyük-eşit ise geçtiniz, tebrikler yazdırınız, değilse
        // bütünlemeye kaldınız şeklinde yazdırınız.


        Scanner oku=new Scanner(System.in);

        System.out.print("Vize Notunuz giriniz = ");
        double vize= oku.nextDouble();

        System.out.print("Final notunu giriniz = ");
        double final1= oku.nextDouble();

        double ortalama=(vize+final1)/2;

        if (ortalama >= 60){
            System.out.println("Tebrikler");
        }
        else {
            System.out.println("Bütünlemeye kaldınız");
        }




    }
}
