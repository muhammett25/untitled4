package day32_StringBuilder;

public class C08_Equals {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");
        String str="Java";

        System.out.println(sb1.equals(sb2));
        System.out.println(sb1.equals(sb1));
    }
}
