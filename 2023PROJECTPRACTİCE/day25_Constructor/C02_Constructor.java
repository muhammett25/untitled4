package day25_Constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_Constructor {
    public static void main(String[] args) {

        C01 obj1= new C01();

        Scanner scan= new Scanner(System.in);
        Random rnd= new Random();
        List<String> list= new ArrayList<>();
         //List<String> list2= new List<>();



        System.out.println(obj1.sayi);
        obj1.deneme();

    }
}
