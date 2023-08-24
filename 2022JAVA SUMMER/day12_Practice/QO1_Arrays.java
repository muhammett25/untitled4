package day12_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class QO1_Arrays {
    public static void main(String[] args) {
        
        farkiniBul();
        
    }

    private static void farkiniBul() {
        Scanner scan= new Scanner(System.in);
        System.out.println("array uzunlugunu giriniz: " );
        int uzunluk= scan.nextInt();
        int arr[] =new int[uzunluk];

        for (int i = 0; i < uzunluk; i++) {
            System.out.println("arrayin " +(i+1) + ". elemanini giriniz:");
            arr[i]= scan.nextInt();

        }

        Arrays.sort(arr);
        System.out.println("arraydeki en buyuk eleman ile en kucuk eleman arasindaki fark :" + (arr[uzunluk-1]-arr[0]));

        //odev : bu soruyu Math classi kullanarak cozunuz...
    }
}
