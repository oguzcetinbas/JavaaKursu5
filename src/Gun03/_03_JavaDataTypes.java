package Gun03;

public class _03_JavaDataTypes {
    public static void main(String[] args) {

        int sayi; // hafızada int kadar yer ayırıyor,sadece tam sayı atılabiliyor.

        // Tam Sayılar

        byte byteDeger = 7; // -128 127 arası tutuyor
        short shortDeger = 1645; // -32000 .. 32000 arası
        int intDeger = 250000;
        long longDeger = 65464654654654L; // tam sıyalarda defaul INT


        // Ondalıklı Sayılar
        // ondalıklı sayılarda default double'dır.


        double doubleDeger = 3.1442321234; // noktadan sonra 16 hane duyarlıdır
        float floatDeger = 5.12312312312312F; // noktadan sonra 7 hane duyarlıdır.

        char basHarf = 'A';
        String isim = "Oguz";

        System.out.println("byteDeger = " + byteDeger);
        System.out.println("shortDeger = " + shortDeger);
        System.out.println("intDeger = " + intDeger);
        System.out.println("longDeger = " + longDeger);
        System.out.println("doubleDeger = " + doubleDeger);
        System.out.println("floatDeger = " + floatDeger);
        System.out.println("basHarf = " + basHarf);
        System.out.println("isim = " + isim);


    }
}
