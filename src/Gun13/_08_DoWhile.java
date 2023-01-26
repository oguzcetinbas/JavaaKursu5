package Gun13;

import java.util.Scanner;

public class _08_DoWhile {

    public static void main(String[] args) {

        // Kullanıcıdan x  girilene kadar ekrana "Program çalışıyor" yazan
        // ve x girildiğinde ise "Program bitti" yazan programı yazınız

        Scanner oku=new Scanner(System.in);
        String x1="";

        do {
            System.out.print("karakter giriniz = ");
            x1= oku.nextLine();

            if (!x1.equalsIgnoreCase("x"))
              System.out.println("Program çalışıyor");

        }while (!x1.equalsIgnoreCase("x"));

        System.out.println("Program bitti");







    }
}
