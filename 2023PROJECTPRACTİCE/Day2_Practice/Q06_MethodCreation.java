package Day2_Practice;

import java.util.Scanner;

public class Q06_MethodCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("47 den kucuk bir tamsayi giriniz :");

        int sayi = scanner.nextInt();
        fibonacci(sayi);

    }

    private static void fibonacci(int sayi) {
        int sayi1= 0;
        int sayi2= 1;
        int sayi3;
        System.out.println(sayi1+" ");
        System.out.println(sayi2+" ");
        if (sayi1<47){
            for (int i=2; i<sayi; i++) {
                sayi3 = sayi1 + sayi2;
                System.out.println(sayi3 + " ");
                sayi1 = sayi2;
                sayi2 = sayi3;
            }
        }else System.out.println("47 den kucuk bir sayi giriniz...");
    }
}
