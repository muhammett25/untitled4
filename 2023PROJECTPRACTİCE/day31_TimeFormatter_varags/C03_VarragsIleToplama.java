package day31_TimeFormatter_varags;

public class C03_VarragsIleToplama {
    public static void main(String[] args) {

        int sayi1 =10;
        int sayi2=20;
        int sayi3=30;
        int sayi4=40;
        int sayi5=50;

        toplaYazdir(sayi1, sayi2, sayi3, sayi4, sayi5);
        toplaYazdir(sayi1, sayi2, sayi3, sayi4);
        toplaYazdir(sayi1, sayi2,sayi3);
        toplaYazdir(sayi1, sayi2);
    }
    private static void toplaYazdir(int...sayi) {

        int toplam=0;
        int sayiAdedi=sayi.length;
        for (int each: sayi
             ) {
            toplam+=each;
        }
        System.out.println(" Girilen " + sayiAdedi + " adet sayinin toplami:" + toplam);

    }
}
