package Gun32._01_Encapsulation;

public class Kisi {

    private String ad;
    private String soyad;
    private int yas;

    void yasAta(int yas) {
        if (yas > 0 && yas < 150)
            this.yas = yas;
        else
            System.out.println("Hatali Yaş");
    }

    int yasVer(){
        return this.yas;
    }

    void setSoya(String soyad){

        if (soyad.length()<25){
            this.soyad=soyad;
        }else {
            System.out.println("Hatali Soyad");
        }
    }

    String getSoyad(){
        return this.soyad;
    }

    void setAd(String ad){
        if (ad.length()<25){
            this.ad=ad;
        }else {
            System.out.println("Hatalı ad");
        }
    }

    String getAd(){
        return this.ad;
    }


    @Override
    public String toString() {
        return "Kisi{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                '}';
    }
}
