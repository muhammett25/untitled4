package day29_passByValue_immutable;

public class C04_Immutable {
    public static void main(String[] args) {

        String str="Yildiz Bank";
        System.out.println(str.toUpperCase());


        str.toLowerCase();
        System.out.println(str);


        str.toLowerCase();
        System.out.println(str.toLowerCase());


        str.substring(3,5);
        System.out.println(str);


        StringBuilder sb=new StringBuilder("Java Bank");
        System.out.println(sb);


        sb.reverse();
        System.out.println(sb);

        sb.append(".");
        System.out.println(sb);

    }
}
