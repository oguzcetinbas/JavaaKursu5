package Gun39._05_OOP_Soru;

public class Lahmacun implements IFood {

    @Override
    public void taste() {
        System.out.println("mükemmel yerli pizza");
    }

    @Override
    public double ucret() {
        return 30;
    }
    void dough()
    {
        System.out.println("mayalı hamur hazırlandı");
    }

    void addMeat()
    {
        System.out.println("özel kıyma eklendi");
    }

    void bake()
    {
        System.out.println("odun ateşinde pişirildi");
    }
}
