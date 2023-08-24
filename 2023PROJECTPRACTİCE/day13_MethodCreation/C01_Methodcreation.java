package day13_MethodCreation;

public class C01_Methodcreation {
    public static void main(String[] args) {
        String str1 = "$13.99";
        String str2 = "$10.55";

        str1 = str1.replace("$", "");
        str2 = str2.replace("$", "");

        double sayı1= Double.parseDouble(str1);
        double sayı2 =Double.parseDouble(str2);

        System.out.println("$" + (sayı1+sayı2));
    }

}
