package Gun19;

import java.util.Scanner;

public class _07_JavaMethod {

    public static void main(String[] args) {

        tekMiCiftMi(55);
        tekMiCiftMi(60);

        // kullanıcıdan sayı alarak onu tekMiÇiftMi olduğunu yazdıralım.

        tekMiCiftMiOku();

    }

    public static void tekMiCiftMi(int sayi) {

        if (sayi % 2 != 0){
            System.out.println("tek");
        }
        else {
            System.out.println("çift");
        }

    }

    public static void tekMiCiftMiOku(){

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi giriniz = ");
        int sayi= oku.nextInt();

        tekMiCiftMi(sayi);

    }


}
