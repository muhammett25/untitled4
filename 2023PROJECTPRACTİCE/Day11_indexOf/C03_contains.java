package Day11_indexOf;

import java.util.Locale;

public class C03_contains {
    public static void main(String[] args) {


        String cumle="Java buyk, dunya kucuk";
        cumle=cumle.toLowerCase();




        if (cumle.contains("kucuk")){
            System.out.println(cumle.toLowerCase());
        } else if (cumle.contains("buyuk")){
            System.out.println(cumle.toLowerCase());
        } else if(cumle.contains("kucuk") && cumle.contains("buyuk") ){
            System.out.println("Karar ver buyuk mu yazdirayim, kucuk");
        } else {
            System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor");


        }
    }
}
