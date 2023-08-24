package day10_Practice;

import java.util.Scanner;

public class Q04_doWhileLoop {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String word="";
        do {
            System.out.println("lutfen bir kelime giriniz:");
            word=scan.nextLine();
            if (word.length()<3){
                System.out.println("girilen word 3 karakterden az");

            }if (word.length()%2==1 && word.length()>=3){
                System.out.println("ortadaki karakter" +word.length()/2);

            }else {
                System.out.println("You entered wrong word.");
            }
        }while (word.length()%2==1 && word.length()>=3);
    }
}
