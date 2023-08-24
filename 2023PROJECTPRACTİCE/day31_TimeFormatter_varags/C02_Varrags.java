package day31_TimeFormatter_varags;

public class C02_Varrags {
    public static void main(String[] args) {

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;

        ikiSayiYazdir(sayi1, sayi2, sayi3);

    }

    private static void ikiSayiYazdir(int sayi1, int sayi2, int sayi3) {
        System.out.println("Verilen iki sayinin toplami:" + (sayi1+sayi2+sayi3));
    }
}
