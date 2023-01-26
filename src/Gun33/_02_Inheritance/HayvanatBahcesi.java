package Gun33._02_Inheritance;

public class HayvanatBahcesi {

    //    Bir hayvanat bahçesi için bir program yazılmak isteniyor.
    //    Kediler için (renk,kilo,cinsi)
    //    kopekler için (renk,kilo, cinsi)
    //    yılanlar için renk, kilo, cinsi, uzunluk)
    //    ordek için (renk, kilo, cinsi, kanatAcikligi)
    //    bütün hayvanların konustu metodu vardır.(ses çıkardı metodu)


    public static void main(String[] args) {

        Kopek kopek1 = new Kopek("Beyaz", 50, "Kangal");
        kopek1.konustu();

        Kedi kedi1 = new Kedi("Siyah", 3, "Tekir");
        kedi1.konustu();

        Ordek ordek1=new Ordek("Siyah",3,"gövel",90);
        ordek1.konustu();

        Yilan yilan1=new Yilan("Yeşil",10,"Anakonda",5);
        yilan1.konustu();


    }
}
