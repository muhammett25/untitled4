package day03_Practice;

import java.util.Scanner;

public class Q04_FOrloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz :");
        String harf = scanner.next().toLowerCase();
        String sesliHarfler = "aeiou";
        String sessizHarfler = "bcdfghjklmnpqrstxvwyz";
        if(harf.length()==1){
            for (int i = 0; i < sesliHarfler.length() ; i++) {
                if(sesliHarfler.contains(harf)){
                    System.out.println("sesli harf");
                    break;
                }else if(sessizHarfler.contains(harf)){
                    System.out.println("sessiz harf");
                    break;
                }else {
                    System.out.println("yanlis karakter girdiniz");
                    break;
                }
            }
        }else System.out.println("tek karakter giriniz");
    }
}
