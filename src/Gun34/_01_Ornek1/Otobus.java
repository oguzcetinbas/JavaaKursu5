package Gun34._01_Ornek1;

public class Otobus extends Arac {

    private int yolcuKapasitesi;


    public int getYolcuKapasitesi() {
        return yolcuKapasitesi;
    }

    public void setYolcuKapasitesi(int yolcuKapasitesi) {
        this.yolcuKapasitesi = yolcuKapasitesi;
    }

    public String toString() {
        return "Arac{" +
                "renk='" + getRenk()+ '\'' +
                ", motorHacmi=" + getMotorHacmi() +
                ", marka='" + getMarka()+ '\'' +
                "yolcu kapasitesi = "+ getYolcuKapasitesi()+
                '}';
    }

    public Otobus(String renk, double motorHacmi, String marka, int yolcuKapasitesi) {
        super(renk, motorHacmi, marka);
        setYolcuKapasitesi(yolcuKapasitesi);



    }
}
