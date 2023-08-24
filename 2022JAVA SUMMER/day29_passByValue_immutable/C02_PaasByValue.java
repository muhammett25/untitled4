package day29_passByValue_immutable;

import java.util.Arrays;
import java.util.Random;

public class C02_PaasByValue {
    public static void main(String[] args) {

        int[] arr={5,6,9,12};
        arrayiDegistir(arr);
        System.out.println("method call'dan sonra main methodda array:" + Arrays.toString(arr));
    }

    public static void arrayiDegistir(int[] arr) {

        arr= new int[5];
        Random rnd=new Random();
        arr[0]= rnd.nextInt(100);
        arr[1]= rnd.nextInt(100);
        arr[2]= rnd.nextInt(100);
        System.out.println("method'da array: " + Arrays.toString(arr));
    }
}
