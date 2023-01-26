package Gun35._02_Polyformphism;

public class CiftlikMain {
    public static void main(String[] args) {

        Kopek kopek1 = new Kopek("karabaş");
        //kopek1.ses(); // havladı
        //kopek1.kokladi();// kokladi

        Kedi kedi1=new Kedi("kopuk");
//        kedi1.ses();// miyavladı
//        kedi1.tirmaladi(); // tırmaladı

//        kopekSesi(kopek1); // havladı
//        kediSesi(kedi1); // miyavladı

        HayvanSesi(kopek1);// havladı
        HayvanSesi(kedi1); // miyavladı

        //Referans tipi    // nesne tipi
        Hayvan hayvan1=new Hayvan("Ördek");
        // hayvanlardan bir hayvan
        Hayvan hayvan2=new Kopek("Kangal");
        // hayvanlardan 1 köpek
        Hayvan hayvan3=new Kedi("Boncuk");
        // hayvanlardan 1 kedi

        System.out.println("-----------------");
        hayvan1.ses(); // genel hayvan ses çıkardı.
        hayvan2.ses(); // Havladı
        hayvan3.ses(); // Miyavladı

        hayvan2.ses();// kopek de olsa hayvan referansı sebebiyle metodlar kısıtlı.

        // peki bu hayvanı kopek formunu nasıl ortaya
        // çıkartırırım?
        // tip dönüşümü acaba işime yararmı ?
        ((Kopek)hayvan2).kokladi();
        //((int)Math.Random()) castin buradaki gibi,
        // tip dönüşümü gibi yaparız.

        //Setlerden HasSet
        //Maplerden HashMap
        // Listelerden ArrayList

        //        Polymorphism -
//                çok formluluk  - Çok çeşitlilik
//        şizofren bir konu
//
//        :  Bir NESNE istenildiğinde, aynı zamanda extend edildiği tür gibi davranmasına
//        ve bu şekilde kullanılabilmesine Polymorphism denir.

        // öğretmenin okulda "fizik öğretmeniyim" demesi,
        // mahallede "öğretmenim" demesi gibi.

        //  aşağıda Hayvan classından türettiğimiz-extend yaptığımız için
        //  hayvanSesi olarak eklediğimiz methoddan yazdırdığımızda da
        //  köpek ve kedi için classlarında Override yaparak yazdığımız
        //  özellikleri alarak yazdı.
        //  Ama tırmaladı , kokladı gibi kedi, köpek classına özel olarak
        //  yazdıklarımızı hayvanSesi methodunda yazdıramayız.

    }
    public static void kopekSesi(Kopek kopek){
        kopek.ses();
    }
    public static void kediSesi(Kedi kedi){
        kedi.ses();
    }

    public static void HayvanSesi(Hayvan hayvan){
        hayvan.ses();

        // bir classın aslında kim olduğunu bulma yöntemi.
        if (hayvan instanceof Kopek) // Hayvan aslında köpek mi ?
            ((Kopek)hayvan).kokladi();

        if (hayvan instanceof Kedi) // Hayvan aslında kedi mi ?
            ((Kedi)hayvan).tirmaladi();
    }
}
