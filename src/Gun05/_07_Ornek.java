package Gun05;

import java.util.Scanner;

public class _07_Ornek {

    public static void main(String[] args) {


        Scanner oku = new Scanner(System.in);

        System.out.print("Bir dikdörtgenin 1.kenar uzunluğunu giriniz = ");
        int kenar= oku.nextInt();

        System.out.print("Bir dikdörtgenin 2.kenar uzunluğunu giriniz = ");
        int kenar2= oku.nextInt();

        int cevre=kenar+kenar2+kenar+kenar2;
        int alan=kenar*kenar2;

        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);









    }
}
