package Day13_interviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        /*
 Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
 0-1-1-2-3-5-8-13-21-34....
 */

        List<Integer> fibonacilist = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi gir");
        int sayi =scan.nextInt();
        fibonacilist.add(0);
        fibonacilist.add(1);
        System.out.println("fibonacilist= " + fibonacilist);

        int i=1;

        if (sayi<=1){
            System.out.println("daha buyuk sayilar gir");
        }else{
            while (fibonacilist.get(i)<sayi){
                fibonacilist.add(fibonacilist.get(i)+fibonacilist.get(i-1));
                i++;
            }
            System.out.println("fibonacilist= " + fibonacilist);

        }
        int sonIndextekiEleman=fibonacilist.size()-1;
        if (fibonacilist.get(sonIndextekiEleman)>sayi){
            fibonacilist.remove(sonIndextekiEleman);
            System.out.println("girdiginiz sayi kadar ki fibonacci dizisi budur =" + fibonacilist);
        }else {
            System.out.println("senin giridigin sayi fibonacci listinde var fibonacilist=" + fibonacilist);
        }
    }
}
