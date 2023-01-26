package Gun28._04_Constructor;

public class Bankalar {

    public static void main(String[] args) {

        // Bir banka class ı tanımlayınız.
        // 3 adet field ekleyiniz.(adi, subeSayisi, kurulusYili)
        // 3 adet constructor ekleyin.
        // toString metodu oluşturun.
        // 3 tane nesne oluşturup mainde yazdırınız.

        Banka bk1=new Banka("Garanti",1995,1001);


        Banka bk2=new Banka("Yapı Kredi",1998,145);

        Banka bk3=new Banka("Finansbank",200);

        System.out.println("bk1 = " + bk1);
        System.out.println("bk2 = " + bk2);
        System.out.println("bk3 = " + bk3);






    }
}
