package Gun15;

public class _03_JavaNestedLoop {

    public static void main(String[] args) {

        // *        1.Satırda 1 yıldız
        // **       2.satırda 2 yıldız
        // ***      3.satırda 3 yıldız
        // ****     4.satırda 4 yıldız
        // *****    5.satırda 5 yıldız

        for (int i = 1; i <=5; i++) {

            for (int j = 1; j <= i; j++)
                System.out.print("*");

            System.out.println();

        }


    }
}
