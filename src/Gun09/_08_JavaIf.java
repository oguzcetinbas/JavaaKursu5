package Gun09;

import java.util.Scanner;

public class _08_JavaIf {

    public static void main(String[] args) {

        // Kullanıcının 2 kez gireceği şifresinin aynı olduğunu
        // AYNI veya DEĞİL şeklinde cevaplayınız.


        Scanner oku = new Scanner(System.in);

        System.out.print("Şifrenizi girinizi = ");
        String password = oku.nextLine();

        System.out.print("Şifrenizi tekrarlayınız = ");
        String pasword2 = oku.nextLine();


        if (password.equals(pasword2)) {
            System.out.println("AYNI");
        }

        if (!password.equals(pasword2)) {
            System.out.println("HAYIR");
        }


    }
}
