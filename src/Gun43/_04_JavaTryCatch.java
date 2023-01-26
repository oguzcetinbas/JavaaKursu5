package Gun43;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _04_JavaTryCatch {
    public static void main(String[] args) {

        System.out.println("Program başladı");

        try {

            Scanner oku = new Scanner(System.in);

            System.out.print("Sayi1 = ");
            int sayi1 = oku.nextInt();

            System.out.print("Sayi2 = ");
            int sayi2 = oku.nextInt();
            int bolum = sayi1 / sayi2;
            System.out.println("Bölüm = " + bolum);

//            String kelime=""; // genel hataya düşmesi için yapıldı
//            kelime.charAt(3);

        }catch (InputMismatchException ex){ // Belirli bir hata
            System.out.println("Lütfen sayı giriniz");
        }
        catch (ArithmeticException ex){ // belirli bir hata
            System.out.println("Sıfıra bölme hatası");
        }

            catch (Exception ex){ // yukarıdakilerin dışında hatalar için (GENEL HATA)
            System.out.println("Hata oluştu " + ex.getMessage());
        }

        System.out.println("Program bitti");

    }
}



