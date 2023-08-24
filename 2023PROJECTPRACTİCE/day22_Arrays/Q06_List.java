package day22_Arrays;

import java.util.ArrayList;
import java.util.List;

public class Q06_List {
    public static void main(String[] args) {


        List<String> isimler= new ArrayList<>();
        System.out.println(isimler);
        isimler.add("Basak");

        System.out.println(isimler.add("Ayse"));
        System.out.println(isimler);
    }
}
