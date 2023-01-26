package Gun07;

public class _07_StringStartSwith {

    public static void main(String[] args) {

        //StartSwith : bununla başlıyor mu ?
        // sonuç : true veya false verir.

        String text="HCL Teknoloji";


        boolean BasliyorMu=text.startsWith("HC");
        System.out.println("BasliyorMu = " + BasliyorMu);

        System.out.println("text.startsWith(HC) = " + text.startsWith("HC")); // True
        System.out.println("text.startsWith(te) = " + text.startsWith("te")); // False
        System.out.println("text.startsWith(h) = " + text.startsWith("h"));// False
        System.out.println("text.startsWith(Te) = " + text.startsWith("Te"));//False


    }
}
