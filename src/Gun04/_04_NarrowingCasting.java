package Gun04;

public class _04_NarrowingCasting {

    public static void main(String[] args) {

        double oran = 3.2;
        int sayi = 5;

        sayi = (int) oran; // bu işlem bir tehlikeli işlem diyor.Bundan dolayı challenger patladı.
        // değerlere bak iye uyarı veriyor.eğer oluşan veri kaybını anladıysan
        // ve kabulün ise bunu bana bilerek yaptığını göster diyor.
        // büyük bir alanı , küçük bir alana atıyoruz.YANLIŞ.


        System.out.println("sayi = " + sayi);

        /**************************************/

        byte kisaKenar=5;
        byte uzunKenar=7;

        byte cevre=(byte) (kisaKenar+uzunKenar+kisaKenar+uzunKenar);
        // sen eşitliğin 2. tarafı rakamlar toplandı , benim için toplam burada int durumunda
        // byte cevre = 5+7+5+7;       // int bir değeri -> byte a atmaya çalışıyorsun.
        // eğer veri kaybı olmayacağından eminsen , veya veri kaybı önemli değilse,
        // bana bunu yazarak göster diyor.
        System.out.println("cevre = " + cevre);




    }
}
