package day17_nestedForLoop;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {

        int toplam=0;
        int sayi=0;
        int sayac=0;
        Scanner scan=new Scanner(System.in);

        while (toplam<500){
            System.out.println("Lutfen toplamakicin sayi grin");
            sayi=scan.nextInt();
            toplam+=sayi;
            sayac++;

        }
        System.out.println(sayac + "sayi girdiniz ve toplamlari :" + toplam);
    }
}
