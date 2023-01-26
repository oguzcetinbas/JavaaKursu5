package Gun38._02_abstract;

public class Dikdortgen extends Sekil{

    private double kisaKenar;
    private double uzunKenar;

    public Dikdortgen(double kisaKenar, double uzunKenar) {
        setKisaKenar(kisaKenar);
        setUzunKenar(uzunKenar);
    }

    public double getKisaKenar() {
        return kisaKenar;
    }

    public void setKisaKenar(double kisaKenar) {
        this.kisaKenar = kisaKenar;
    }

    public double getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(double uzunKenar) {
        this.uzunKenar = uzunKenar;
    }

    @Override
    double alan() {
        return this.kisaKenar*this.uzunKenar;
    }

    @Override
    double cevre() {
        return (this.kisaKenar*this.uzunKenar)*2;
    }
}
