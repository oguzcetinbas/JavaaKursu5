package Gun39._05_OOP_Soru;

public class Borsh implements IFood{

    @Override
    public void taste() {
        System.out.println("Rusyanın sıcak sebze çorbası");
    }

    @Override
    public double ucret() {
        return 20;
    }

    void boil(){
        System.out.println("kısık ateşte kaynatılır");
    }
    void eatTomorrow(){
        System.out.println("Güzel olması için bir gün sonra servis edilir");
    }
}
