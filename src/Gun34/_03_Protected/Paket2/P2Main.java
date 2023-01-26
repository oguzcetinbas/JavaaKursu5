package Gun34._03_Protected.Paket2;

import Gun34._03_Protected.Paket1.P1Hayvan;

public class P2Main {
    public static void main(String[] args) {

        P1Hayvan p1h=new P1Hayvan();
        p1h.ad="Köpek";
        // p1h.yas default olduğu için diğer paketten ulaşılmadı.
        // p1h.cinsi protected oldugu için diğer paketten ulaşılmadı.

    }
}
