package Gun34._03_Protected.Paket1;

public class P1Main {
    public static void main(String[] args) {

        P1Hayvan p1h=new P1Hayvan();
        p1h.ad="Kara kedi"; // public erişildi.
        p1h.yas=2; // default erişildi.
        p1h.cinsi="tekir"; // protected erişildi.
        //p1h.renk; private,sadece kendi classından.

    }
}
