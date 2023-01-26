package Gun37.InterfaceOdev;

public class Animals {

    private String isim;
    private String cins;

    public Animals(String isim, String cins) {
        this.isim = isim;
        this.cins = cins;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getCins() {
        return cins;
    }

    public void setCins(String cins) {
        this.cins = cins;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "isim='" + isim + '\'' +
                ", cins='" + cins + '\'' +
                '}';
    }
}
