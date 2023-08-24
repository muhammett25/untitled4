package Day2_Practice;

import java.util.Scanner;

public class Q05_StringManipulation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("metre ve km ye donusturmek istediginiz cm degeriniz giriniz :");
        double santiMetreValue= scan.nextDouble();
        convertSm(santiMetreValue);

        }

    private static void convertSm(double santiMetreValue) {
        double meter= santiMetreValue/100;
        double kMeter= santiMetreValue/100000;
        System.out.println("girdiginiz santimetre degeri:" +santiMetreValue + " :" +meter +"m dir," + kMeter + "km dir");

    }
}

