package Gun38._02_abstract;

public abstract class Sekil {
    private String name;

    abstract double alan(); // Soyut - abstract
    abstract double cevre(); // Soyut

    public void ciz(){ // Somut
        System.out.printf(name+" isimli şekil çizildi");
    }

    @Override
    public String toString() {
        return "Sekil{" +
                "name='" + name + '\'' +
                "alan='" + alan() + '\'' +
                "cevre='" + cevre() + '\'' +
                '}';
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
