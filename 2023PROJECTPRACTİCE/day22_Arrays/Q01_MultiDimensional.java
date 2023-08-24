package day22_Arrays;

import java.util.Arrays;

public class Q01_MultiDimensional {
    public static void main(String[] args) {

        int[][] sayilar= {{1,2,3,4,5},{3,6,}};
        System.out.println(sayilar[0]);
        System.out.println(Arrays.toString(sayilar[1]));

        System.out.println(sayilar[0][1]);
        System.out.println(sayilar[1][0]);

        System.out.println(Arrays.toString(sayilar));
        System.out.println(Arrays.deepToString(sayilar));

    }
}
