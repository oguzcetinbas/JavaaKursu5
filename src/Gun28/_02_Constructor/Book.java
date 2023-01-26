package Gun28._02_Constructor;

public class Book {

    String name;
    int publishYear;
    String yazar;

    public Book(){
        this("",0,"");


    }

    public Book(String name,int publishYear,String yazar){

        this.name=name;
        this.publishYear=publishYear;
        this.yazar=yazar;


    }

    public Book(String name,int publishYear){

        this(name,publishYear,"");

    }

    public String toString(){
        return name+" "+yazar+" "+publishYear;
    }
}
