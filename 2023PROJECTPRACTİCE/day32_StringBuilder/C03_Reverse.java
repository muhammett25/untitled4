package day32_StringBuilder;

public class C03_Reverse {
    public static void main(String[] args) {

        String input="Hey gidi for loop gunleri";

        String tersInput= tersinecevir(input);
        System.out.println(tersInput);
    }

    private static String tersinecevir(String input) {

        StringBuilder sb=new StringBuilder(input);

        return sb.reverse().toString();
    }
}
