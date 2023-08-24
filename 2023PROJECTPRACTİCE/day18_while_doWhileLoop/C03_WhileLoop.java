package day18_while_doWhileLoop;

import java.util.Scanner;

public class C03_WhileLoop {
    public static void main(String[] args) {

        Scanner scaan= new Scanner(System.in);
        int sayi=0;
        int pozSayiAdedi=0;
        int negSayiAdedi=0;
        int pozSayilarTop=0;

        do {
            System.out.println("Lutfen toplamak uzere pozitif tamsayi giriniz");
            sayi= scaan.nextInt();
            if (sayi>0) {
                pozSayilarTop+=sayi;
                pozSayiAdedi++;

            }else if(sayi>0) {
                pozSayilarTop+=sayi;
                pozSayiAdedi++;
            }else if(sayi<0) {
                negSayiAdedi++;
                System.out.println( "Negatif sayi giremezsiniz");

            }
        }while (sayi!=0);
        System.out.println(pozSayiAdedi+"adet pozitif sayi giriniz, toplamlari :" + pozSayilarTop);
        System.out.println(negSayiAdedi+"adet negatif sayi girdiniz ancak onlar toplama dahil edilmeli");
    }
}
