package Gun26._02_Soru;

public class Kampus {
    public static void main(String[] args) {

        // Bir kampus programı için asagıdaki özellikte bilgilerin
        // kaydedileceği clasları yazınız.
        // Okul :  adı, mudurAdi, ucreti(double)  -> tip
        // Ogrenci : okulNo, tamAd, okulu  -> Tip

        // bu şekilde 1 öğrenci tanımlayıp bütün bilgileri kendiniz
        // atayıp  yazdırınız.

        Ogrenci ogr=new Ogrenci();

        ogr.okulNo=1;

        ogr.tamAd="İsmet Temur";

        //1.Yöntem

        ogr.okulu=new Okul();

        ogr.okulu.adi="Mehmet Akif Ersoy okulu";
        ogr.okulu.mudurAdi="Merve Aslan";
        ogr.okulu.ucret=50000;

        //2.Yöntem

        Okul ok=new Okul();
        ok.adi="Mehmet Akif Ersoy okulu";
        ok.mudurAdi="Merve Aslan";
        ok.ucret=50000;
        ogr.okulu=ok;

        System.out.println("ogr.okulNo = " + ogr.okulNo);
        System.out.println("ogr.tamAd = " + ogr.tamAd);
        System.out.println("ogr.okulu.adi = " + ogr.okulu.adi);
        System.out.println("ogr.okulu.mudurAdi = " + ogr.okulu.mudurAdi);
        System.out.println("ogr.okulu.ucret = " + ogr.okulu.ucret);

        ogr.bilgiYazdir();



    }
}
