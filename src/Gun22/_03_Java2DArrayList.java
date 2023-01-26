package Gun22;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_Java2DArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> matNolari = new ArrayList<>();
        ArrayList<Integer> fizNolari = new ArrayList<>();
        ArrayList<Integer> kimNolari = new ArrayList<>();


        matNolari.add(50);
        matNolari.add(70);
        matNolari.add(80);

        fizNolari.add(30);
        fizNolari.add(40);

        kimNolari.add(60);
        kimNolari.add(70);
        kimNolari.add(80);
        kimNolari.add(90);

        // ArrayList in ArrayList i ni nasıl tanımlarım.

        ArrayList<ArrayList<Integer>> notlarListesi = new ArrayList<>(); // Listlerin listesi
        notlarListesi.add(matNolari);
        notlarListesi.add(fizNolari);
        notlarListesi.add(kimNolari);

        // Soru 1:
        // Notları ekrana ders adlarını bir ArrayListten alarak her dersin adını ve notlarını
        // her bir satıra yazdırınız
        // Matematik : 40 50 60
        // Fizik : 30 40
        // Kimya : 70 80 90 100

        ArrayList<String> dersler=new ArrayList<>();
        dersler.add("Matematik");
        dersler.add("Fizik");
        dersler.add("Kimya");

        for (int i = 0; i <notlarListesi.size() ; i++) { // her bir derslerin tüm notları

            System.out.print(dersler.get(i)+" : ");

            for (int j = 0; j < notlarListesi.get(i).size(); j++) {

                System.out.print(notlarListesi.get(i).get(j)+"\t");

            }
            System.out.println();

        }

        // Soru 2 :
        // Kullanıcıdan istediği bir dersin nosunu alarak (0-Mat , 1-Fiz, 2-Kim)
        // Sadece istediği derse ait notları bir metodda yazdırınız.

        System.out.println("***************************");

        Scanner oku=new Scanner(System.in);
        System.out.print("(0-Mat , 1-Fiz, 2-Kim) Ders nosu seçiniz = ");
        int dersNo= oku.nextInt();

        dersNotlariniYazdir(notlarListesi,dersNo);

        // Soru 3 :
        // Yukarıda verilen derse ait not ortalamsını ve geçen sayısını bir metodda yazdırınız.

        dersOrtalamasiVeGecenMikBul(notlarListesi,dersNo);


    }
    public static void dersOrtalamasiVeGecenMikBul(ArrayList<ArrayList<Integer>> notlarListesi,int dersNo){

        int toplam=0;

        for (int i = 0; i <notlarListesi.get(dersNo).size() ; i++) {
            toplam+=notlarListesi.get(dersNo).get(i);

        }
        int ort=toplam/notlarListesi.get(dersNo).size();

        int gecenMik=0;
        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {
            if (notlarListesi.get(dersNo).get(i)>=ort)
                gecenMik++;

        }
        System.out.println("ort = " + ort);
        System.out.println("gecenMik = " + gecenMik);


    }


        public static void dersNotlariniYazdir(ArrayList<ArrayList<Integer>> notlarListesi,int dersNo){

            for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {
                System.out.print(notlarListesi.get(dersNo).get(i)+"\t");

            }


        }

    }

