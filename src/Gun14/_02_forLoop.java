package Gun14;

public class _02_forLoop {

    public static void main(String[] args) {

        // 1 den 5 e kadar olan sayıları ekrana yazdırınız.

        // döngünün kaç kere döneceği belli olmayan durumlarda while kullanacağız.
        int i = 1 ;
        while ( i <= 5){
            System.out.println("w_i = " + i);
            i++;
        }

        // for göndüsü,başı belli,sonu belli,artışı belli ise kullanacağız.
        for (i=1; i<=5; i++){
            System.out.println("f_i = "+i);
        }
        /*
        1- Başı belli, sonu belli,
                yani kaç adım döneceği belli ve artış miktarı
        belli ise bu FOR döngüsüdür.

        2- Kaç kere döneceği belli değil ise
                (kullanıcı 0 değeri girene kadar)
        WHILE döngüsüdür.

        3-While döngüsünde döngü kontrolü işlemden sonra
        ise DO-WHILE dongusudur.
        */

    }
}
