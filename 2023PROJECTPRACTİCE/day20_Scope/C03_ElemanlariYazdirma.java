package day20_Scope;

import java.util.Arrays;

public class C03_ElemanlariYazdirma {
    public static void main(String[] args) {

        int sayilar[]={1,2,3,4,5,6,7,};

        System.out.println(Arrays.toString(sayilar));

        for (int i = 0; i < sayilar.length; i++) {
            if (i!=sayilar.length-1){
                System.out.print(sayilar[i]+ ", ");
            }else{
                System.out.println(sayilar[i]);
            }
        }
    }
}
