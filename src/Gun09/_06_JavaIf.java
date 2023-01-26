package Gun09;

import java.util.Scanner;

public class _06_JavaIf {

    public static void main(String[] args) {

        // Girilen bir cümlede a harfinin geçip geçmediğini
        // bulunuz geçiyor ise EVET, geçmiyor ise HAYIR yazdırınız.


        Scanner oku=new Scanner(System.in);
        System.out.print("Bir cümle giriniz =");
        String cumle=oku.nextLine();


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
