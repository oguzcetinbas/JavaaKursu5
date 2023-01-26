package Gun43;

public class _01_JavaException {
    public static void main(String[] args) {

        System.out.println("Program çalışmaya başladı");
        String kelime = ""; // önce ; koymadık bu compile error verir.
        char harf = kelime.charAt(3); // bu satırı en son ekledik , bu RUNTIME error verir.
        System.out.println("Program bitti");


        // daha çalışmadan önce oluşmuş eksikliklerden kaynaklı hatalara
        // Derleme zamanı yani COMPILE ERROR, Exception diyoruz.

        //program çalıştıktan sonra çalışma zamanı içerisindeki hatalara
        //çalışma zamanı yani RUNTIME ERROR, Exception diyoruz.


    }
}
