package day30_immutable_date;

public class C02_StringHavuzu {
    public static void main(String[] args) {
        String str1="Ali Can";
        String str2=str1+"";
        String str3=new String("Ali Can");
        String hiclik="";
        String str4=str1.concat(hiclik);

        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));

        System.out.println(str1.equals(str3));
        System.out.println(str1==str3);
        System.out.println(str2.equals(str4));
        System.out.println(str2==str4);

        String str5="Ali Can";
        String str6=str1;

        System.out.println(str1.equals(str5));
        System.out.println(str5==str1);

        System.out.println(str1.equals(str6));
        System.out.println(str1==str6);

        System.out.println(str5.equals(str6));
        System.out.println(str5==str6);
    }
}
