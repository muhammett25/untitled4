package day08_Scanner;

import java.util.Scanner;

public class Q02_Ifstatements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Y/N ikilisinden birini giriniz :");
        char karakter = scan.next().charAt(0);

        if (karakter=='Y' || karakter=='y' ){
            System.out.println("YES");

        }else if (karakter=='N' || karakter=='n'){
            System.out.println("NO");

        }else System.out.println("yanlis giris yaptiniz, lutfen sadece Y/N ikisinden birini tercih ediniz");


    }
}
