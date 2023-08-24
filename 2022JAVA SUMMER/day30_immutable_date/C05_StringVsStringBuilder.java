package day30_immutable_date;

import java.time.LocalTime;

public class C05_StringVsStringBuilder {
    public static void main(String[] args) {
        /*
String mi yoksa stringBuilder mi daha hizlidir ?
bunun icin bit string olusturup 1000 kere sonuna . ekleyelim
oncesinde ve sonrasinda zamani alip
aradaki farki bulalim

ayni islemi string builder icin de yapalim
 */

        LocalTime baslangic=LocalTime.now();
        StringBuilder sb = new StringBuilder("Ahhhhh Java");
        for (int i = 0; i < 10000; i++) {
            sb.append(".");

        }
         LocalTime bitis=LocalTime.now();
        System.out.println(baslangic);
        System.out.println(bitis);

        System.out.println("String zaman :" + (bitis.getNano()-baslangic.getNano()));

    }
}
