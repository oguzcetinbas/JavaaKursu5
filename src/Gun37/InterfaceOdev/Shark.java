package Gun37.InterfaceOdev;

public class Shark extends Animals implements ISailing,IAnimal{

    public Shark(String isim, String cins) {
        super(isim, cins);
    }

    @Override
    public String food() {
        return "Büyük balık her zaman küçük balığı yer";
    }

    @Override
    public String sailing() {
        return "Genelde okyanusun derinliklerinde yüzerler";
    }
}
