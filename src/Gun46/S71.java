package Gun46;

public class S71 {
    public static void main(String[] args) {

        int[][] arr = new int[2][4];

        arr[0] = new int[]{1, 3, 5, 7};
        arr[1] = new int[]{1, 3};

        System.out.println("arr.length = "+arr.length); // bana satır sayısını verecek.
        // 2 boyutlu dizilerin eleman sayısı diye incelediğimizde sayır sayısı karşımıza çıkar.Toplam
        // eleman sayısı diye değil.
        System.out.println("arr[0].length = " + arr[0].length); //0. satırın eleman sayısı 4 verir.
        System.out.println("arr[1].length = " + arr[1].length); //1. satırın eleman sayısı 2 verir.

        for (int[] a : arr) { // a burada arr nin elemanlarını yani satırlarını temsil ediyor sırayla

            for (int i = 0; i < arr.length; i++) { // arr.lenth satır sayısını,a.length ise her satırın
                // eleman sayısını temsil eder.
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }


    }
}
