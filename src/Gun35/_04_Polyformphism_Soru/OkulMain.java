package Gun35._04_Polyformphism_Soru;

public class OkulMain {
    public static void main(String[] args) {

        Ogrenci ogr = new Ogrenci("Faruk", "Dal", "Öğrenci", "A");
        Calisan cal = new Calisan("Oguz", "asd", "Arastırma", "iib");

        Okul.kimlikYaz(ogr);
        Okul.kimlikYaz(cal);
    }
}

