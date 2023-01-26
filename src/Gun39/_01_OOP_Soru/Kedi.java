package Gun39._01_OOP_Soru;

public class Kedi extends Hayvan{


    public Kedi(String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    public void yiyecegi() {
        System.out.println("Yaş mama yerler");
    }

    @Override
    public void yemekMiktari() {
        System.out.println("100 gr");
    }

    @Override
    public void gunlukUykuSuresi() {
        System.out.println("16 saat");
    }

    @Override
    public void sesi() {
        System.out.println("Miyav");
    }
}
