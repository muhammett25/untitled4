package day12_Practice;

import java.util.ArrayList;
import java.util.List;

public class Q03_ArrayList {
    public static void main(String[] args) {
        int[] arr = {2,5,-9,45,43,11,8,102,47,0};
        int n=4;

        List<Integer> list = new ArrayList<>();

        for (int each: arr) {
            list.add(each);
        }
        List<Integer> maxList= new ArrayList<>();
        int count=1;
        while (count<=n){
            int max = list.get(0); // list in iilk eleman, max olsun
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i)>max && !(maxList.contains(list.get(i)))){ // Listenin herhangi bir elemani max dan buyukse
                    max=list.get(i); // max artik o eleman olsun
                }

            }
            maxList.add(max);
            list.remove(list.indexOf(max)); // tekrar ayni sayiy bakmamis icin kaldirdik
            count++;

        }
        System.out.println("Array in max" + n + "elemani" + maxList);
    }
}
