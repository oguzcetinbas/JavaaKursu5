package Gun46;

public class foreachDiziTablo {
    public static void main(String[] args) {

        // tek boyutlu diziler
        int[] dizi = new int[]{1, 2, 3, 4, 6};
        int[] dizi1 = {1, 2, 3, 4, 5};

        int dizi5[] = {1, 2, 3, 4, 5};

        int[] dizi2 = new int[3];
        dizi2[0] = 5;
        dizi2[1] = 5;
        dizi2[2] = 5;

        System.out.println("dizi1.length = " + dizi1.length); // dizinin eleman sayısı

        // index sırasıyla gittiği için SIRA GARANTİ
        for (int i = 0; i < dizi1.length; i++) { // dizinin uzunluğuna kadar bütün elemanları yazdırır
            System.out.println(dizi1[i] + " ");
        }
        System.out.println();
        // SIRA GARANTİ DEĞİL,normalde sıradan verir.
        for (int eleman : dizi1) { // içinde ki elemanları teker teker olarak eleman isimli değişkene
            // atar
            System.out.println(eleman + " ");
        }
        int[][] tablo1 = new int[2][3]; // standart tanımlama elemanlar sonradan tek tek atanabilir.
        tablo1[0][0] = 4;
        tablo1[0][1] = 14;
        tablo1[0][2] = 22; // 1.satır
        tablo1[1][0] = 24;
        tablo1[1][1] = 33;
        tablo1[1][2] = 12; // 2.satır

        // elemanlar verdildiğinde zaten sayı elemanlardan geldiği için boyut sayıları verilmiyor.
        int[][] tablo2 = new int[][]{
                {1, 3, 4},
                {56, 7, 8}
        };

        // newint[][] vermeden de ilk tanımlama anında elemanları verebiliriz.
        int[][] tablo6 = {
                {1, 3, 4},
                {56, 7, 8}
        };
        int[][] tablo3 = new int[2][3];
        tablo3[0] = new int[]{2, 3, 4, 5, 6}; // her bir satırın yeniden tanımlayabiliriz.
        tablo3[1] = new int[]{2, 3};

        int tablo4[][] = new int[2][3]; // köşeli parantezler değişkenin adında da olabilir.

        // tablo4 : satır sayısı 2 , her satır kendi uzunluğu var,1.satırın uzunluğu 3,2 satırın
        // uzunluğu 3
        //tablo3 : satır saıyısı 2 , 0.satırın uzunluğu 5, 1.satırın uzunluğı 2

        System.out.println("tablo3.length = " + tablo3.length);
        // tablo3 satır saıyısını verecek 2, tablonun elemanları satırlardan oluşur.
        System.out.println("tablo3[0].length = " + tablo3[0].length);//0.satırın length 5
        System.out.println("tablo3[0].length = " + tablo3[1].length);//1.satırın length 2

        for (int i = 0; i < tablo3.length; i++) { // i : 0,1

            for (int j = 0; j < tablo3[i].length; j++) {// önce tablo[0] 5 , sonra tablo[1] 2
                System.out.println(tablo3[i][j] + " "); // 0.satır için 00,01,02,03,04
                // 1.satır için 10,11
            }
            System.out.println();
        }
        System.out.println("****************");
        for (int[] satir : tablo3) { // tablo 3 elemanları satırlardan oluşuyor onlarda her biri tek boyutlu dizi

            for (int eleman : satir) { // satırın elemanları yani int yani sayı.
                System.out.println(eleman + " ");
            }
            System.out.println();
        }
        System.out.println("********************");
        for (int[] satir : tablo3) {
            //1.adımda satır 2 3 4 5 66 aşağıdaki döngü sadece 2,3ü yazar
            // 2. adımda satır 2,3      aşağıdaki döngü satırın tamamını yani 2,3 yazar
            for (int i = 0; i < tablo3.length; i++) { // tablo3.length 2 yazar
                System.out.println(satir[i]);
            }
            System.out.println();
        }


    }
}
