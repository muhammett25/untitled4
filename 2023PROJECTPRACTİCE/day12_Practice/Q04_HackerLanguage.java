package day12_Practice;

import java.util.Scanner;

public class Q04_HackerLanguage {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("bir cumle giriniz :");
        String cumle = scan.nextLine().toLowerCase();

        hackerdili(cumle);
    }

    private static void hackerdili(String cumle) {
        String arr[] =new String[cumle.length()];
        for (int i = 0; i < cumle.length(); i++) {
            arr[i] = cumle.substring(i,i+1);


            if (arr[i].contains("s")){
                arr[i]="5";

            }
            if (arr[i].contains("a")){
                arr[i]="3";
            }
            if (arr[i].contains("i")) {
                arr[i] = "1";
            }
            if (arr[i].contains("o")) {
                arr[i] = "0";

            }
            System.out.print(arr[i]);
        }


    }
}
