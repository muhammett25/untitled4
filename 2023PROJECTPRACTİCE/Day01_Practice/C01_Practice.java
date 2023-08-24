package Day01_Practice;

import java.util.Scanner;

public class C01_Practice {
    public static void main(String[] args) {
        String burc="";
        boolean isErr = false;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kacinci ayda dogdunuz : ");
        int month = scan.nextInt();
        System.out.print("Hangi gun dogdunuz : ");
        int day = scan.nextInt();
        switch (month) {
            case 1 :
                if (day>=1 && day<=31){
                    if (day<22){
                        burc="Oglak";
                    }else {
                        burc = "Kova";
                    }
                }else
                    isErr=true;
                break;
            case 2:
                if (day>=1 && day<=28){
                    if (day<20){
                        burc="Kova";
                    }else
                        burc="Balik";
                }else
                    isErr=true;
                break;
            case 3:
                if (day>=1 && day<=31){
                    if (day<21){
                        burc="Balik";
                    }else
                        burc="Koc";
                }else
                    isErr=true;
                break;
            case 4:
                if (day>=1 && day<=30){
                    if (day<21){
                        burc="Koc";
                    }else
                        burc="Boga";
                }else
                    isErr=true;
                break;
            case 5:
                if (day>=1 && day<=31){
                    if (day<22){
                        burc="Boga";
                    }else
                        burc="Ikizler";
                }else
                    isErr=true;
                break;
            case 6:
                if (day>=1 && day<=30){
                    if (day<23){
                        burc="Ikizler";
                    }else
                        burc="Yengec";
                }else
                    isErr=true;
                break;
            case 7:
                if (day>=1 && day<=31){
                    if (day<23){
                        burc="Yengec";
                    }else
                        burc="Aslan";
                }else
                    isErr=true;
                break;
            case 8:
                if (day>=1 && day<=31){
                    if (day<23){
                        burc="Aslan";
                    }else
                        burc="Basak";
                }else
                    isErr=true;
                break;
            case 9:
                if (day>=1 && day<=30){
                    if (day<23){
                        burc="Basak";
                    }else
                        burc="Terazi";
                }else
                    isErr=true;
                break;
            case 10:
                if (day>=1 && day<=31){
                    if (day<23){
                        burc="Terazi";
                    }else
                        burc="Akrep";
                }else
                    isErr=true;
                break;
            case 11:
                if (day>=1 && day<=30){
                    if (day<23){
                        burc="Akrep";
                    }else
                        burc="Yay";
                }else
                    isErr=true;
                break;
            case 12:
                if (day>=1 && day<=31){
                    if (day<22){
                        burc="Yay";
                    }else
                        burc="Oglak";
                }else
                    isErr=true;
                break;
            default:
                isErr=true;
        }
        if (isErr){
            System.out.println("Hatali Giris Yaptiniz!");
        }else
            System.out.println("Burcunuz : " + burc);
    }
}
