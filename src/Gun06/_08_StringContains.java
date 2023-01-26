package Gun06;

public class _08_StringContains {

    public static void main(String[] args) {

        // contains : bir stringin içerisindeki karakterlerin var olup
        // olmadığını boolean cinsinden söyler. true veya false


        String cumle="Merhaba Dünya";


        boolean varMi=cumle.contains("Dün");
        System.out.println("varMi = " + varMi);



        // 2. yazdırma yöntemi
        System.out.println("varMi 2 = " + cumle.contains("a"));

        System.out.println("ya varMi = " + cumle.contains("ya"));
        System.out.println("k varMi = " + cumle.contains("k"));
        System.out.println("z varMi = " + cumle.contains("z"));











    }
}
