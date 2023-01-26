package Gun24;

import java.util.*;

public class _04_JavaMap {

    public static void main(String[] args) {

        Map<Integer,String> hm=new HashMap<>();
        hm.put(9,"tilki");
        hm.put(2,"kedi");
        hm.put(30,"köpek");
        hm.put(11,"kuş");
        hm.put(4,"kurt");
        System.out.println("hm = " + hm); // hızlı çalışmak için,kendisine göre sıralar.


        HashMap<Integer,String> lhm=new LinkedHashMap<>(); // MAP lerden LinkedHashMap
        lhm.put(9,"tilki");
        lhm.put(2,"kedi");
        lhm.put(30,"köpek");
        lhm.put(11,"kuş");
        lhm.put(4,"kurt");
        System.out.println("lhm = " + lhm); // Eklendiği sıraya göre sıralar.


        Map<Integer,String> tm=new TreeMap<>();// MAP lerden TreeMap
        tm.put(9,"tilki");
        tm.put(2,"kedi");
        tm.put(30,"köpek");
        tm.put(11,"kuş");
        tm.put(4,"kurt");
        System.out.println("tm = " + tm); // Her zaman sıralı KEY e göre,Kendinden sortlu.



    }
}
