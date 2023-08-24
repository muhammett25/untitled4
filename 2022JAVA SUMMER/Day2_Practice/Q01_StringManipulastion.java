package Day2_Practice;

import java.util.Scanner;

public class Q01_StringManipulastion {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        String str =scan.nextLine();
        int bosluk = str.indexOf(" ");

        if (bosluk == -1 && !(str.isEmpty())) {
            System.out.println("bosluk yoktur");

        }else {
            System.out.println("bosluk vardir");
        }
    }
}
