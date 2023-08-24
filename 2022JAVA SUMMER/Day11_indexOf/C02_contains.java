package Day11_indexOf;

import java.util.Scanner;

public class C02_contains {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen email yaziniz");
        String email= scan.nextLine();

        if (!email.contains("@gmail")){
            System.out.println("Lutfen adresi giriniz");

        }else if(email.lastIndexOf("@gmail.com")==(email.length()-10)){
            System.out.println("Email adresinizi kaydedildi");
        }else {
            System.out.println("Lutfen yazinizi kontrol ediniz");
        }
    }
}
