package Gun07;

public class _03_StringIsEmpty {

    public static void main(String[] args) {

        // isEmpty : bir stringin içinde bir şey var mı yok mu boolean olarak verir.BOŞ MU DOLU MU


        String s1="Merhaba";

        boolean bosMu=s1.isEmpty();
        System.out.println("bosMu = " + bosMu);


        System.out.println("s1.isEmpty() = " + s1.isEmpty());// False

        String s2=" ";
        System.out.println("s2.isEmpty() = " + s2.isEmpty());// False

        String s3="";
        System.out.println("s3.isEmpty() = " + s3.isEmpty());// True









    }
}
