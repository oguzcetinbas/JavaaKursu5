package Gun30;

public class GununSorusu {

    int a;
    static int b = 0
            ; // sen bitanesin 2 tane zaten olamaz. çünkü static

    void artir() {
        a++;
        b++;
    }


    public static void main(String[] args) {

        GununSorusu gs1 = new GununSorusu();
        gs1.a = 5;

        GununSorusu gs2 = new GununSorusu();
        gs2.a = 7;

        // anın değeri kaç oldu şuanda ? Burada verilecek cevap hangi a yı soruyorsunuz olmalı.
        // Burada her nesnenin a sı var ve gs1 in 5, gs2 nin ise 7 değeri var.
        System.out.println("gs1.a = " + gs1.a);
        System.out.println("gs2.a = " + gs2.a);

        // soru b nin değeri kaçtır : tek bir değeri vardır en son değer.Çünkü statictir.
        System.out.println("GununSorusu.b = " + GununSorusu.b);

        gs1.artir();
        gs2.artir();
        // Soru a nın ve b nin en son değerleri kaçtır.

        System.out.println("gs1.a = " + gs1.a);
        System.out.println("gs2.a = " + gs2.a);
        System.out.println("Soru.b = " + GununSorusu.b);


    }


}
