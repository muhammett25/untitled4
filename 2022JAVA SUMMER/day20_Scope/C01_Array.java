package day20_Scope;

import java.util.Arrays;

public class C01_Array {

    public static void main(String[] args) {

        int sayilar []=new int[3];

        System.out.println(sayilar);  //{0, 0, 0,}

        System.out.println(Arrays.toString(sayilar));
        sayilar [2]=10;
        sayilar [0]=5;
        sayilar [1]=3;


        System.out.println(sayilar);
        System.out.println(Arrays.toString(sayilar));

        String siniflist[]={"Ali","Ayse","Ahmet"};
        System.out.println(Arrays.toString(siniflist));
        siniflist[1]="Hasan";
        System.out.println(Arrays.toString(siniflist));
        System.out.println(siniflist[1]);
        System.out.println(siniflist[0]);
    }
}
