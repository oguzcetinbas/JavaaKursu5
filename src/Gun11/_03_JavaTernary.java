package Gun11;

import java.util.Scanner;

public class _03_JavaTernary {

    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi = ");
        int sayi= oku.nextInt();

        if (sayi % 2 == 0 )
            System.out.println("çift");
        else
            System.out.println("tek");

        String sonuc = (sayi % 2 == 0) ? "çift" : "tek";

        System.out.println("Sonuc = "+sonuc);

        System.out.println((sayi % 2 == 0) ? "çift" : "tek");



    }
}
