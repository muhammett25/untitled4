package day03_Practice;

public class Q02_FOrloop {
    public static void main(String[] args) {
    //    System.out.println("for ile");
    //    for (int i = 0; i <=300 ; i++) {
    //        char c = (char) i;
    //        System.out.println(i + "->" + c);
    //    }
    //    System.out.println("while ile");
    //    int i = 0;
    //    while (i<=300){
    //        char sembol = (char) i;
    //        System.out.println(i + "-" + sembol);
    //        i++;

    //    }
        System.out.println("do while");
        int a= 0;
        do {
            char karakter = (char) a;
            System.out.println(a + " " + karakter);
            a++;
        }while (a<=300);

    }
}
