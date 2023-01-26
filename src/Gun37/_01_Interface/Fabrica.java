package Gun37._01_Interface;

import java.util.ArrayList;

public class Fabrica {
    public static void main(String[] args) {

        teslaCar tesla=new teslaCar("Model 5",310);
        ToyotaPrius tp=new ToyotaPrius("Sedan",1200);
        Bus bus1=new Bus("Mercedes",7000);

        ArrayList<Vehicle> cars=new ArrayList<>();
        cars.add(bus1);
        cars.add(tp);
        cars.add(tesla);

        for (Vehicle vehicle : cars ) {
            System.out.println("-------------------------------");
            System.out.println(vehicle.getClass().getSimpleName()); // class ın adını verir
            System.out.println("-------------------------------");
            System.out.println("Model = " + vehicle.getModel());
            System.out.println("Engine = " + vehicle.getEngine());
            if (vehicle instanceof teslaCar){
                System.out.println(((teslaCar)vehicle).drive());
                System.out.println(((teslaCar)vehicle).changeBattery());


            }else
                if (vehicle instanceof ToyotaPrius){
                    System.out.println(((ToyotaPrius)vehicle).drive());
                    System.out.println(((ToyotaPrius)vehicle).changeBattery());
                    System.out.println(((ToyotaPrius)vehicle).changeOil());

                }else
                    if (vehicle instanceof  Bus){
                        System.out.println(((Bus)vehicle).drive());
                        System.out.println(((Bus)vehicle).changeDisel());
                    }
        }





    }
}
