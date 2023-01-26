package Gun37.InterfaceOdev;

public class Swallow extends Animals implements IFyling{


    public Swallow(String isim, String cins) {
        super(isim, cins);
    }

    @Override
    public String food() {
        return "Genelde böcek yerler";
    }

    @Override
    public String fly() {
        return "Alçaktan uçar";
    }
}
