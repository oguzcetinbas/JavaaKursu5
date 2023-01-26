package Gun38._03_abstract;

public class YemekDunyasi {
    public static void main(String[] args) {
        Baklava b=new Baklava();
        b.setName("Baklava");
        b.madenIn();
        b.tates();

        GreekSalad g=new GreekSalad();
        g.setName("Greek Salad");
        g.madenIn();
        g.tates();

        CheeseCake c=new CheeseCake();
        c.setName("CheeseCake");
        c.madenIn();
        c.madenIn();

        SezarSalad s=new SezarSalad();
        s.setName("Sezar salad");
        s.madenIn();
        s.tates();
    }
}
