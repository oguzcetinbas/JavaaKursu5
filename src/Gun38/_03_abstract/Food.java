package Gun38._03_abstract;

public abstract class Food {
    private String name;

    abstract public void madenIn();
    abstract public void tates();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
