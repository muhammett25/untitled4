package day17_nestedForLoop;

public class C02_NestedForLoop {
    public static void main(String[] args) {

        int input=4;
        for (int i = 0; i <=input; i++) {

            for (int j = 0; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");

        }


    }
}
