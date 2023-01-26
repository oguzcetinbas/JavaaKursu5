package Gun08;

public class _01_JavaAritmeticOperators {

    public static void main(String[] args) {

        int a=9;
        int b=5;

        System.out.println("Toplama işlemi = ");
        System.out.println("a+b => " + (a+b));

        System.out.println("Çıkartma İşlemi = ");
        System.out.println("a-b = " + (a-b));

        System.out.println("Çarpma İşlemi ");
        System.out.println("a*b sonucu " + (a*b));

        System.out.println("Bölme İşlemi");
        System.out.println("a/b sonucu " + (a/b));
        // normal sonuc 1.8 , fakat tam sayının tam sayıya bölümünde küsürat atılır.
        // bu sebeple sonuc 1 olur,yuvarlama yapmaz.Çünkü int/int
        // tam sonuç istersen bir tanesini double çevirmen yeterli.

        System.out.println("(double)a/b sonucu = " + ((double)a/b));

        System.out.println("Modül İşlemi");
        System.out.println("a % b sonucu = " + (a % b)); // 9%5 => 4
        System.out.println("b % a sonucu = " + (b % a)); // 5%9 => 5
        // Kısa önemli not !
        // Modül (%)'de
        // sol büyük ise kalanı al
        // sol küçükse solundakini direkt al.






    }
}
