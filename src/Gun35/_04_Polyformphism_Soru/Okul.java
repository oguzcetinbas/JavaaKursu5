package Gun35._04_Polyformphism_Soru;

public class Okul {
    private String ad;
    private String soyAd;
    private String gorevi;
    public Okul(String ad, String soyAd, String gorevi) {
        setAd(ad);
        setSoyAd(soyAd);
        setGorevi(gorevi);
    }
    public String getAd() {
        return ad;
    }
    public void setAd(String ad) {
        this.ad = ad;
    }
    public String getSoyAd() {
        return soyAd;
    }
    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }
    public String getGorevi() {
        return gorevi;
    }
    public void setGorevi(String gorevi) {
        this.gorevi = gorevi;
    }
    @Override
    public String toString() {
        return "Okul{" +
                "ad='" + ad + '\'' +
                ", soyAd='" + soyAd + '\'' +
                ", gorevi='" + gorevi + '\'' +
                '}';
    }
    public static void kimlikYaz(Okul gelenKisi){
        System.out.println("\n***Kimlik Belgesi***");
        System.out.println("gelenKisi.ad = " + gelenKisi.getAd());
        System.out.println("gelenKisi.soyAd = " + gelenKisi.getSoyAd());
        System.out.println("gelenKisi.gorevi = " + gelenKisi.getGorevi());
        if (gelenKisi instanceof Ogrenci){
            System.out.println("Şubesi : " + ((Ogrenci)gelenKisi).getSubesi());
        }else
            if (gelenKisi instanceof  Calisan){
                System.out.println("Departmanı : " + ((Calisan)gelenKisi).getDepartmani());
            }
    }
}
