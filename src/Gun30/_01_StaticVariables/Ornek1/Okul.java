package Gun30._01_StaticVariables.Ornek1;

public class Okul {
    public static void main(String[] args) {

//        Ogrenci ogr1=new Ogrenci("ismet","temur","yıldırım ilkokulu");
//        Ogrenci ogr2=new Ogrenci("mehmet","demir","yıldırım ilkokulu");
//        Ogrenci ogr3=new Ogrenci("ayşe","yıldız","yıldırım ilkokulu");
//
//        //....
//        //....
//        Ogrenci ogr4=new Ogrenci("uğur","çolak","yıldırım ilkokulu");
        Ogrenci ogr5 = new Ogrenci("tuğser", "bayrak");
        System.out.println("ogr5 = " + ogr5);

        //Ogrenci.okulAd = "Atatürk ilkokulu";
        System.out.println("ogr5 tekrar = " + ogr5);

        // Aynı verinin çok kez girişi engellendi
        // Aynı verinin hazıfazada NESNE sayısı kadar tekrarlanması engellendi

        Ogrenci ogr2=new Ogrenci("Ali","Yildirim");
        System.out.println("ogr2 = " + ogr2);
    }
}
