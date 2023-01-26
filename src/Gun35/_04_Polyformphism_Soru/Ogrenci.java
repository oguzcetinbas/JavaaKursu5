package Gun35._04_Polyformphism_Soru;

public class Ogrenci extends Okul {

    private String subesi;

    public Ogrenci(String ad, String soyAd, String gorevi, String subesi) {
        super(ad, soyAd, gorevi);
        setSubesi(subesi);
    }

    public String getSubesi() {
        return subesi;
    }

    public void setSubesi(String subesi) {
        this.subesi = subesi;
    }

    @Override
    public String toString() {
        return super.toString() + getSubesi();
    }

}
