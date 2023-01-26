package Gun33._01_Inheritance;

public class Personel {
    // parent , base ,super class
    private String ad;
    private String soyad;
    private int yas;
    private double maas;
    private String depertman;
    private String sicilNo;
    private String telefonNo;
    private String tcNo;

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public void bordroYazdir(){
        System.out.println("Bordro yazdırıldı.");
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public String getDepertman() {
        return depertman;
    }

    public void setDepertman(String depertman) {
        this.depertman = depertman;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }
}
