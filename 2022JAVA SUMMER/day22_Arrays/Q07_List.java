package day22_Arrays;

import java.util.ArrayList;
import java.util.List;

public class Q07_List {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(7);
        System.out.println(sayilar);

        sayilar.add( 2, 10);
        System.out.println(sayilar);


    }
}
