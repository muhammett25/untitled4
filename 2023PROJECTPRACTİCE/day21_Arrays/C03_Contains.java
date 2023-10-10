package day21_Arrays;

import java.util.Scanner;

public class C03_Contains {
    public static void main(String[] args) {

        String[] isimler= {"Basak", "Nurullah", "Fatih", "Adem", "Enes"};
        Scanner scan= new Scanner(System.in);
        System.out.println("Aradiginiz ismi yaziniz");
        String arananIsim=scan.nextLine();

        boolean sonuc= contains(isimler,arananIsim);
        if (sonuc){
            System.out.println("Girilen isim listede var");
        } else {
            System.out.println("Girilen isim listede yok");
        }
    }

    private static boolean contains(String[] isimler, String arananIsim) {
        boolean sonucMethod= false;
        for (int i = 0; i < isimler.length; i++) {
            if (isimler[i].equals(arananIsim)){
                sonucMethod=true;
            }

        }

        return sonucMethod;
    }
}
