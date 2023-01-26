package Gun11;

import java.util.Scanner;

public class _04_JavaTernary {

    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi giriniz = ");
        int sayi= oku.nextInt();

        String sonuc=(sayi > 50) ? "1" : "0";

        System.out.println("sonuc = " + sonuc);







    }
}
