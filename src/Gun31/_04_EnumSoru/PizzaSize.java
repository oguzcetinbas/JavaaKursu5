package Gun31._04_EnumSoru;

public enum PizzaSize {

    SMALL(100),
    MEDIUM(150),
    LARGE(200),
    ;
    int fiyat;

    PizzaSize(int fiyat) {

        this.fiyat = fiyat;
    }
}

