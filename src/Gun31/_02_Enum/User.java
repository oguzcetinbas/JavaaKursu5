package Gun31._02_Enum;

public class User {

    enum userRolu {

        ADMIN, MUDUR, SATIS, PERSONEL
    }

    enum userStatu {

        AKTIF, PASIF
    }

    String MUDUR;
    String PERSONEL;
    String ADMIN;

    public static void main(String[] args) {

        userRolu role = userRolu.MUDUR;
        userRolu role2 = userRolu.PERSONEL;
        final userRolu admin = userRolu.ADMIN;

    }

    public void userSil() {


    }


}
