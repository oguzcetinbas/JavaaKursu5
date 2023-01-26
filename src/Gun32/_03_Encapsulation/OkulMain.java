package Gun32._03_Encapsulation;

import java.util.Scanner;

public class OkulMain {

    //  1- fieldları ad, soyad, yas olan bir Ogrenci sınıfı tanımlayınız.
    //  2- Ogrenci sınıfına ad, soyad  ve yas dan oluşan bir consructor tanımlayınız.
    //  3- Bütün fieldlar için encapsulation uygulayınız.
    //  4- okul isimli bir class tanımlayınız, fieldları okulAd, kontenjan,
    //     ArrayList cinsinden Öğrencileri olsun.
    //  5- main metodunun olduğu OkulMain isimli bir sınıf oluşturunuz.
    //  6- bir okul nesnesi oluşturup, bu okula max öğrenci miktarına ulaşana kadar kullanıcıdan alarak
    //     öğrenci ekleyiniz. Fakat oluşturacağınız öğrencilerin yaşı 15 i geçmemeli.
    //     bu yaşı geçen bir öğrenci eklenmek istenir ise yerine başka öğrenci isteyiniz.
    //  7- Öğrencilerin hepsine eşsiz bir ID ataması yapınız.

    public static void main(String[] args) {

        Scanner okuInt = new Scanner(System.in);
        Scanner okuStr = new Scanner(System.in);

        Okul yeniOkul = new Okul("Kabataş Okulu", 3); // maxOgr 3

        do {
            System.out.print("Öğrenci adı: ");
            String ad = okuStr.nextLine();
            System.out.print("Öğrenci soyadı: ");
            String soyad = okuStr.nextLine();
            System.out.print("Öğrenci yaşı: ");
            int yas = okuInt.nextInt();
            Ogrenci ogrenci = new Ogrenci(ad, soyad, yas);
            Okul.ogrenciEkle(ogrenci);


        } while (yeniOkul.getOgrenciler().size() < yeniOkul.getKontenjan());

        for (Ogrenci ogr : yeniOkul.getOgrenciler()

        ) {
            System.out.println("ogr = " + ogr);
        }}

}

