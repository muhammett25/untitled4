package day45_collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {


        int [] arr= {4,5,3,6,8,1,9,0,4,2,5,7,9,1,5,4,2,6,10,14};
        int [] arrYeni={4,5,3,6,8,1,2,0,7,9};
        arr=arrYeni;


        Set<Integer> tekrarsizSet= new HashSet<>();

        for (int each: arr) {
            tekrarsizSet.add(each);
        }
        System.out.println("Set: " + tekrarsizSet);
        int[] tekrarsizArr= new int[tekrarsizSet.size()];

        int i=0;
        for (Integer each: tekrarsizSet) {
            tekrarsizArr [i]=each;
            i++;

        }
        arr=tekrarsizArr;
        System.out.println("Bizim Arrayin hali:" + Arrays.toString(arr));
    }
}
