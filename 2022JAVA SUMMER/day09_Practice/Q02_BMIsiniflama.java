package day09_Practice;

import java.util.Scanner;

public class Q02_BMIsiniflama {
    public static void main(String[] args) {


         /*
         *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
         *
        BMI = kilo(kg) /(boy*boy)(m)
        BMI <=20 oldukca zayifsiniz
        20<BMI<=25 Normal sinirlardasiniz
        25<BMI<=30 Sisman kategorisindesiniz
        30<BMI ==> Obez grubundasiniz.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("boyunuzu cm olarak giriniz :");
        double boy = scan.nextDouble();


        System.out.println("kilonuzu kg olarak giriniz :");
        double kilo = scan.nextDouble();


        double bmi=kilo/(boy*boy);

        if(bmi<=20){
            System.out.println("bmi indexiniz " +bmi +"oldukca zayifsiniz");
        }else if(bmi<=25){
            System.out.println("bmi indexiniz " +bmi +"normal sinirlardasiniz");
        }else if(bmi>30){
            System.out.println("bmi indexiniz" + bmi +"obez grubundasiniz");
        }

    }
}
