package Gun06;

public class _05_StringIndexOf {

    public static void main(String[] args) {
        // 01234  : harflerin oda numaraları 0 dan başlar : index denir.
        // Bugün

        String cumle="Merhaha Dünya";
        // D nin index i kaç tır.
        // M nin index i kaç tır.

        System.out.println("cumle.indexOf(M) = " + cumle.indexOf("M")); // 0
        System.out.println("cumle.indexOf(a) = " + cumle.indexOf("a")); // 4
        System.out.println("cumle.indexOf(ha) = " + cumle.indexOf("ha")); // 3
        System.out.println("cumle.indexOf( ) = " + cumle.indexOf(" ")); // 7
        System.out.println("cumle.indexOf(A) = " + cumle.indexOf("a")); // -1
        System.out.println("cumle.indexOf(a, 5) = " + cumle.indexOf("a",5));// 6
        System.out.println("Cumle.indexOf " + cumle.indexOf("y"));
        System.out.println("Cumle.indexOf 2 =  " + cumle.indexOf("y",7));
        System.out.println("index kaçtır = "+ cumle.indexOf("D"));

        System.out.println("cumle.indexOf(a,5)" + cumle.indexOf("a",5) );// 6
        // a yı aramaya 5 dahil nolu indexten başla






    }
}
