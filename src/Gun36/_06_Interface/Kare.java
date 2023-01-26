package Gun36._06_Interface;

public class Kare implements ICevresi {


    @Override
    public void alan(int kisaKenar, int uzunKenar) {
        System.out.println(("Kare alanı = " + kisaKenar + uzunKenar));

    }

    @Override
    public void cevre(int kisaKenar, int uzunKenar) {
        System.out.println(("Kare cevresi = " + (kisaKenar + uzunKenar) * 2));


    }


}
