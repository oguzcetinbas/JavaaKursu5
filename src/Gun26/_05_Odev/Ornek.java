package Gun26._05_Odev;

public class Ornek {
    public static void main(String[] args) {


        /*
   1.Adım  :Musteri isimli (fields: name) isimli bir class tanımlayınız.
   2.Adım  :ElektrikHesabi isimli (fields : toplamTuketim(int), birimFiyat(double),
            fatura(double))  class tanımlayınız
   3.Adım  :Musteri a bir ElektrikHesabi ekleyiniz.
   4.Adım  :1 tane müşteri oluşturunuz,
   5.Adım  :Musteriye ait her ay tüketilen enerjiyi toplayacak bir metod yazınız.
            tuketimEkle olsun her verilen aylık rakamı toplayarak biriktirsin.
   6.Adım  :Ödenecek rakamı  toplam tüketimi  oran(0.7) ile çarparak hesaplatınız, yazdırınız.

   ipucu : hesabı olşuturduktan sonra tuketimEkle metoduna 2,3 ay tüketim ekletiniz, faturayı
           ondan sonra toplam alarak çıkartınız

           */


        Musteri mus1 = new Musteri();

        mus1.elkt = new ElektrikHesabi();

        mus1.name = "Oğuz";

        mus1.elkt.tuketimEkle(100);
        mus1.elkt.tuketimEkle(200);
        mus1.elkt.tuketimEkle(350);
        mus1.elkt.setToplamTuketimYaz();

        mus1.elkt.faturaYaz(mus1.name);


    }
}
