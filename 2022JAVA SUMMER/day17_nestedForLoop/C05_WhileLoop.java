package day17_nestedForLoop;

public class C05_WhileLoop {
    public static void main(String[] args) {

        int bas=20;
        int bitis=50;

        for (int i = bas; i <=bitis ; i++) {
            if (i%2==0){
                System.out.println(i + " ");
            }
        }

        int temp=bas;
        while(temp<=bitis){
            if (temp%2==0){
                System.out.println(temp + " ");
            }
            temp++;

        }
    }
}
