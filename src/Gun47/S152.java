package Gun47;

public class S152 {
    public static void main(String[] args) {

        int n[][]={{1,3},{2,4}};

        for (int i = n.length-1; i >=0 ; i--) { // i : önce 1 i sonra 0 ı aşağıya göndericek

            for (int y : n[i]){ //  önce n[i] oluşuyor sonra n[0] yazdırıyor.

                System.out.println(y);
            }
        }
    }
}
