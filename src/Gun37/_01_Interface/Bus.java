package Gun37._01_Interface;

public class Bus extends Vehicle implements IDiesel{
    public Bus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeDisel() {
        return "100 km de benzin al";
    }

    @Override
    public String drive() {
        return "Çok ses çıkarır";
    }
}
