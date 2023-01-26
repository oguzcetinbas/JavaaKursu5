package Gun25._04_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {

    public static void main(String[] args) {

        Scanner okuStr = new Scanner(System.in);
        Scanner okuInt = new Scanner(System.in);

        ArrayList<Ogrenci> snf = new ArrayList<>();

        for (int i = 0; i < 2; i++) {

            Ogrenci ogr = new Ogrenci();

            System.out.print("Okul no = ");
            ogr.okuNo = okuInt.nextInt();
            System.out.print("Tam Adı = ");
            ogr.tamAd = okuStr.nextLine();
            System.out.print("Notu = ");
            ogr.notu = okuInt.nextInt();

            snf.add(ogr);

        }
        bilgileriYazdir(snf);
        ortalamaYaz(snf);
    }

    public static void bilgileriYazdir(ArrayList<Ogrenci> snf) {

        for (Ogrenci ogr : snf) {
            System.out.println("ogr.okuNo = " + ogr.okuNo);
            System.out.println("ogr.tamAd = " + ogr.tamAd);
            System.out.println("ogr.notu = " + ogr.notu);
        }

    }

    public static void ortalamaYaz(ArrayList<Ogrenci> snf) {
        int toplam=0;
        for (Ogrenci ogr:snf ){

            toplam=toplam+ogr.notu;
        }
        System.out.println(" ort = " + toplam/snf.size());




    }


}
