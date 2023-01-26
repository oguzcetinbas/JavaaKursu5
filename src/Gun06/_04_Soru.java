package Gun06;

import java.util.Scanner;

public class _04_Soru {

    public static void main(String[] args) {

        // girilen bir stringin son harfini yazdırınız.


        Scanner oku=new Scanner(System.in);
        System.out.print("Bir String giriniz = ");
        String okuStr= oku.nextLine();

        int uzunluk=okuStr.length();
        char sonHarf=okuStr.charAt(uzunluk-1);

        System.out.println("sonHarf = " + sonHarf);

        System.out.println("Son Harf = "+ okuStr.charAt(okuStr.length()  -1));








    }
}
