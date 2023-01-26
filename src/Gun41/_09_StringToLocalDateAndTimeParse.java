package Gun41;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _09_StringToLocalDateAndTimeParse {
    public static void main(String[] args) {

        // Kullanıcıdan alınan ve String durumundaki time veya tarih bilgisini
        // time veya tarih bilgisine çevrilmesi

        long startTime=System.currentTimeMillis(); // kodun performansı

        Scanner oku=new Scanner(System.in);
        System.out.print("Tarih giriniz (25 01 2023) = ");
        String strTarih= oku.nextLine();

        System.out.println("strTarih = " + strTarih);

        // Kullanıcının gireceği formata göre format oluşturduk
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd MM yyyy");
        // Stringin formatı bu formata uygun olmalı.Parse ile çevirdik.
        LocalDate tarih=LocalDate.parse(strTarih,f);

        System.out.println("tarih = " + tarih.format(f));


        long finishTime=System.currentTimeMillis();
        System.out.println("GecenSure = "+(finishTime-startTime)+" sn");


    }
}
