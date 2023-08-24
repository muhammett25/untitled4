package day15_overloading_forloop;

import static day14_MethodCreation.C01_MethodCreation.terstenYazdir;

public class C04_ForLoop {
    public static void main(String[] args) {

        String input="Aygul";

        terstenYazdir(input);
    }



    public static void terstenYazdir(String input) {
        String tersInput=input.substring(input.length()-1);

        for (int i = input.length()-2; i>=0; i--) {
            tersInput+=input.substring(i,i+1);
        }
        System.out.println(tersInput);
    }
}
