package day28_StaticBlock;

public class C02_PassByValue {
    public static void main(String[] args) {
        int satisfiyati=100;
        System.out.println(indirimliFiyat(satisfiyati));
        System.out.println(satisfiyati);
        System.out.println(indirimliFiyat(satisfiyati));
    }
    public static double indirimliFiyat(double orjinalFiyat){


        double satisFiyati=orjinalFiyat*0.9;

        return satisFiyati;
    }
}
