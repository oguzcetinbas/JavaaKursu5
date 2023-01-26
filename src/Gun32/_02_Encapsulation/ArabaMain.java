package Gun32._02_Encapsulation;

public class ArabaMain {
    public static void main(String[] args) {


        // Bir araba nesnesi oluşturulmak isteniyor.
        // fields(Renk, Model, MotorHacmi,KapiSayisi)
        // Bu nesnenin verilerini OOP kurallarına 
        // uygun olarak verip alınız.
        // Main de 1 tane nesne oluşturup bunu kontrol ediniz.

        Araba a2=new Araba();
        a2.setKapiSayisi(5);
        a2.setModel(2022);
        a2.setRenk("Kırmızı");
        a2.setMotorHacmi(1599);
        System.out.println("a2 = " + a2);


        Araba a1=new Araba("Beyaz",2035,1.6,4);
        System.out.println("a1 = " + a1);

        int arabaModeli=a1.getModel();

        // KURAL: genel yazılım kuralıdır.
        // bütün değişkenler private yapılır.
        // yani Kapsulleme ile kullanılır.
        // Eğer gerekiyorsa private kaldırılır.




    }
}
