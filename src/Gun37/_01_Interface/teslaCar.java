package Gun37._01_Interface;

public class teslaCar extends Vehicle implements IElektric{
    public teslaCar(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {
        return "100 bin km de battery değiştir.";
    }

    @Override
    public String drive() {
        return "Ses çıkarmadan gider";
    }
}
