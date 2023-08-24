package day21_Arrays;

import java.util.Arrays;

public class C09_Split {
    public static void main(String[] args) {
        String str="Java ne kadar guzel";
        String[] kelimeler =str.split( " ");
        System.out.println(Arrays.toString(kelimeler));

        String[] kelimelerNe= str.split( "ne");
        System.out.println(Arrays.toString(kelimelerNe));

        String[] kelimelere= str.split( "e");
        System.out.println(Arrays.toString(kelimelere));

        String[] karakterler= str.split( "");
        System.out.println(Arrays.toString(karakterler));


    }
}
