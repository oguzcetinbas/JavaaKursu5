package Gun37.InterfaceOdev;

public class Cat extends Animals implements IAnimal{

    public Cat(String isim, String cins) {
        super(isim, cins);
    }

    @Override
    public String food() {
        return "Islak mama yemeyi çok seveler";
    }
}
