package Gun34._02_Ornek2;

public class Okul {
    public static void main(String[] args) {

        LiseOgrencisi lo1=new LiseOgrencisi("ismet temur", OgrTip.LISE,"SAYISAL");
        LiseOgrencisi lo2=new LiseOgrencisi("etkin baz", OgrTip.LISE,"SÖZEL");
        IlkokulOgrencisi lo=new IlkokulOgrencisi("Oguz çetinbaş", OgrTip.ILK,"Stranç");

        System.out.println("lo1 = " + lo1);
        System.out.println("lo2 = " + lo2);
        System.out.println("lo = " + lo);




    }
}
