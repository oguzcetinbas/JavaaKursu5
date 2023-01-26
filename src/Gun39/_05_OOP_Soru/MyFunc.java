package Gun39._05_OOP_Soru;

public class MyFunc {
    public static void Bekle(int sn){

        try {
            Thread.sleep(1000*sn); // ms beklediği için.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
