package Gun34._03_Protected.Paket1;

public class P1Hayvan {

    public String ad; // Her paketten , her yerden ulaşılabilir.
    int  yas;   // Sadece bulunduğu paketler ulaşabilir
    protected String cinsi; // default gibi,diğer paketlerden erişimle ilgili bir seçeneği var
    private String renk;    // bulunduğu classdan erişilebilir.
}
