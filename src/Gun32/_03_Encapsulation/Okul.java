package Gun32._03_Encapsulation;

import java.util.ArrayList;

public class Okul {

    private String okulAd;
    private static int kontenjan;
    private static ArrayList<Ogrenci> ogrenciler = new ArrayList<>();

    public Okul(String okulAd, int kontenjan) {
        setOkulAd(okulAd);
        setKontenjan(kontenjan);
    }

    public String getOkulAd() {
        return okulAd;
    }

    public void setOkulAd(String okulAd) {
        this.okulAd = okulAd;
    }

    public int getKontenjan() {
        return kontenjan;
    }

    public void setKontenjan(int kontenjan) {

        Okul.kontenjan = kontenjan;
    }

    public ArrayList<Ogrenci> getOgrenciler() {
        return ogrenciler;
    }

    public void setOgrenciler(ArrayList<Ogrenci> ogrenciler) {
        Okul.ogrenciler = ogrenciler;
    }
    public static void ogrenciEkle(Ogrenci ogrenci) {
        if (ogrenciler.size() < kontenjan && ogrenci.getYas() <= 15) {
            ogrenciler.add(ogrenci);
            System.out.println(ogrenci.getAd() + " " + ogrenci.getSoyad() + " isimli öğrenci okula eklendi.");
        } else {
            System.out.println("Öğrenci eklenemiyor,öğrencinin yaşı 15'ten büyük.");
        }

    }

    @Override
    public String toString() {
        return "Okul{" +
                "okulAd='" + okulAd + '\'' +
                '}';
    }
}


