package Gun19;


import java.util.Arrays;

public class _08_JavaMethod {

    public static void main(String[] args) {

        // 20 elemanlı bir dizinin elemanlarını 100 kadar random sayılarla
        // bir fonksiyonda doldurunuz ve aynı fonksiyonda yazdırınız.

        int[] dizi=new int[20];

        diziYazdir(dizi);

    }

    public static void diziYazdir(int[] dizi){

        for (int i = 0; i < dizi.length; i++) {
            dizi[i]=(int)(Math.random()*100);

        }

        System.out.println("Sayilar = " + Arrays.toString(dizi));


    }
}
