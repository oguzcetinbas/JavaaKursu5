package Gun39._01_OOP_Soru;

public abstract class Hayvan {

    private final int id;
    private String isim;
    private boolean vahsi;
    private String dogumTarihi;
    private static int idSayac = 1;


    public Hayvan(String isim, boolean vahsi, String dogumTarihi) {
        this.id = idSayac++;
        setIsim(isim);
        setVahsi(vahsi);
        setDogumTarihi(dogumTarihi);
    }

    abstract public void yiyecegi();
     abstract public void yemekMiktari();
     abstract public void gunlukUykuSuresi();
     abstract public void sesi();

    public int getId() {

        return id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isVahsi() {
        return vahsi;
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        System.out.print("yiyeceği = ");yiyecegi();
        System.out.print("yemek Miktarı = ");yemekMiktari();
        System.out.print("Günlük uyku suresi = ");gunlukUykuSuresi();
        System.out.print("sesi = ");sesi();


        return "Hayvan{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", vahsi=" + vahsi +
                ", dogumTarihi='" + dogumTarihi + '\'' +
                "}\n";
    }
}
