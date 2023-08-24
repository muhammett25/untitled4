package day24_arrayLists_ForeachLoop;

import java.util.Arrays;
import java.util.List;

public class C01_ArraydenArrayListsYapmak {
    public static void main(String[] args) {
        String[] arr ={"Ismail", "Nurullah","Fatih"};

        List<String> sinifList = Arrays.asList(arr);
        System.out.println(sinifList);

        arr[1] ="Emre";
        System.out.println("degisim sonrasi array:" +Arrays.toString(arr));
        System.out.println("Array'i degistrince list:" +sinifList);

        sinifList.set(0,"Utku");
        System.out.println("List'i degistirince list:" + sinifList);
        System.out.println("List'i degistirince array:" + Arrays.toString(arr));
    }
}
