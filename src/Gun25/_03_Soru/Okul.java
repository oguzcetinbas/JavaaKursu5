package Gun25._03_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {

    public static void main(String[] args) {

        ArrayList<Ogrenci> snf = new ArrayList<>();

        Scanner okuStr = new Scanner(System.in);
        Scanner okuInt = new Scanner(System.in);

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

        for (Ogrenci ogr : snf) {

            System.out.println("ogr.ad = " + ogr.ad);
            System.out.println("ogr.soyad = " + ogr.soyAd);
            System.out.println("ogr.sinif = " + ogr.sinif);
            System.out.println("ogr.adres = " + ogr.adres);

        }
    }
}
