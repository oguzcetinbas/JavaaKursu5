package Gun07;

public class _10_StringToUpperCase {

    public static void main(String[] args) {

        // ToUpperase : Stringi büyük harfe çevirir



        String text="Merhaba Dünya";
        System.out.println("Orjinal Hali = " + text );
        System.out.println("text.toUpperCase() = " + text.toUpperCase());

        System.out.println("me veya ME ile başlıyor mu = "+ text.toUpperCase().startsWith("ME"));




    }
}
