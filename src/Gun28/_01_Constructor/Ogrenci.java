package Gun28._01_Constructor;

public class Ogrenci {

    int id;
    String ad;
    String soyad;
    int sinifi;

    public Ogrenci() { // yapıcı metodlar  : Constructor metodlar
        System.out.println("nesne oluşturuldu");
    }

    public Ogrenci(int id, String ad, String soyad, int sinifi) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.sinifi = sinifi;

    }

    public Ogrenci(int id, String ad, String soyad) {
        this(id,ad,soyad,0); // this öğrenci metodunun kendisi

        //this.id = id;
//        this.ad = ad;
//        this.soyad = soyad;
//        this.sinifi=0;
    }
}
