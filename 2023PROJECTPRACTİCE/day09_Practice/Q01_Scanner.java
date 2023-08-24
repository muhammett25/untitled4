package day09_Practice;

import java.util.Scanner;

public class Q01_Scanner {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.print("bir isci isi kac gunde bitirmektedir :");
        double birIsciBitirmeSuresi = scan.nextDouble();
        System.out.print("toplam kac isci calisacak :");
        double isci_Sayisi = scan.nextDouble();

        double cokluBitirmeSuresi = birIsciBitirmeSuresi/isci_Sayisi;
        System.out.println("cokluBitirmeSuresi = " + cokluBitirmeSuresi);
    }
}
