package day21_Arrays;

import java.util.Arrays;

public class C05_ArrayeElementEkleme {
    public static void main(String[] args) {

        String[] sinifListesi= {"Ali Can", "Nida Yucedal", "Musa Yaman"};
        String eklenecekisim="Murat Babayigit";

        sinifListesi=elemanEkle(sinifListesi,eklenecekisim);
        System.out.println(Arrays.toString(sinifListesi));

    }

    private static String[] elemanEkle(String[] sinifListesi, String eklenecekisim) {
        String[] yenisinifListesi= new String[sinifListesi.length+1];
        for (int i = 0; i < sinifListesi.length; i++) {
            yenisinifListesi[i]=sinifListesi[i];
        }
        yenisinifListesi[yenisinifListesi.length-1]=eklenecekisim;

        return yenisinifListesi;
    }
}
