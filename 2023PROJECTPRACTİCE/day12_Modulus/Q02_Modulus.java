package day12_Modulus;

import java.util.Scanner;

public class Q02_Modulus {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("gidiceginiz yol mesafesi(km) :");
        double yol = scan.nextDouble();

        System.out.println("ortalama hiziniz (km/sa) :" );
        double ort_hiz = scan.nextDouble();

        double varis_suresi = yol/ort_hiz;
        System.out.println("varis sureniz :" +varis_suresi + "sa");


    }
}
