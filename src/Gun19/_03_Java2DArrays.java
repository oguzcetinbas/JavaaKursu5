package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _03_Java2DArrays {

    public static void main(String[] args) {

        // Günün sorusu : 3x2 lik bir diziyi kullanıcıdan sayı alarak
        // doldurduktan sonra sadece tek elemanlarını tek boyutlu bir diziye atayınız.

        Scanner oku=new Scanner(System.in);

        int[][] tablo=new int[3][2];

        int tekMik=0;
        for (int i = 0; i < tablo.length; i++) {

            for (int j = 0; j < tablo[j].length ; j++) {

                System.out.print("Sayı giriniz = ");
                tablo[i][j]= oku.nextInt();

                if (tablo[i][j] %2 == 1)
                    tekMik++;

                }
            }

        int[] teklerDizisi=new int[tekMik]; // teklerin miktarı kadar bir dizi tanımlandı.

        tekMik=0;
        for (int i = 0; i < tablo.length; i++) {

            for (int j = 0; j <tablo[j].length ; j++) {

                if (tablo[i][j] %2 != 0){
                    teklerDizisi[tekMik] = tablo[i][j];
                    tekMik++;

            }

        }

        }

        System.out.println(Arrays.toString(teklerDizisi));








    }
}
