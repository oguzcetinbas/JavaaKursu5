package Gun26._03_Ornek;

public class Ornek {
    public static void main(String[] args) {


        // 1- Adım : Person isimli bir class tanımlayınız : name, surname, age
        // 2- Adım : main de 2 tane bu sınıftan nesne oluşturup deger atayınız.
        // 3- Adım : Bu degerlerı yazıdırınız.
        // 4- Adım : getBirthYear isminde Person a ait bir metod yazınız,
        //           çalıştığında kişinin doğum yılını versin.

        Person cal1 = new Person();
        cal1.name = "Hatice";
        cal1.surName = "Demir";
        cal1.age = 28;

        Person cal2 = new Person();
        cal2.name = "Muhammed";
        cal2.surName = "Gürdal";
        cal2.age = 35;

        // Kolay yöntem Metodlu yazdirma.Classtan çağırıyoruz.
        cal1.BilgiYazdir();
        cal2.BilgiYazdir();

        // toString ile yazdırma
        System.out.println("cal1 = " + cal1);
        System.out.println("cal2 = " + cal2);

        cal1.getBirthYear();
        cal2.getBirthYear();

        cal1.getInitials();

    }
}
