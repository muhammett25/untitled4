package day29_passByValue_immutable;

import java.util.Locale;

public class C05_Immutable {
    public static void main(String[] args) {

        String isim= "Mine";
        isim=isim.toUpperCase();
        System.out.println(isim);


        isim="Mevlut";
        System.out.println(isim);

        for (int i = 0; i< 10; i++) {
            isim+=".";
        }

        System.out.println(isim);

    }
}
