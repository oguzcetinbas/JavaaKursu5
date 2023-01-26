package Gun42;

public class _04_StringKarsilastirma {
    public static void main(String[] args) {
        //Stringlerde neden == yerine equal kullanılıyor.

        String cumle1="Bugün hava çok güzel";
        String cumle2="Bugün hava çok güzel";


        // İLKEL tipleri karşılaştırdığından 2 sinde de değerleri KARŞILAŞTIRIR.
        // ÇÜNKÜ başka bir şeyi yok.

        if (cumle1==cumle2)
            System.out.println("Cümle 1 cümle 2 ye eşit");
        else
            System.out.println("Cümle 1 cümle 2 ye eşit değil");

        if (cumle1.equals(cumle2))
            System.out.println("Cümle 1 cümle 2 ye eşit");
        else
            System.out.println("Cümle 1 cümle 2 ye eşit değil");

        // **************** Referans TİPLERDE ise durum *****
        // Scanf le ekrandan okunduğunda aşağıdaki gibi oluyor

        String cumle3=new String("Bugün hava çok güzel");
        String cumle4=new String("Bugün hava çok güzel");

        if (cumle3==cumle4)
            System.out.println("Cümle 3 cümle 4 ye eşit");
        else
            System.out.println("Cümle 3 cümle 4 ye eşit değil");

        if (cumle3.equals(cumle4))
            System.out.println("Cümle 3 cümle 4 ye eşit");
        else
            System.out.println("Cümle 3 cümle 4 ye eşit değil");


    }
}
