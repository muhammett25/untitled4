package day43_interfaces_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M03_Iterator {
    public static void main(String[] args) {

        List<Integer> liste=new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println(liste);

        for (Integer each: liste) {
            each+=3;
            System.out.println(each +" ");
        }
        System.out.println("");
        System.out.println(liste);

        Iterator it1=liste.iterator();
        System.out.println(it1.next());
        System.out.println(it1.next());
        System.out.println(it1.next());

        Iterator it2=liste.iterator();
        it2.next();
        it2.remove();
        it2.next();
        it2.remove();
        it2.next();
        it2.remove();
        System.out.println(liste);

        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println("yeniden liste :" + liste);

        System.out.println(liste);
        Iterator it3=liste.iterator();
        while (it3.hasNext()) {
            it3.next();
            it3.remove();

        }
        System.out.println("loop'dan sonra liste :" + liste);
    }
}
