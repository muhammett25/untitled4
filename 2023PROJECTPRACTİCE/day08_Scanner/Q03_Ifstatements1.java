package day08_Scanner;

public class Q03_Ifstatements1 {
    public static void main(String[] args) {
        int not = 85;

        if (not>=90 && not<=100){
            System.out.println("A");

        }else if(not<90 && not>=80){
            System.out.println("B");
        }else if(not<80 && not>=70){
            System.out.println("C");
        }else if(not<70 && not>=60){
            System.out.println("D");
        }else {
            System.out.println("F");

        }
    }
}
