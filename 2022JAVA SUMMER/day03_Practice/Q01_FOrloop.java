package day03_Practice;

public class Q01_FOrloop {
    public static void main(String[] args) {
        int toplam =0;
        for (int i = 1; i <=100 ; i++) {
            toplam += i;

        }
        System.out.println(toplam);
        int bas =20;
        int bitis= 61;
        for (int i = bas; i <bitis ; i+=3) {
            System.out.print(i + " ");
        }
        System.out.println("");

        int input = 100;
        for (int i = 100; i >=1 ; i--) {
            if (i%3==0) {
                System.out.print(i + " ");
            }

        }
    }
}
