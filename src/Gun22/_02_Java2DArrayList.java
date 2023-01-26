package Gun22;

import java.util.ArrayList;

public class _02_Java2DArrayList {

    public static void main(String[] args) {

        int sayi = 5; // tek bir rakam tutabilen bir değişken.
        int[] dizi = new int[20]; // 20 adet sayı saklayabilen bir değişken.uzunluğu sabit.
        int[][] tablo = new int[20][2];// 20 x 2 lik kadar sayı saklayabilen değişken.uzunluğu sabit.

        ArrayList<Integer> liste = new ArrayList<>();// istenildiği kadar sayı eklenebilen,uzunluğu değişken

        // Bir sınıf bu sınıfta 20 kişi var ve bunların 3 dersi olsun.Öğrencilerin bu 3 derse ait
        // notlarını nasıl bir değişkende saklayabilirim.

        ArrayList<Integer> matNolari = new ArrayList<>();
        ArrayList<Integer> fizNolari = new ArrayList<>();
        ArrayList<Integer> kimNolari = new ArrayList<>();


        matNolari.add(50);
        matNolari.add(70);
        matNolari.add(80);

        fizNolari.add(30);
        fizNolari.add(40);

        kimNolari.add(60);
        kimNolari.add(70);
        kimNolari.add(80);
        kimNolari.add(90);

        // ArrayList in ArrayList i ni nasıl tanımlarım.

        ArrayList<ArrayList<Integer>> notlarListesi = new ArrayList<>(); // Listlerin listesi
        notlarListesi.add(matNolari);
        notlarListesi.add(fizNolari);
        notlarListesi.add(kimNolari);

        notlarListesi.get(0); // -> matNotlarını verir
        int matBirNot = notlarListesi.get(0).get(0); // mat notlarının ilkini aldım.

        System.out.println("notlarListesi.get(0) = " + notlarListesi.get(0));// Mat
        System.out.println("notlarListesi.get(1) = " + notlarListesi.get(1));// fizik
        System.out.println("notlarListesi.get(2) = " + notlarListesi.get(2));// kimya

        // yukarıdakinin yerine for döngüsü nasıl kullanılır.

        for (int i = 0; i < notlarListesi.size(); i++) {
            System.out.println("notlarListesi.get(i) = " + notlarListesi.get(i));

        }

        //******** satır sütun yazdırma *****//

        for (int i = 0; i < notlarListesi.size(); i++) { // i satırlar,j stünları gösterir

            for (int j = 0; j < notlarListesi.get(i).size(); j++) {
                System.out.println(notlarListesi.get(i).get(j)+"\t");

            }
            System.out.println();
        }


    }
}
