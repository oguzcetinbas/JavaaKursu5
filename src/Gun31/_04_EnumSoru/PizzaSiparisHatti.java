package Gun31._04_EnumSoru;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaSiparisHatti {

    // Bir pizza sipariş hattı yapılmak isteniyor.
    // Kullanıcıya Pizza için 1-Small,2-Medium,3-Large, 4-Goster
    // seçeneklerini bir menü şeklinde vererek, verdiği pizzaları
    // bir ARRAYLIST e atınız.
    // Goster (4) ü seçtiğinde her pizzadan kaçar tane sipariş
    // verdiğini bir metodda yazdırınız.

    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        ArrayList<PizzaSize> siparisler = new ArrayList<>();

        PizzaSize size = PizzaSize.SMALL;


        int secim = 0;
        do {
            // menu
            menu();
            secim = oku.nextInt();
            if (secim == 1) {
                siparisler.add(PizzaSize.SMALL);
            } else if (secim == 2) {
                siparisler.add(PizzaSize.MEDIUM);
            } else if (secim == 3) {
                siparisler.add(PizzaSize.LARGE);
            } else if (secim == 4) {
                break;
            } else {
                System.out.println("Geçersiz seçim!");
            }
            // orada hangi pizzadan kaç sipariş verdiğini göster
        } while (secim <= 4);
        siparisGoster(siparisler);
    }

    public static void menu() {
        System.out.println("******** Pizza Menü *******");
        System.out.println("1 - Small" + PizzaSize.SMALL.fiyat);
        System.out.println("2 - Medium" + PizzaSize.MEDIUM.fiyat);
        System.out.println("3 - Large" + PizzaSize.LARGE.fiyat);
        System.out.println("4 - İşleme Al-Spiariş Göster");
        System.out.println("5 - Çıkış");
        System.out.print("Seciminiz=");
    }
    public static void siparisGoster(ArrayList<PizzaSize> siparistopla) {
        int smallsayac = 0;
        int mediumsayac = 0;
        int largesayac = 0;

        for (PizzaSize abc : siparistopla) {
            if (abc.equals(PizzaSize.SMALL)) {
                smallsayac++;
            } else if (abc.equals(PizzaSize.MEDIUM)) {
                mediumsayac++;
            } else if (abc.equals(PizzaSize.LARGE)) {
                largesayac++;
            }
        }
        int toplam = 0;
        toplam=(smallsayac*PizzaSize.SMALL.fiyat)+(mediumsayac*PizzaSize.MEDIUM.fiyat)+(largesayac*PizzaSize.LARGE.fiyat);

        System.out.println("Small Pizzalar" + smallsayac);
        System.out.println("Large Pizzalar = " + largesayac);
        System.out.println("Medium Pizzalar = " + mediumsayac);

        System.out.println("Toplam = " + toplam);
    }
    }

