package Gun37.InterfaceOdev;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {

        Swallow s1=new Swallow("Cici","Benekli");
        Cat cat1=new Cat("Miro","Smokin");
        Shark shark1=new Shark("Cesur","Büyük Beyaz");
        Duck duck1=new Duck("Dufy","Muscovy ");

        ArrayList<Animals> animals=new ArrayList<>();
        animals.add(s1);
        animals.add(cat1);
        animals.add(shark1);
        animals.add(duck1);

        for (Animals a : animals){
            System.out.println("-----------------------------");
            System.out.println(a.getClass().getSimpleName());
            System.out.println("-----------------------------");
            System.out.println("İsim = "+a.getIsim());
            System.out.println("Cinsi = "+a.getCins());
            if (a instanceof Swallow){
                System.out.println(((Swallow)a).food());
                System.out.println(((Swallow)a).fly());
            }else
                if (a instanceof Cat){
                    System.out.println(((Cat)a).food());
                }else
                    if (a instanceof Shark){
                        System.out.println(((Shark)a).food());
                        System.out.println(((Shark)a).sailing());
                    }else
                        if (a instanceof Duck){
                            System.out.println(((Duck)a).food());
                            System.out.println(((Duck)a).sailing());
                            System.out.println(((Duck)a).fly());
                        }
        }




    }
}
