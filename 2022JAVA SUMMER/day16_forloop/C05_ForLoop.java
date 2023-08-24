package day16_forloop;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen baslangic ve bitis degerlerini pozitif tamsayi olarak girin");
        int bas= scan.nextInt();
        int bitis= scan.nextInt();
        aralariTopla(bas,bitis);

    }
    public static void aralariTopla(int bas, int bitis){
        int toplam=0;
        if (bas<=bitis){
            for (int i = bas; i <=bitis ; i++) {
                toplam+=i;
            }

        }else{
            for (int i = bitis; i <=bas ; i++) {
                toplam +=i;
            }
        }
        System.out.println("Aradaki sayiarin toplami :" + toplam );

    }
}
