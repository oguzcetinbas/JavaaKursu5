package Gun36._06_Interface;

public class Dikdortgen implements ICevresi {


    @Override
    public void alan(int kisaKenar, int uzunKenar) {
        System.out.println(("Dikdörtgen alan = " + kisaKenar + uzunKenar));

    }

    @Override
    public void cevre(int kisaKenar, int uzunKenar) {
        System.out.println(("Dikdörtgen çevresi = " + (kisaKenar + uzunKenar) * 2));

    }
}
