package Gun10;

import java.util.Scanner;

public class _03_IfElse {

    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz = ");
        int sayi= oku.nextInt();

        if (sayi % 2 == 0){
            System.out.println("çift");
        }
        else {
            System.out.println("tek");
        }





    }
}
