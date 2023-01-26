package Gun12;

import java.util.Scanner;

public class _03_IfElseIf {

    public static void main(String[] args) {

        // Soru : Kullanıcıdan  Fizik:90   şeklinde not bilgisini alınız.
        // >= 90 için A
        // >= 80 için B
        // >= 70 için C
        // >= 60 için D
        // >= 40 için E
        // < 40 için F yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Ders notu = ");
        String not = oku.nextLine();

        int ogrenciNot = Integer.parseInt(not.replaceAll("[^0-9]", ""));
        String ders = not.replaceAll("[0-9]", "");

        System.out.println("Ogrenci Notu = " + ogrenciNot);
        System.out.println("Ders adı = " + ders);

        if (ogrenciNot >= 90) {
            System.out.println("A");
        } else {
            if (ogrenciNot >= 80) {
                System.out.println("B");
            } else {
                if (ogrenciNot >= 70) {
                    System.out.println("C");
                } else {
                    if (ogrenciNot >= 60) {
                        System.out.println("D");
                    } else {
                        if (ogrenciNot >= 40) {
                            System.out.println("E");
                        } else {
                            System.out.println("Kaldınız F ");
                        }
                    }
                }
            }
        }


    }
}
