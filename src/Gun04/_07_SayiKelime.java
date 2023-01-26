package Gun04;

public class _07_SayiKelime {
    public static void main(String[] args) {

        // Şu ana kadar sayilari birbirine çevirdik...
        // yazıların rakamlara çevrilmesi , rakamların yazıya çevrilmesi var.

        String ad="ismet";
        String kelimeSayi="65"; // String halde , toplama gibi bir işleme giremez.

        int sayiDeger=Integer.parseInt(kelimeSayi); // sayiya dönüşür.

        int toplam=sayiDeger+sayiDeger;

        System.out.println("toplam = " + toplam);

        // toplam şuanda int yani sayi , bunu String e nasıl dönüştürürüm ?

        String StrToplam=Integer.toString(toplam);
        System.out.println("StrToplam = " + StrToplam);






    }
}
