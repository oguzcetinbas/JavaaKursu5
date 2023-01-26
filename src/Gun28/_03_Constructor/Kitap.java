package Gun28._03_Constructor;

public class Kitap {

    String name;
    int publishYear;
    String yazar;

    public Kitap(){


    }

    public Kitap(String name, int publishYear, String yazar) {
        this.name = name;
        this.publishYear = publishYear;
        this.yazar = yazar;
    }

    public Kitap(String name, int publishYear) {
        this.name = name;
        this.publishYear = publishYear;
    }

    @Override
    public String toString() {
        return "Kitap{" +
                "name='" + name + '\'' +
                ", publishYear=" + publishYear +
                ", yazar='" + yazar + '\'' +
                '}';
    }
}
