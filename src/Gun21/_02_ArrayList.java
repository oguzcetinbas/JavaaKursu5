package Gun21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _02_ArrayList {

    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        // sadece tek sayı olan elemanlarını ayrı diziye atayarak
        // yazdırınız.

        Scanner oku = new Scanner(System.in);

        int[] dizi = new int[6];

        for (int i = 0; i < dizi.length; i++) {
            System.out.print("Sayi = ");
            dizi[i] = oku.nextInt();

        }
        System.out.println(Arrays.toString(dizi));

        ArrayList<Integer> tekSayi = new ArrayList<>();
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] % 2 == 1) {
                tekSayi.add(dizi[i]);
            }

        }

        System.out.println("tekSayi = " + tekSayi);


    }


}
