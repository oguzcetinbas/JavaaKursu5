package Gun39._05_OOP_Soru;

public class Palov implements IFood{

    @Override
    public void taste() {
        System.out.println("Türkiyenin en çok yenilen yemeği");
    }

    @Override
    public double ucret() {
        return 30;
    }

    void fry(){
        System.out.println("Pirinçler kavruldu");
    }
    void boil(){
        System.out.println("Altı kısık şekilde demlenmeye bırakıldı");
    }
}
