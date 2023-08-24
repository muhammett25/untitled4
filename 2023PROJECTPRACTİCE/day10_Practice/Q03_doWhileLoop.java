package day10_Practice;

import java.util.Scanner;

public class Q03_doWhileLoop {
    public static void main(String[] args) {
        Scanner abc= new Scanner(System.in);

        String okunan;
        do {
            System.out.println("harf giriniz:");
            okunan=abc.next();
            System.out.println("Program calisiyor");
        }while (!okunan.equalsIgnoreCase( "x"));
        System.out.println("program bitti");
    }
}
