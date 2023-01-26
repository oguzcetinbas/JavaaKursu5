package Gun32._01_Encapsulation;

public class KisiMain {
    public static void main(String[] args) {

        Kisi kisi1=new Kisi();
//        kisi1.ad="İsmet";
//        kisi1.soyad="Temur";
        //kisi1.yas=-25;
        kisi1.setAd("ismet");
        kisi1.setSoya("temur");
        kisi1.yasAta(-25);

        System.out.println(kisi1.yasVer());

        System.out.println("kisi1 = " + kisi1);

        // değişkene direk erişimi kapatıp
        // bir metod ile korumalı veri gönderme ve alma
        // işlemine Encapsulation denir.

    }
}
