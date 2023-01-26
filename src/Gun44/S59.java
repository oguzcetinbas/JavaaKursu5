package Gun44;

public class S59 {
    public static void main(String[] args) {

        int[] intArr={8,16,32,64,128};

        // a out of bounds hatası : runtime error
//        for (int i : intArr){
//            System.out.println(intArr[i]+" ");// foreach te [] koyulmaz.
//        }

        // b doğru
        for (int i  : intArr ){
            System.out.println(i+" ");
        }

        // e doğru

        for (int i = 0 ; i< intArr.length;i++){
            System.out.println(intArr[i]+" ");
        }



    }
}
