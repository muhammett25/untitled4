package day24_arrayLists_ForeachLoop;

import java.util.ArrayList;
import java.util.List;

public class C06_ForeachLoop {
    public static void main(String[] args) {

        int[] arr={2,3,4,6,23,6,8,9,1};
        List<Integer> liste=new ArrayList<>();

        for (int each: arr) {
            if (each%2==1){
                liste.add(each);
            }
        }
        System.out.println(liste);
    }
}
