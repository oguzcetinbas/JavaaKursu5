package Gun37.InterfaceOdev;

public class Duck extends Animals implements ISailing,IAnimal,IFyling{

    public Duck(String isim, String cins) {
        super(isim, cins);
    }

    @Override
    public String food() {
        return "Genelde solucan yerler";
    }

    @Override
    public String fly() {
        return "Az da olsa uçarlar";
    }

    @Override
    public String sailing() {
        return "Yüzmeyi ve dalmayı çok severler";
    }
}
