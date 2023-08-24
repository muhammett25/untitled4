package day20_Scope;

import java.util.Arrays;

public class C02_length {
    public static void main(String[] args) {

        int sayilar[]={1,2,3};

        String harfler[]=new String[4];
        System.out.println("sayilar arrayin uzunlugu :" + sayilar.length);

        System.out.println("harfler arrayin uzunlugu :" + harfler.length);
        System.out.println(Arrays.toString(harfler));

        System.out.println(harfler[harfler.length-1]);

        System.out.println(harfler[5]);

    }
}
