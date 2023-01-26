package Gun07;

public class _13_StringReplaceAll {
    public static void main(String[] args) {

        // relaceAll : replace gibi çalışır.Farkı kriter(regex)
        // Regex : regular Expression / düzenli ifadeler

        // TODO (yapılacak) : ödev : regex olarak neler yazılabiliyor google dan araştırılacak

        String text="Merhaba Dünya123";

        System.out.println("text = " + text);// orjinal hali
        System.out.println("text.replaceAll() = " + text.replaceAll("[abn]","*"));
        // a veya b veya n leri _ yap -> Merh___ Dü_y_123

        System.out.println(" A-Z -> _ = " + text.replaceAll("[A-Z]","_"));
        // A dan Z ye kadar büyük harfleri _ yap
        System.out.println(" 0-9 -> _ = " + text.replaceAll("[0-9]",""));
        // rakamları sil

        System.out.println(" 0-9  dışındakiler -> _ = " + text.replaceAll("[^0-9]",""));
        // rakamları dışındakileri sil 123




    }
}
