package day16_forloop;

import java.util.Scanner;

public class C04_ForLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 100'den kucuk bir pozitif tamsayi giriniz");
        int sayi=scan.nextInt();

        for (int i = 1; i <=sayi ; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Java Guzeldir" + " ");
            } else if (i % 5 == 0) {
                System.out.println("Guzeldir" + " ");
            } else if (i % 3 == 0) {
                System.out.println("Java" + " ");
            } else {
                System.out.println(i + " ");
            }
        }
    }
}
