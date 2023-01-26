package Gun26._01_Ornek;

import java.util.ArrayList;
import java.util.Scanner;

public class BordroProgrami {
    public static void main(String[] args) {

        ArrayList<Calisan> calis1 = new ArrayList<>();

        Scanner okuStr = new Scanner(System.in);
        Scanner okuInt = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {

            Calisan bilgi = new Calisan();

            System.out.print("Calisan bordroNo = ");
            bilgi.bordroNo = okuInt.nextInt();

            System.out.print("Calisan tamAdi = ");
            bilgi.tamAd = okuStr.nextLine();

            System.out.print("Calisan Maasi = ");
            bilgi.maasi = okuInt.nextInt();

            calis1.add(bilgi);

            CalisanBilgileriYazdir(calis1);
            maasOrtalamasiYazdir(calis1);
            enFazlaVeEnAzMaasi(calis1);
        }

    }

    public static void CalisanBilgileriYazdir(ArrayList<Calisan> calis1) {

        for (Calisan bilgi : calis1) {

            System.out.println("bilgi.bordroNo = " + bilgi.bordroNo);
            System.out.println("bilgi.tamAd = " + bilgi.tamAd);
            System.out.println("bilgi.maasi = " + bilgi.maasi);


        }

    }

    public static void maasOrtalamasiYazdir(ArrayList<Calisan> maas) {

        int toplam = 0;

        for (Calisan ort : maas) {

            toplam = toplam + ort.maasi;
        }

        System.out.println("Maas Ortalaması = " + toplam / maas.size());

    }

    public static void enFazlaVeEnAzMaasi(ArrayList<Calisan> enFazlaMaas) {

        int fazlaMaas = Integer.MIN_VALUE;
        String fazlaMaasAlanAdi = "";

        int azMaas = Integer.MAX_VALUE;
        String azMaasIsim = "";

        for (Calisan calisan : enFazlaMaas) {
            if (calisan.maasi > fazlaMaas) {
                fazlaMaas = calisan.maasi;
                fazlaMaasAlanAdi = calisan.tamAd;
            }
            if (calisan.maasi < azMaas){
                azMaas= calisan.maasi;
                azMaasIsim= calisan.tamAd;
            }
        }

        System.out.println("En fazla maas alan calisan = " + fazlaMaasAlanAdi);
        System.out.println("En az maas alan calisan = " + azMaasIsim);


    }


}
