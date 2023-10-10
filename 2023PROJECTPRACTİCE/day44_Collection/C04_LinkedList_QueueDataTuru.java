package day44_Collection;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkedList_QueueDataTuru {
    public static void main(String[] args) {

        Queue<String> ll3=new LinkedList();
        ll3.add("Adem");
        ll3.add("Zeynep");
        ll3.add("Hpolat");
        ll3.add("Kadir");

        System.out.println(ll3);

        System.out.println(ll3.remove());

        System.out.println(ll3);

        System.out.println(ll3.remove("Hpolat"));

        System.out.println(ll3);// Zeynep
        System.out.println(ll3.element());//Zeynep
        System.out.println(ll3.peek());//Zeynep

        Queue<String> ll4=new LinkedList();

        System.out.println(ll4.peek());//null

        ll3.offer("Ahmet");
        ll3.offer("Sefa");
        System.out.println(ll3);
        System.out.println(ll3.poll());
        System.out.println(ll3);
        System.out.println(ll3);

        System.out.println(ll4.poll());

    }
}