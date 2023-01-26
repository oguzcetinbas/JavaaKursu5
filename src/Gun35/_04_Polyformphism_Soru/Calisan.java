package Gun35._04_Polyformphism_Soru;

public class Calisan extends Okul {

    private String departmani;

    public Calisan(String ad, String soyAd, String gorevi, String departmani) {
        super(ad, soyAd, gorevi);
        setDepartmani(departmani);
    }

    public String getDepartmani() {
        return departmani;
    }

    public void setDepartmani(String departmani) {
        this.departmani = departmani;
    }

    @Override
    public String toString() {
        return super.toString() + getDepartmani();
    }

}

