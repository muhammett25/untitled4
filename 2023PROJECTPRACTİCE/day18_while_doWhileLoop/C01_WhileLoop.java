package day18_while_doWhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {

        int sayi=7;
        while (sayi<10){
            System.out.println(sayi);

            sayi++;
        }
        sayi=7;

        do{
            System.out.println(sayi);
            sayi++;
        }while (sayi<10);
    }
}
