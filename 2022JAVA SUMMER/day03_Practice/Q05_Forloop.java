package day03_Practice;

import java.util.Scanner;

public class Q05_Forloop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("1 den buyuk bir tamsayi giriniz");
        int sayi = scan.nextInt();
        int toplam= 0;

        for (int i = 1; i <sayi ; i++) {
            toplam+=(i+1);

        }
        System.out.println("sayilarin kareleri toplami:" + toplam);

    }
}
