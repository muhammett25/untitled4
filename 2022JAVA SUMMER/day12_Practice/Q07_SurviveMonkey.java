package day12_Practice;

public class Q07_SurviveMonkey {

    /* Adada yalnız bir maymun var
    Her gün 4 muz yemesi gerekiyor
    o adada sadece 165 muz var
    Aşağıdaki değişkenleri oluşturun ve kaç gün olduğunu bulun
    maymun hayatta kalabilir.
            Do while döngüsü, artırma ve eksiltme ve if deyimlerini kullanın
    int Muz Sayısı =165, hayatta kalmaDays = 1;
    boolean maymunAlive = true;

     */
    public static void main(String[] args) {
         int numberofBananas=165,survivalDays=1;
         boolean monkeyAlive=true;
         do {
              System.out.println("maymunlar gunde 4 muz yer");
              numberofBananas-=4;
              survivalDays++;
              if (numberofBananas<4){
                   monkeyAlive=false;
                   System.out.println("bugun" + survivalDays +".gun muz kalmadi,maymun sizlere omur...");

              }else
                   System.out.println("bugun" +survivalDays + " gun, maymun halen hayatta...:)");

         }while (monkeyAlive);
         System.out.println("toplam yasadigi gun sayisi: " + (survivalDays-1));
    }
}
