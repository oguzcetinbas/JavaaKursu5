package Gun16;

public class _05_JavaArray {

    public static void main(String[] args) {

        // 5 tv kanalı ismini bir diziye doldurunuz.
        // Daha sonra random olarak bir tanesini seçip ekrana seçileni yazıdırnız.

        String[] tvKanali={"trt","kanald","atv","fox","habertürk"};

        int sec=(int)(Math.random()*tvKanali.length);



          System.out.println("tvKanali = " + tvKanali[sec]);



        // TODO : günün sorusu : bir döngü ile 5 tane buldurunuz
        // TODO : fakat bir bulduğunu tekrar bulmasın



    }
}
