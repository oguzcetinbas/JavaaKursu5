package Gun37._01_Interface;

public class ToyotaPrius extends Vehicle implements IElektric,IGas {


    public ToyotaPrius(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {
        return "150 bin km de değiştir";
    }

    @Override
    public String changeOil() {
        return "50 bin km de yağ değişimi gerekir.";
    }

    @Override
    public String drive() {
        return "ilk 3 km elektrik ile gider";
    }
}
