package Gun25;

public class _01_JavaClassAndObject {

    // Metodların yazıldığı yer
    public static void main(String[] args) {// Başla
    // ana programın başladığı yer.
        int sayi = 5;

        Araba benimArabam=new Araba(); // araba tür,tip adı,benimArabam nesne
        benimArabam.marka="BMW";
        benimArabam.renk="Beyaz";
        benimArabam.motorHacmi=1600;
        benimArabam.yili=2000;

        System.out.println("benimArabam.yili = " + benimArabam.yili);
        System.out.println("benimArabam.renk = " + benimArabam.renk);
        System.out.println("benimArabam.marka = " + benimArabam.marka);
        System.out.println("benimArabam.motorHacmi = " + benimArabam.motorHacmi);



    }// Dur

    // Metodların yazıldığı yer
}

// class-tiplerinin tanımlandığı yer

class Araba{

    String renk;
    int yili;
    String marka;
    int motorHacmi;
}


