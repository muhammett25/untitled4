package Day10_StringMonupulation;

import java.util.Locale;

public class C02_toLowerCase {
    public static void main(String[] args) {

        String str= "Beni psikopaata baglamayin";

        System.out.println(str.toUpperCase());

        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")));
    }
}
