package Gun19;

public class _05_JavaMethod {


    // buraya metodlar yazılabilir

    public static void main(String[] args) { // ana metod,diğer metodları buradan çağıracağız.

        Math.max(5,6); // bir şeyler verilmiş,geriye değer alıyor.
        Math.random(); // veri almıyor,sadece veri verir.

        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");

        merhabaYaz(); // kullanımı kolay, çağırması kolay, tekrar tekrar kullanabilir
        merhabaYaz(); // mainin daha kolay anlaşabilir olur.
        merhabaYaz(); // fonksiyonu çağırma şekli

    }

    public static void merhabaYaz(){




        System.out.println("Method da Merhaba Dünya");

    }
    // Metodlar tekrarlayan kodlardan kurtulup bir kere yazıp sonra tekrar çağırmak için
    // ve büyük programı parçalara bölüp kod karışıklığının önüne geçmek için kullanılır.
    // temiz kod için


    // buraya metodlar yazılabilir
}
