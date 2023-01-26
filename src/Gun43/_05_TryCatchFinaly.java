package Gun43;

public class _05_TryCatchFinaly {
    public static void main(String[] args) {

        long startTime=0;
        String str="";

        try {

            startTime=System.currentTimeMillis();
            System.out.println("Hatadan önceki kısım");
            char ilkHarf=str.charAt(0);
            System.out.println("Hatadan sonraki kısım");
                // hata olma olasılığının olduğu kodlar
        }
        catch (Exception ex){
            System.out.println("Catch bloğu çalıştı");
            // hata olduğunda yapılacaklar
        }

        finally {

            long gecenSure=System.currentTimeMillis()-startTime;
            System.out.println("Gecen süre = " + gecenSure);
            System.out.println("try-catch bloğuyla ilgili son yapılacaklar");
            // hata olsada çalışır, olmasada çalışacak kısım,bu bölüm yukarıdaki süreçle
            // olduğunu göstermek için finally içinde yazılır.
        }


        System.out.println("Diğer çalışan kodlar");

        System.out.println("Program sonu");



    }
}
