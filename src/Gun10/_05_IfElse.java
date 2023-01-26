package Gun10;

import java.util.Scanner;

public class _05_IfElse {

    public static void main(String[] args) {

        // Girilen bir stringin uzunluğu 10 dan büyükse ve string içinde
        // "study" kelimesi geçiyorsa ekrana evet yazdırın değilse hayır
        // hayır yazdırınız.


        Scanner oku=new Scanner(System.in);
        System.out.print("Cumle giriniz = ");
        String cumle=oku.nextLine();

        String kucuk=cumle.toLowerCase();

        int uzunluk=cumle.length();
        boolean varMi=kucuk.contains("study");

        if (uzunluk > 10 && varMi){
            System.out.println("evet");
        }
        else {
            System.out.println("Hayır");
        }









    }
}
