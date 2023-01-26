package Gun38._01_abstract;

public class Ford  extends BinekOto{

    public Ford(String marka, int uretimYili, int vetesAdedi) {
        super(marka, uretimYili, vetesAdedi);
    }

    @Override
    int hizlanmaSuresi() {
        return 0;
    }
}
