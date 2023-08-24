package day08_Scanner;

import java.util.Scanner;

public class Q02_Ifstatements2 {
    public static void main(String[] args) {
        System.out.println("Lutfen is unvaninizi giriniz :");
        Scanner scan = new Scanner(System.in);
        String jobTitle = scan.nextLine().toLowerCase();


        if(jobTitle.equals("qa")){
            System.out.println("Quality Analyst");
        }else if(jobTitle.equals("dev")){
            System.out.println("Developer");
        }else if(jobTitle.equals("ba")){
            System.out.println("Business Analyst");
        }else if(jobTitle.equals("pm")){
            System.out.println("Project Manager");
        }else System.out.println("yalnis formatta jobtittle bilgisi girdiniz...");


        switch (jobTitle){
            case "qa":
                System.out.println("Quality Analyst");
                break;
            case "dev":
                System.out.println("Developer");
                break;
            case "ba":
                System.out.println("Business Analyst");
                break;
            case "pm":
                System.out.println("Project Manager");
                break;
            default:
                System.out.println("yalnis formatta jobtittle bilgisi girdiniz...");
                break;
        }


    }
}
