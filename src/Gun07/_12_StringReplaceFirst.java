package Gun07;

public class _12_StringReplaceFirst {

    public static void main(String[] args) {

        // replaceFirst : bir stringin içindeki karakterleri verilenlerin sadece ilkini değiştirir.

        String text="Merhaba Dünya";

        System.out.println("text = " + text);
        System.out.println("text.replaceFirst(a,b) = " + text.replaceFirst("a","e")); // Merhebe Dünye
        System.out.println("text.replaceFirst(ba,de) = " + text.replaceFirst("ba","de"));// Merhade Dünya
        System.out.println("text.replaceFirst(Dünya,Java) = " + text.replaceFirst("Dünya","J a v a"));// Merhaba Java
        System.out.println("text.replaceFirst(a,'') = " + text.replaceFirst("a",""));// ilk a silindi








    }
}
