package day44_Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C01_ListIterator {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(13);
        list.add(56);
        list.add(23);
        list.add(45);
        list.add(14);
        list.add(40);

        ListIterator lil= list.listIterator();
        while (lil.hasNext()) {
            lil.next();

        }
        while (lil.hasPrevious()){
            System.out.println(lil.previous()+ " ");
        }

    }
}
