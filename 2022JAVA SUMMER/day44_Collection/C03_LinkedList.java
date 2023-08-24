package day44_Collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C03_LinkedList {
    public static void main(String[] args) {

        LinkedList lil1=new LinkedList();

        List<String> lil2=new LinkedList();

        Queue<String> lil3= new LinkedList();

        Deque<String> lil4= new LinkedList();

        lil2.add("Berk");
        lil2.add("Done");
        lil2.add("Enes");
        lil2.add("Ayse");


        System.out.println(lil2);

        System.out.println(lil2.remove(3));
        System.out.println(lil2.remove("Enes"));

        System.out.println(lil2.remove("Kemal"));
        System.out.println(lil2.isEmpty());

        lil2.set(1,"Serap");
        System.out.println(lil2);
        lil1.add("Berk");
        lil1.add("Ismail");
        System.out.println(lil1);
        lil2.retainAll(lil1);
        System.out.println(lil2);

        System.out.println(lil2.hashCode());

    }
}