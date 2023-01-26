package Gun38._02_abstract;

public class GeometriMain {
    public static void main(String[] args) {


        Dikdortgen d=new Dikdortgen(5,4);
        d.setName("Yeni Dikdörtgen");
        d.ciz();
        System.out.println("d = " + d);

        Daire dr=new Daire(4);
        d.setName("Yeni Daire");
        d.ciz();
        System.out.println("dr = " + dr);



    }
}
