package Gun33._03_Inheritance;

public class Calisan {

    private String isim;
    private double maas;
    private double maasKatSayisi;

    public Calisan(String isim, double maas, double maasKatSayisi) {
        setIsim(isim);
        setMaas(maas);
        setMaasKatSayisi(maasKatSayisi);
    }

    public double maasHesapla() {
        return maas * maasKatSayisi;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public int getMaasKatSayisi() {
        return (int) maasKatSayisi;
    }

    public void setMaasKatSayisi(double maasKatSayisi) {
        this.maasKatSayisi = maasKatSayisi;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "isim='" + isim + '\'' +
                ", maas=" + maas +
                ", maasKatSayisi=" + maasKatSayisi +
                "Ödenecek maaş=" + maasHesapla() +
                '}';
    }
}
