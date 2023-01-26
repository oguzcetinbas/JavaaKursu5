package Gun09;

import java.util.Scanner;

public class _07_JavaIf {

    public static void main(String[] args) {

        // Girilen bir cümeledeki küçük veya büyük a harfinin olup olmadığını
        // yazdırınız VAR ve YOK şeklinde.


        Scanner oku=new Scanner(System.in);
        System.out.print("Bir cümle giriniz =");
        String cumle=oku.nextLine();

        cumle=cumle.toLowerCase(); // bütün büyük harfler küçük oldu

        // 1.Yol

        if (cumle.contains("a")){

            System.out.println("EVET");
        }

        if (!cumle.contains("a")){ // ! DEĞİLSE OLUR
            System.out.println("HAYIR");
        }


        // 2. yol

        boolean varMi=cumle.contains("a");

        if (varMi == true){
            System.out.println("EVET");
        }

        if (varMi == false){
            System.out.println("HAYIR");
        }






    }
}
