package Gun05;

import java.util.Scanner;

public class _03_Ornek2 {
    public static void main(String[] args) {

        // kullanıcıdan adını ve soyadınız alarak ekrana yazdırınız.


        Scanner oku=new Scanner(System.in);// okuma işlemini yapacak olan değişken tanımlandı.

        System.out.print("Adınızı ve soy adınızı giriniz = ");// ekrana neyin girileceğini yazdık.
        String ad=oku.nextLine(); // okuma işlemi bu noktada yapılıyor.

        System.out.println("Ad Soyad = " + ad);// tekrar ekrana yazarak kontrol ettim.





    }
}
