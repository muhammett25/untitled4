package day10_Practice;

import java.util.Scanner;

public class Q08_Arrays {
    public static void main(String[] args) {

        int[] arr= new int[8];
        Scanner oku= new Scanner(System.in);
        int count=0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + ".indexdeki sayiyi giriniz:");
            arr[i] = oku.nextInt();
            if (arr[i]%3==0) {
                System.out.println(arr[i]);
                count++;
            }
        }
        System.out.println("3 e bolunebilen sayi :" + count);
    }
}
