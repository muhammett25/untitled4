package day09_Practice;

public class Q07_NestedIfandTernary {
    public static void main(String[] args) {
          /*
   0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
  kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
  cikis "Gecersiz" olmalidir
  NestedIf ve Ternary kullanarak 2 yolla da cozunuz
*/
        
        int sayi = 5;
        String sonuc = "";
        if(sayi>=0 && sayi<=9){
            if(sayi==9){sonuc="dokuz";}
            else if(sayi==8){sonuc="sekiz";}
            else if(sayi==7){sonuc="yedi";}
            else if(sayi==6){sonuc="alti";}
            else if(sayi==5){sonuc="bes";}
            else if(sayi==4){sonuc="dort";}
            else if(sayi==3){sonuc="uc";}
            else if(sayi==2){sonuc="iki";}
            else if(sayi==1){sonuc="bir";}
            else sonuc="sifir";
        }else sonuc="gecersiz";
        System.out.println("sonuc = " + sonuc);
    }
}
