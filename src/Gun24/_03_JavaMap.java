package Gun24;

import java.util.HashMap;
import java.util.Map;

public class _03_JavaMap {

    public static void main(String[] args) {

        // Bir kartvizit uygulamasını 2 kişi için yapınız

        HashMap<String,String> uKartVizit=new HashMap<>();
        uKartVizit.put("isim","Uğur Yılmaz");
        uKartVizit.put("email","ugur@gmail.com");
        uKartVizit.put("adres","Çekmeköy/İstanbul");
        uKartVizit.put("telefon","05452341234");

        System.out.println("uKartVizit.get(isim) = " + uKartVizit.get("isim"));
        System.out.println("uKartVizit.get(telefon) = " + uKartVizit.get("telefon"));

        HashMap<String,String> aKartVizit=new HashMap<>();
        aKartVizit.put("isim","Ayse Bayrak");
        aKartVizit.put("email","ayse@gmail.com");
        aKartVizit.put("adres","Beylikdüzü/İstanbul");
        aKartVizit.put("telefon","05452366227");

        HashMap<String,HashMap<String,String>> kartVizitler=new HashMap<>();

        kartVizitler.put("uğur",uKartVizit);
        kartVizitler.put("ayse",aKartVizit);

        System.out.println("Ugurun kartviziti = " + kartVizitler.get("uğur"));
        System.out.println("Aysenin kartviziti = " + kartVizitler.get("ayse"));

        System.out.println("Aysenin adresi = " + kartVizitler.get("ayse").get("adres"));

        // foreach ile 2 kartvizitide almak.
        for (Map.Entry<String,HashMap<String,String>> kv :kartVizitler.entrySet() ){

            System.out.println("kv.getValue() = " + kv.getValue().get("email"));

        }






    }
}
