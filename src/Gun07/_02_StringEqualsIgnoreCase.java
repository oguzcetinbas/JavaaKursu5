package Gun07;

public class _02_StringEqualsIgnoreCase {

    public static void main(String[] args) {

        // equals ile aynı çalışır sadece büyük küçük harf farketmez.


        String s1="Merhaba";
        String s2="MERHABA";

        boolean esitMi=s1.equalsIgnoreCase(s2);
        System.out.println("esitMi = " + esitMi);

        System.out.println("s1.equals(s2) = " + s1.equals(s2));// FALSE VERİR
        System.out.println("s1.equalsIgnoreCase(s2) = " + s1.equalsIgnoreCase(s2)); // TRUE VERİR









    }
}
