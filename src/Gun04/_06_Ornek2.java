package Gun04;

public class _06_Ornek2 {

    public static void main(String[] args) {

        // Kişinin ağırlığını double, boyunu int olarak değerler veriniz.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazrınız.
        // vucut kıtle ındexını de bularak yazdırınız ( kg/ (boy*boy))

        double kilo = 115.5;
        int boy = 181;

        double kitleEndex = kilo / (boy * boy);

        System.out.println("Boy = " + boy + " Kilo = " + kilo);
        System.out.println("kitleEndex = " + kitleEndex);





    }
}
