package Gun25._02_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {

        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);
        ArrayList<Ogrenci> snf=new ArrayList<>();

        for (int i = 0; i < 3; i++) {


            Ogrenci ogr = new Ogrenci();

            System.out.print("Ogrenci Adı = ");
            ogr.ad = okuStr.nextLine();

            System.out.print("Öğrenci Soyadi = ");
            ogr.soyAd = okuStr.nextLine();

            System.out.print("Öğrenci Sinifi = ");
            ogr.sinif = okuInt.nextInt();

            System.out.print("Öğrenci adresi = ");
            ogr.adres = okuStr.nextLine();

            snf.add(ogr);
        }

        for (Ogrenci ogr :snf ) {

            System.out.println("ogr.ad = " + ogr.ad);
            System.out.println("ogr.soyad = " + ogr.soyAd);
            System.out.println("ogr.sinif = " + ogr.sinif);
            System.out.println("ogr.adres = " + ogr.adres);

        }




    }
}

class Ogrenci{

    // properties , field , özellik
    String ad;
    String soyAd;
    int sinif;
    String adres;

}
