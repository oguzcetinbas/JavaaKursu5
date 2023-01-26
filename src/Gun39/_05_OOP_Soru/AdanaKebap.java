package Gun39._05_OOP_Soru;

public class AdanaKebap implements IFood{
    @Override
    public void taste() {
        System.out.println("Kebabın en lezzetlisi");
    }

    @Override
    public double ucret() {
        return 50;
    }

    public void marinade() {
        System.out.println("Bir gün önceden baharatlar ile marine edildi");
    }

    public void grill(){
        System.out.println("Kömür ateşinde yavaş pişirildi");
    }
}
