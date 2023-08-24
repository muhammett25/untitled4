package Day10_StringMonupulation;

public class C04_Length {
    public static void main(String[] args) {

        String str = "Java ogren, isi kap";

        System.out.println(str.length());

        System.out.println(str.charAt(str.length()-1));

        System.out.println(str.charAt(str.length()-3));

        String str2 = "";
        System.out.println(str2.length());

        String str3 = null;
        System.out.println(str3.length());
    }
}
