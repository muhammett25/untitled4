package day21_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_ArrayOlustur {
    public static void main(String[] args) {
        int[] sayilar=arrayOlustur();

        System.out.println(Arrays.toString(sayilar));

    }

    private static int[] arrayOlustur() {
        Scanner scan= new Scanner(System.in);
        System.out.println("Kac elemanli bir array olusturmami istersiniz");
        int uzunluk=scan.nextInt();
        int[] olusturlan = new int[uzunluk];

        int sayi=0;
        for (int i = 0; i < uzunluk; i++) {
            System.out.println(i+".index icin sayi giriniz");
            sayi= scan.nextInt();
            olusturlan[i]= scan.nextInt();

        }



        return olusturlan;

    }
}
