package Gun47;

public class MyField {
    int x;
    int y;

    public void doStuff(int x , int y){
        x=x; // parametreyi parametreye atadın nesnenin kendi x i değişmedi 0 olur.
        y=this.y; // nesnenin y değişti mi ? HAYIR değişmesi 0 kaldı
    }
    public void display(){
        System.out.println(x+" "+y+" : ");
    }

    public static void main(String[] args) {
        
        MyField m1=new MyField();
        m1.x=100;
        m1.y=200;

        MyField m2=new MyField();
        m2.doStuff(m1.x,m1.y);
        m1.display();
        m2.display();
    }
}
