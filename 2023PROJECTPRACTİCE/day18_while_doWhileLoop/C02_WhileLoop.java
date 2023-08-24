package day18_while_doWhileLoop;

import java.util.Scanner;

public class C02_WhileLoop {
    public static void main(String[] args) {
        int bas = 9;
        int bitis = 190;

        int temp = bas;
        while (temp<bitis){

            if (temp%7==0) {
                System.out.println(temp + " ");
            }
            temp++;

        }
        do {
            if (temp%7==0) {
                System.out.print(temp + " ");

            }
        }while (temp<bitis);


    }
}
