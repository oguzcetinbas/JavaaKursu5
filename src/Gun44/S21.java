package Gun44;

public class S21 {
    public static void main(String[] args) {

        int[] arr={1,2,3,4}; // indexler 0,1,2,3 toplamda 4 eleman 5 eleman olmadıgı için hata vericek.
        int i =0;

        do {
            System.out.println(arr[i]+" ");
            i++;

        }while (i< arr.length+1);

    }
}
