package day30_immutable_date;

import java.util.ArrayList;
import java.util.List;

public class C01_ImmutableClass {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Kenan");
        list.add("Enes");
        list.add("Ismail");
        System.out.println(list);

        list.set(1,"Yasmin");
        System.out.println(list);

        list.remove("Ismail");
        System.out.println(list);
    }
}
