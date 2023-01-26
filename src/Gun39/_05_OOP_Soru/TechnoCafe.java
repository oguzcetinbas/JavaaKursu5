package Gun39._05_OOP_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class TechnoCafe {
    public static void main(String[] args) {

        ArrayList<IFood> siparisler=new ArrayList<>();
        Scanner oku=new Scanner(System.in);

        int secim;
        do {
            menu();
            secim= oku.nextInt();
            switch (secim){
                case 1:
                    AdanaKebap ak=new AdanaKebap();
                    siparisler.add(ak);
                    break;
                case 2:
                    Lahmacun l=new Lahmacun();
                    siparisler.add(l);
                    break;
                case 3:
                    Borsh b=new Borsh();
                    siparisler.add(b);
                    break;
                case 4:
                    Palov p=new Palov();
                    siparisler.add(p);
                    break;
            }
        }while (secim<5);
        System.out.println("Alınan siparişler...");
        for (IFood f: siparisler){
            System.out.println(f.getClass().getSimpleName());
        }
        System.out.println("Siparişler Hazırlanıyor...");
        MyFunc.Bekle(2);

        double toplamUcret=0;
        for (IFood f : siparisler){
            TechnoKitchen.hazirla(f);
            MyFunc.Bekle(2);
            toplamUcret+=f.ucret();
            MyFunc.Bekle(2);
        }
        System.out.println("Toplam Ücret = " + toplamUcret);
    }

    static void menu() {
        System.out.println("\n*****Menü*****"+
                "\n1-Adana Kebap(50 TL)"+
                "\n2-Lahmacun (30 TL)"+
                "\n3-Borsh (30 TL)"+
                "\n4-Polov(20 TL)"+
                "\n5-tamam"+
                "\nSeciminiz=");

    }
}
