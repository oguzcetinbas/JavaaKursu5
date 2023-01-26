package Gun28._02_Constructor;

public class Kitapci {
    public static void main(String[] args) {


        // Book class yazınız.fields: name,publishYear,author.
        // 3 adet Consructor ekleyiniz.
        // Kitapların özelliklerini tek bir satırda yazdıran bir metod ekleyiniz.
        // 3 adet kitabı farklı constructor la oluşturup, mainde yazdırınız.



       Book kit1=new Book();
       kit1.name="Harry Potter";
       kit1.yazar="JK Rowling";
       kit1.publishYear=1997;

       Book kit2=new Book("Yüzüklerin efendisi",1995,"JRR Tolkien");

       Book kit3=new Book("üzüm ve çay",2000);

        System.out.println("kit1 = " + kit1);
        System.out.println("kit2 = " + kit2);
        System.out.println("kit3 = " + kit3);




    }
}
