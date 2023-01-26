package Gun39._05_OOP_Soru;

public class TechnoKitchen {

    public static void hazirla(IFood food) {
        System.out.println(food.getClass().getSimpleName());
        if (food instanceof AdanaKebap) {
            MyFunc.Bekle(2);
            ((AdanaKebap) food).marinade();
            MyFunc.Bekle(2);
            ((AdanaKebap) food).grill();
            MyFunc.Bekle(2);
            ((AdanaKebap) food).taste();
            MyFunc.Bekle(2);
        }else
            if (food instanceof Lahmacun){
                MyFunc.Bekle(2);
                ((Lahmacun)food).dough();
                MyFunc.Bekle(2);
                ((Lahmacun)food).addMeat();
                MyFunc.Bekle(2);
                ((Lahmacun)food).bake();

            }else
                if (food instanceof Borsh){
                    MyFunc.Bekle(2);
                    ((Borsh)food).boil();
                    MyFunc.Bekle(2);
                    ((Borsh)food).eatTomorrow();
                    MyFunc.Bekle(2);
                }else
                    if (food instanceof Palov){
                        MyFunc.Bekle(2);
                        ((Palov)food).fry();
                        MyFunc.Bekle(2);
                        ((Palov)food).boil();
                        MyFunc.Bekle(2);
                        ((Palov)food).taste();
                        MyFunc.Bekle(2);
                    }
    }


}
