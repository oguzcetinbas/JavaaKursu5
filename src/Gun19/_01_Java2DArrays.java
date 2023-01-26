package Gun19;

public class _01_Java2DArrays {

    public static void main(String[] args) {

    int[][] tablo={

            {3,4,55},
            {234,22,33}
    }; // 2 satır 3 sütun

        System.out.println("Satir uzunluğu = " + tablo.length); // Satır sayısı
        System.out.println("0.Satırın uzunluğu = " + tablo[0].length); // 0. satırın sütun uzunluğu
        System.out.println("1.Satırın uzunluğu = " + tablo[1].length); // 1. satırın sütun uzunluğu

        for (int i = 0; i < tablo.length ; i++) {

            // ilgili satırdaki sütun uzunluğu

            for (int j = 0; j <tablo[i].length ; j++) {
                System.out.print(tablo[i][j]+"\t");

            }
            System.out.println();

        }







    }
}
