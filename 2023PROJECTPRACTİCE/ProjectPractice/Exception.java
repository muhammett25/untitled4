package ProjectPractice;

public class Exception {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        try {
            System.out.println(a/b);

        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println("Kod calismaya devam ediyor");

    }
}