package Gun45;

public class S46 {

    public static void main(String[] args) {



        String names[] = {"Thomas","Peter","Joseph"};
        String pwd[]=new String[3];
        int idx=0;

        try {
            for (String n : names) {
                pwd[idx] = n.substring(2, 6); // 2 dahil 6 hariç 2-5 dahil alıcak
                System.out.println(pwd[idx]);
                idx++;
            }
        }catch (Exception e){
            System.out.println("Invalid Name");
        }
        // Soru 46. cevabı  Invalid Name omas null null
        for (String p:pwd){
            System.out.println(p);
        }

    }
}
