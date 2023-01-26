package Gun05;

import java.util.Scanner;

public class _09_Ornek {

    public static void main(String[] args) {

        // Kullanıcıdan ağırlığını double, boyunu double olarak alınız.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazrınız.
        // vucut kıtle ındexını de bularak yazdırınız ( kg/ (boy*boy) )


        Scanner oku=new Scanner(System.in);

        System.out.print("Kilonuzu giriniz = ");
        double kilo= oku.nextDouble();

        System.out.print("Boyunuzu giriniz = ");
        int boy= oku.nextInt();

        double kitleEndex= kilo / (boy*boy);

        System.out.println("Kilonuz = " + kilo+","+"Boyunuz = "+boy);
        System.out.println("kitleEndex = " + kitleEndex);






    }
}
