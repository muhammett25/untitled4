package day10_Practice;

import java.util.Arrays;

public class Q06_Arrays {
    public static void main(String[] args) {
        String str ="Heysiri";
        str=str.replace("Hey", "Bye");
        String[] arr= new String[1];
        arr[0]=str;
        System.out.println(Arrays.toString(arr));
    }
}
